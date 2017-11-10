/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

            statement.setInt(1, invoice.getCustomerId().getCustomerId());
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

  
}
