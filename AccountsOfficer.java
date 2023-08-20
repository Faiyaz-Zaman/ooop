/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Bushra.AccountsOfficer;

import java.time.LocalDate;
import java.io.Serializable;
import Bsccl.Main.User;
/**
 *
 * @author DELL
 */
public class AccountsOfficer extends User implements Serializable{
    public AccountsOfficer(String userName, int userID, String password, String email,  String contactNo, String address, LocalDate DOB,LocalDate DOJ) 
    {
        super(userName, userID, password, email, contactNo, address, DOB,DOJ); 
    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public LocalDate getDOJ() {
        return DOJ;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}        

   

