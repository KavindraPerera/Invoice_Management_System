/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Invoice {
    private int invoiceNumber;
    private Customer customer;
    private int totalUnit;
    private BigDecimal totalPrice;
    private BigDecimal discount;
    private String invoiceDate;
    private List<Product> products;

    public Invoice() {
    }

    public Invoice(int invoiceNumber, Customer customerId, int totalUnit, BigDecimal totalPrice, BigDecimal discount, String invoiceDate, List<Product> products) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customerId;
        this.totalUnit = totalUnit;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.invoiceDate = invoiceDate;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNumber=" + invoiceNumber + ", customerId=" + customer + ", totalUnit=" + totalUnit + ", totalPrice=" + totalPrice + ", discount=" + discount + ", invoiceDate=" + invoiceDate + ", products=" + products + '}';
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

   

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
}
