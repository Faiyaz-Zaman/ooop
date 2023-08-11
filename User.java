/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewsoftechnicalsupportoperator;

import customer.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author DipuSD
 */
public class User implements Serializable{
    protected String userName, password, userType;
    protected int userID, userRank;
    protected LocalDate dateOfBirth, dateOfJoin;
    boolean suspensionStatus;
    
    public User(){
    }
    public User(String userName, String password, String userType, int userID, LocalDate dateOfBirth, LocalDate dateOfJoin) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.userID = userID;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoin = dateOfJoin;
    }

    public User(String userName, String password, String userType, int userID, LocalDate dateOfBirth, LocalDate dateOfJoin,  int userRank) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.userID = userID;
        this.userRank = userRank;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoin = dateOfJoin;
    }
    

    public boolean isSuspensionStatus() {
        return suspensionStatus;
    }

    public void setSuspensionStatus(boolean suspensionStatus) {
        this.suspensionStatus = suspensionStatus;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

      public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(LocalDate dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public int getUserRank() {
        return userRank;
    }

    public void setUserRank(int userRank) {
        this.userRank = userRank;
    }
    
    
//    public static User login(int userID, String password, String userType) throws Exception{
//        ArrayList<User>specificUserList = ReadUserFile.getSpecificUsers(userType);
//        for(User user: specificUserList){
//            if(user.getUserID() == userID && user.getPassword().equals(password)){
//                return user;
//            }
//        }
//        return null;
//        
//    }
//    
//    public static void logout(){
//        //doit
//    }
       

public static ObservableList<Troubleshootingsteps> viewtroubleshootingsteps(){
        ObservableList<Troubleshootingsteps> policyList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "troubleshootingObjects.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Troubleshootingsteps temptss = null;
            try{
                System.out.println("Printing objects");
                while(true){
                    temptss = (Troubleshootingsteps) ois.readObject();
                    System.out.println("Policy stored :"+temptss.toString());
                    policyList.add(temptss);
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
        System.out.println(policyList);        
        return policyList;
    }   
}
