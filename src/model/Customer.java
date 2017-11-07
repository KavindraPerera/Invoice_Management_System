/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String address;
    private String contactNumber;
    private String dateOfBirth;
    private String gender;
    private String customerCreatedDate;
    private String customerLastChangedDate;

    public Customer() {
        
    }

    public Customer(int customerId, String customerName, String customerEmail, String address, String contactNumber, String dateOfBirth, String gender, String customerCreatedDate, String customerLastChangedDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.customerCreatedDate = customerCreatedDate;
        this.customerLastChangedDate = customerLastChangedDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerCreatedDate() {
        return customerCreatedDate;
    }

    public void setCustomerCreatedDate(String customerCreatedDate) {
        this.customerCreatedDate = customerCreatedDate;
    }

    public String getCustomerLastChangedDate() {
        return customerLastChangedDate;
    }

    public void setCustomerLastChangedDate(String customerLastChangedDate) {
        this.customerLastChangedDate = customerLastChangedDate;
    }
}
