/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager ;
import Bsccl.Bushra.DataCentreManager.SeeTask;
import Bsccl.Faiyaz.Customer.Customer;
import Bsccl.Main.AppendableObjectOutputStream;
import Bsccl.Main.SignupController;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Bsccl.Main.User;
import Bsccl.Main.loginhelper;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class DataCentreManager extends User implements Serializable {
    public DataCentreManager(String userName, int userID, String password, String email,  String contactNo, String address, LocalDate DOB,LocalDate DOJ) 
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
    
  
  

public static ObservableList<SeeTask> getTasktList() {    
        ObservableList<SeeTask> tasklist = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "AddTask.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            SeeTask tempTask = null;
            try{
                System.out.println("Printing objects");
                while(true){
                    tempTask = (SeeTask) ois.readObject();
                    
                        tasklist.add((SeeTask)tempTask);                   
                    System.out.println("Populated task: "+tempTask.toString());

                    }


        }catch(IOException | ClassNotFoundException e){
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
        System.out.println(tasklist);
        return tasklist;
}
public static ObservableList<ExpenditureReq> getExpenditureList() {    
        ObservableList<ExpenditureReq> ExpenditureList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "Expenditure.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ExpenditureReq tempExp = null;
            try{
                System.out.println("Printing objects");
                while(true){
                    tempExp = (ExpenditureReq) ois.readObject();
                    
                        ExpenditureList.add((ExpenditureReq)tempExp);                   
                    System.out.println("Populated task: "+tempExp.toString());

                    }

        }catch(IOException | ClassNotFoundException e){
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
        System.out.println(ExpenditureList);
        return ExpenditureList;

}
public static boolean addingdcm(DataCentreManager toadd) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        File f2 = null;
        FileOutputStream fos2 = null;      
        ObjectOutputStream oos2 = null;
        try {
            f = new File("DataCentreManager.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            f2 = new File("Login.bin");
            if(f2.exists()){
                fos2 = new FileOutputStream(f2,true);
                oos2 = new AppendableObjectOutputStream(fos2);                
            }
            else{
                fos2 = new FileOutputStream(f2);
                oos2 = new ObjectOutputStream(fos2);               
            }
            loginhelper addlogin = new loginhelper(toadd.getUserID(), toadd.getPassword(), "Data Centre Manager");
            oos.writeObject(toadd);
            oos2.writeObject(addlogin);
            oos.close();
            oos2.close();
            System.out.println("Sign up success");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) {oos.close();oos2.close();}
            } catch (IOException ex) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }



}