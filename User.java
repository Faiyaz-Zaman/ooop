/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Main;

import Bsccl.Bushra.AccountsOfficer.AccountsOfficer;
import Bsccl.Bushra.DataCentreManager.DataCentreManager;
import Bsccl.Faiyaz.Customer.Customer;
import Bsccl.Faiyaz.Customer.Technicalsupportoperatoruser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class User implements Serializable {
    public String userName;
    public final int userID;
    protected String password;
    public String email;
    protected String contactNo, address;
    protected final LocalDate DOB,DOJ;  

   

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDOJ() {
        return DOJ;
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

  
    

    public User(String userName, int userID, String password, String email,  String contactNo, String address, LocalDate DOB,LocalDate DOJ) {
        this.userName = userName;
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.DOJ = DOJ;
        this.contactNo = contactNo;
        this.address = address;
        this.DOB = DOB;
    }
     public boolean verificataion(String inputname, String inputpass){
        if(userName.equals(inputname) && password.equals(inputpass)){
            return true;
        }
        return false;
    
     }
      public static User getInstance(int id, String type){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "";
        switch(type){
            case "Customer":
                path="Customers.bin";
                break;
            case "Data Centre Manager":
                path="DataCentreManager.bin";
                break;
            case "Accounts Officer":
                path="Accountsofficer.bin";
                break;
            case "Technical Support Operator":
                path="Technicalsupportoperator.bin";
                break;
//            case "Director":
//                path="DirectorObjects.bin";
//                break;
//            case "AccountsOfficer":
//                path="AccountsOfficerObjects.bin";
//                break;
//            case "HROfficer":
//                path="HROfficerObjects.bin";
//                break;
//            case "LabTechnician":
//                path="LabTechnicianObjects.bin";
//                break;
        }
        
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User tempUser = null;
            try{
                System.out.println("Printing user objects");
                while(true){
                    switch(type){
                        case "Customer": 
                            tempUser = (Customer) ois.readObject();
                            System.out.println(tempUser.toString());
                            break;
                        case "Data Centre Manager": 
                            tempUser = (DataCentreManager) ois.readObject();
                            System.out.println(tempUser.toString());
                            break;
                        case "Accounts Officer": 
                            tempUser = (AccountsOfficer) ois.readObject();
                            System.out.println(tempUser.toString());
                            break;
                        case "Technical Support Operator": 
                            tempUser = (Technicalsupportoperatoruser) ois.readObject();
                            System.out.println(tempUser.toString());
                            break;
//                        case "HR": 
//                            tempUser = (Director) ois.readObject();                            
//                            System.out.println("Reading director");
//                            System.out.println(tempUser.toString());
//                            break;
//                        case "AccountsOfficer": 
//                            tempUser = (AccountsOfficer) ois.readObject();
//                            System.out.println("Reading accounts");
//                            System.out.println(tempUser.toString());
//                            break;
//                        case "HROfficer": 
//                            tempUser = (HROfficer) ois.readObject();
//                            System.out.println("Reading HR");
//                            System.out.println(tempUser.toString());
//                            break;
//                        case "LabTechnician": 
//                            tempUser = (LabTechnician) ois.readObject();
//                            System.out.println("Reading technician");
//                            System.out.println(tempUser.toString());
//                            break;
                    }
                    if (id==tempUser.getUserID()){
                        System.out.println("User found");
                        System.out.print("tempUser:");
                        System.out.println(tempUser.toString());
                        return tempUser;
                    }
                }
            }
            catch(IOException | ClassNotFoundException e){
                System.out.println(e.toString());
                System.out.println("IOException | ClassNotFoundException in reading bin file");
            }
            System.out.println("End of file\n");
        } catch (IOException ex) {
            System.out.println("IOException on entire file handling");
        }
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return null;
    }
       public static int userLogin(int idcheck, String passcheck){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        int idnum=0;
        int passnum=0;
        int userType=0;
        try {
            f = new File("Login.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            loginhelper tempLogin;
            try{
                while(true){
                    if (idnum==1){break;}
                    tempLogin = (loginhelper) ois.readObject();
                    System.out.println(tempLogin.toString());
                    if (idcheck==tempLogin.getId()){
                        idnum=1;
                        if (passcheck.equals(tempLogin.getPassword())){
                            passnum=1;
                            switch (tempLogin.getTypeofuser()) {
                                case "Customer":
                                    userType=1;
                                    break;
                                case "Data Centre Manager":
                                    userType=2;
                                    break;
                                case "Technical Support Operator":
                                    userType=3;
                                    break;
                                case "Accounts Officer":
                                    userType=4;
                                    break;
                                case "HR":
                                    userType=5;
                                    break;
                                case "Admin":
                                    userType=6;
                                    break;
                                case "Network Engineer":
                                    userType=7;
                                    break;
                                default:
                                    userType=10;
                                    break;
                            }
                            break;
                        }
                    }
                }
            }
            catch(IOException | ClassNotFoundException e){
                System.out.println(e.toString());
                System.out.println("IOException | ClassNotFoundException in reading bin file");
            }
            System.out.println("End of file\n");
            
            if (idnum==1){
                if(passnum==1){
                   return userType;
               }
                
                else{return 11;}
            }
                else{
                        return 12;
                        }
//            }
//            else{
//                    return 12; 
//            }
        
                
        
        } catch (IOException ex) {
            System.out.println("IOException on entire file handling");
            return 0;
        }
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        
       }
}


