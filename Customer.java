/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import Bsccl.Main.AppendableObjectOutputStream;
import Bsccl.Main.SignupController;
import Bsccl.Main.User;
import Bsccl.Main.loginhelper;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Customer extends User implements Serializable{

    
    
    public Customer(String userName, int userID, String password, String email,  String contactNo, String address, LocalDate DOB,LocalDate DOJ) {
        super(userName, userID, password, email, contactNo, address, DOB,DOJ);
    }
    

    

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int getUserID() {
        return userID;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getContactNo() {
        return contactNo;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public LocalDate getDOB() {
        return DOB;
    }

    @Override
    public LocalDate getDOJ() {
        return DOJ;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
     public boolean updatePersonalInfo(String newName, String newEmail,String newAddr,String newContactno){
        try {
            File file = new File("Customers.bin");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Customer> customerList = new ArrayList<>();
            try{
                while(true){
                    Customer tempPat = (Customer) ois.readObject();
                    System.out.println(tempPat);
                    customerList.add(tempPat);
                }
            }
            catch (EOFException eof){
                System.out.println("End of file");
            }
            catch(IOException | ClassNotFoundException e){
                System.out.println(e.toString());
                System.out.println("IOException | ClassNotFoundException in reading bin file");
            }
            ois.close();
            System.out.println(customerList);

            for (Customer currentPat : customerList) {
                if (currentPat.getUserID()==this.userID) {
                    currentPat.setUserName(newName);
                    currentPat.setEmail(newEmail);
                    currentPat.setAddress(newAddr);
                    currentPat.setContactNo(newContactno);
                    
                }
            }

            System.out.println(customerList);
            if(file.delete()){
                System.out.println("Deleted customer File!");
                File f = new File("Customers.bin");
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (Customer currentPat : customerList) {
                    oos.writeObject(currentPat);
                }
                oos.close();
                System.out.println("Fixed File!");
                return true;
            }
            else{
                System.out.println("Could not delete file");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     public static boolean addingcustomer(Customer add) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        File f2 = null;
        FileOutputStream fos2 = null;      
        ObjectOutputStream oos2 = null;
        try {
            f = new File("Customers.bin");
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
            loginhelper addlogin = new loginhelper(add.getUserID(), add.getPassword(), "Customer");
            oos.writeObject(add);
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
