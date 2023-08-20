/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author User
 */
public class Bill implements Serializable {
    private static final long serialVersionUID = 13L;
    private LocalDate createdDate, dueDate;
    private boolean paidStatus;
    private Float amount;
    private String details;
    private int customerID;

    public Bill(LocalDate createdDate, LocalDate dueDate, boolean paidStatus, Float amount, String details, int customerID) {
        this.createdDate = createdDate;
        this.dueDate = dueDate;
        this.paidStatus = paidStatus;
        this.amount = amount;
        this.details = details;
        this.customerID = customerID;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isPaidStatus() {
        return paidStatus;
    }

    public Float getAmount() {
        return amount;
    }

    public String getDetails() {
        return details;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String toString() {
        return "Bill: " + "createdDate=" + createdDate + ", dueDate=" + dueDate + ", paidStatus=" + paidStatus + ", amount=" + amount + ", details=" + details + ", customerID=" + customerID ;
    }
    
    
   
    
    
}

