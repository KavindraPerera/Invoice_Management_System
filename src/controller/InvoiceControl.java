/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Invoice;
import model.Product;

/**
 *
 * @author DELL
 */
public class InvoiceControl {

    public static int addInvoice(Invoice invoice, List<Product> product) {
        PreparedStatement statement;
        try {
            String sqlAddInvoice = "INSERT INTO `invoice`(`Customer_ID`, `Total_Units`, `Total_Price`, `Discount`, `Invoice_Date`) VALUES(?,?,?,?,?)";
            System.out.println(invoice.toString());

            Connection con = DatabaseConnection.getConnection();
            statement = con.prepareStatement(sqlAddInvoice);

            statement.setInt(1, invoice.getCustomer().getCustomerId());
            statement.setInt(2, invoice.getTotalUnit());
            statement.setBigDecimal(3, invoice.getTotalPrice());
            statement.setBigDecimal(4, invoice.getDiscount());
            statement.setDate(5, new java.sql.Date(new Date().getTime()));
            int i = statement.executeUpdate();
            statement = null;

            String sqlAddInvoiceProduct = "INSERT INTO `invoice_product`(`Invoice_Number`,`Product_ID`,`Quantity`,`Unit_Price`) VALUES(LAST_INSERT_ID(),?,?,?)";
            for (Product p : product) {
                statement = con.prepareStatement(sqlAddInvoiceProduct);
                statement.setInt(1, p.getProductId());
                statement.setInt(2, p.getQuantity());
                statement.setBigDecimal(3, p.getSellingPrice());
                i = statement.executeUpdate();
                statement = null;
            }
            return i;
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
        return 0;
    }

    public static List<Invoice> getInvoices() {
        List<Invoice> invoice = new ArrayList<>();
        int c;
        try {
            String sqlgetAllInvoice = "select * from invoice inner join customer on invoice.Customer_ID=customer.Customer_ID";
            Connection con = DatabaseConnection.getConnection();

            PreparedStatement statement = con.prepareStatement(sqlgetAllInvoice);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Invoice a = new Invoice();
                Customer cust = new Customer();
                a.setInvoiceNumber(rs.getInt("Invoice_Number"));
                cust.setCustomerName(rs.getString("Customer_Name"));
                a.setCustomer(cust);
                a.setTotalUnit(rs.getInt("Total_Units"));
                a.setTotalPrice(rs.getBigDecimal("Total_Price"));
                a.setDiscount(rs.getBigDecimal("Discount"));
                a.setInvoiceDate(rs.getDate("Invoice_Date").toString());
                invoice.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoice;
    }

}
