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
import Bsccl.Main.User;


/**
 *
 * @author User
 */
public class packagebuy   implements Serializable {
    private static final long serialVersionUID = 15L;
    private String userid;
    private String UserName;
    private LocalDate dobbuyingpackage;
    private String packagedetail;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }


    private String amount;

  

    public String getUserid() {
        return userid;
    }

   

    public LocalDate getDobbuyingpackage() {
        return dobbuyingpackage;
    }

    public String getPackagedetail() {
        return packagedetail;
    }

    public String getAmount() {
        return amount;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

  
    

    public void setDobbuyingpackage(LocalDate dobbuyingpackage) {
        this.dobbuyingpackage = dobbuyingpackage;
    }

    public void setPackagedetail(String packagedetail) {
        this.packagedetail = packagedetail;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public packagebuy(String userid, String UserName, LocalDate dobbuyingpackage, String packagedetail, String amount) {
        this.userid = userid;
        this.UserName = UserName;
        this.dobbuyingpackage = dobbuyingpackage;
        this.packagedetail = packagedetail;
        this.amount = amount;
    }
    public void display(){
        System.out.println("Id="+userid+", Name="+UserName+", DoB="+dobbuyingpackage+", packagedetail="+packagedetail+", Amount="+amount);
    }
    
  
    
    
    
}
