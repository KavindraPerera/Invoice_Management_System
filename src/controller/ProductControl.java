/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author DELL
 */
public class ProductControl {

    public static void addProduct(Product p) {
        try {
            String sqladdProduct = "INSERT INTO product(Product_Name,Product_Description,Purchase_Price,Selling_Price,Quantity,Created_Date) VALUES (?,?,?,?,?,?)";

            System.out.println(p.toString());

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement statement = con.prepareStatement(sqladdProduct);
            statement.setString(1, p.getProductName());
            statement.setString(2, p.getDescripion());
            statement.setBigDecimal(3, p.getPurchasePrice());
            statement.setBigDecimal(4, p.getSellingPrice());
            statement.setInt(5, p.getQuantity());
            statement.setDate(6, new java.sql.Date(new Date().getTime()));
            // statement.setString(7,p.getProductLastChangedDate());

            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("addProductControl error " + ex.getMessage());
            System.out.println(ex);
        }
    }

    public static List<Product> getAllProducts() {
        String sqlgetAllProducts = "select * from product";
        Connection con = DatabaseConnection.getConnection();
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sqlgetAllProducts);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("Product_ID"));
                p.setProductName(rs.getString("Product_Name"));
                p.setDescripion(rs.getString("Product_Description"));
                p.setPurchasePrice(rs.getBigDecimal("Purchase_Price"));
                p.setSellingPrice(rs.getBigDecimal("Selling_Price"));
                p.setQuantity(rs.getInt("Quantity"));

                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public static List<Product> getSearchProducts(String a) {

        String sqlgetAllProducts = "select * from product where Product_Name = ? ";
        Connection con = DatabaseConnection.getConnection();
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = con.prepareStatement(sqlgetAllProducts);
            statement.setString(1, a);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Product p = new Product();
                p.setProductId(rs.getInt("Product_ID"));
                p.setProductName(rs.getString("Product_Name"));
                p.setDescripion(rs.getString("Product_Description"));
                p.setPurchasePrice(rs.getBigDecimal("Purchase_Price"));
                p.setSellingPrice(rs.getBigDecimal("Selling_Price"));
                p.setQuantity(rs.getInt("Quantity"));

                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    public static void editProduct(Product p) {
        try {
            String sqleditProduct = "UPDATE `product` SET `Product_Name`=?,`Product_Description`=?,`Purchase_Price`=?,`Selling_Price`=?,`Quantity`=?,`Last_Changed_Date`=? WHERE `Product_ID`=?";

            System.out.println(p.toString());

            Connection con = DatabaseConnection.getConnection();

            PreparedStatement statement = con.prepareStatement(sqleditProduct);
            
            statement.setString(1, p.getProductName());
            statement.setString(2, p.getDescripion());
            statement.setBigDecimal(3, p.getPurchasePrice());
            statement.setBigDecimal(4, p.getSellingPrice());
            statement.setInt(5, p.getQuantity());
            statement.setDate(6, new java.sql.Date(new Date().getTime()));
            statement.setInt(7, p.getProductId());
            // statement.setString(7,p.getProductLastChangedDate());

            statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("addProductControl error " + ex.getMessage());
            System.out.println(ex);
        }
    }
    public static void deleteProduct(Product p1){
        try {
            String sqlDeleteProduct="DELETE FROM `product` WHERE `Product_ID`=?";
            Connection con = DatabaseConnection.getConnection();
            
            PreparedStatement statement = con.prepareStatement(sqlDeleteProduct);
            statement.setInt(1, p1.getProductId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
