/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author DELL
 */
public class Product {
    private int productId;
    private String productName;
    private String descripion;
    private BigDecimal purchasePrice;
    private BigDecimal sellingPrice;
    private int quantity;
    private String productCreatedDate;
    private String productLastChangedDate;

    public Product() {
    }

    public Product(int productId, String productName, String descripion, BigDecimal purchasePrice, BigDecimal sellingPrice, int quantity, String productCreatedDate, String productLastChangedDate) {
        this.productId = productId;
        this.productName = productName;
        this.descripion = descripion;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.productCreatedDate = productCreatedDate;
        this.productLastChangedDate = productLastChangedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductCreatedDate() {
        return productCreatedDate;
    }

    public void setProductCreatedDate(String productCreatedDate) {
        this.productCreatedDate = productCreatedDate;
    }

    public String getProductLastChangedDate() {
        return productLastChangedDate;
    }

    public void setProductLastChangedDate(String productLastChangedDate) {
        this.productLastChangedDate = productLastChangedDate;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", descripion=" + descripion + ", purchasePrice=" + purchasePrice + ", sellingPrice=" + sellingPrice + ", quantity=" + quantity + ", productCreatedDate=" + productCreatedDate + ", productLastChangedDate=" + productLastChangedDate + '}';
    }
    
    
}
