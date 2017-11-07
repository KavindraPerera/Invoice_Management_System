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

/**
 *
 * @author DELL
 */
public class CustomerControl {

    public static void addCustomer(Customer c) {
        try {
            String sqlAddCustomer = "INSERT INTO `customer`(`Customer_Name`, `Customer_Email`, `Address`, `Contact_Number`, `Date_of_Birth`, `Gender`, `Created_Date`) VALUES(?,?,?,?,?,?,?)";
            System.out.println(c.toString());

            Connection con = DatabaseConnection.getConnection();

            System.out.println(c.toString());

            PreparedStatement statement = con.prepareStatement(sqlAddCustomer);
            statement.setString(1, c.getCustomerName());
            statement.setString(2, c.getCustomerEmail());
            statement.setString(3, c.getAddress());
            statement.setString(4, c.getContactNumber());
            statement.setString(5, c.getDateOfBirth());
            statement.setString(6, c.getGender());
            statement.setDate(7, new java.sql.Date(new Date().getTime()));

            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerControl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Customer> getAllCustomer() {
        String sqlgetAllCustomers = "select * from customer";
        Connection con = DatabaseConnection.getConnection();
        List<Customer> customers = new ArrayList<>();
        try {

            PreparedStatement statement = con.prepareStatement(sqlgetAllCustomers);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCustomerId(rs.getInt("Customer_ID"));
                c.setCustomerName(rs.getString("Customer_Name"));
                c.setCustomerEmail(rs.getString("Customer_Email"));
                c.setAddress(rs.getString("Address"));
                c.setContactNumber(rs.getString("Contact_Number"));
                c.setDateOfBirth(rs.getDate("Date_of_Birth").toString());
                c.setGender(rs.getString("Gender"));
               
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;

    }
     public static List<Customer> getSearchCustomer(String c) {

        String sqlgetAllProducts = "select * from customer where Customer_Name = ? ";
        Connection con = DatabaseConnection.getConnection();
        List<Customer> customers = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sqlgetAllProducts);
            statement.setString(1, c);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Customer c1 = new Customer();
                 c1.setCustomerId(rs.getInt("Customer_ID"));
                c1.setCustomerName(rs.getString("Customer_Name"));
                c1.setCustomerEmail(rs.getString("Customer_Email"));
                c1.setAddress(rs.getString("Address"));
                c1.setContactNumber(rs.getString("Contact_Number"));
                c1.setDateOfBirth(rs.getDate("Date_of_Birth").toString());
                c1.setGender(rs.getString("Gender"));

                customers.add(c1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
    
}
