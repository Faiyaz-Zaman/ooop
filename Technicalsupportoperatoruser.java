/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewsoftechnicalsupportoperator;

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
public class Technicalsupportoperatoruser extends User implements Serializable {
    private static final long serialVersionUID = 15L;

    public Technicalsupportoperatoruser() {
    }

    public Technicalsupportoperatoruser(String userName, String password, String userType, int userID, LocalDate dateOfBirth, LocalDate dateOfJoin) {
        super(userName, password, userType, userID, dateOfBirth, dateOfJoin);
    }

    public Technicalsupportoperatoruser(String userName, String password, String userType, int userID, LocalDate dateOfBirth, LocalDate dateOfJoin, int userRank) {
        super(userName, password, userType, userID, dateOfBirth, dateOfJoin, userRank);
    }
    
     public static ObservableList<Technicalsupportoperatoruser> getAlloperators(){
        ObservableList<Technicalsupportoperatoruser> technicalsupportoperatorList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "TechnicalSupportOPeratorsObjects.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User tempUser = null;
            try{
                System.out.println("Printing objects");
                while(true){
                    tempUser = (Technicalsupportoperatoruser) ois.readObject();
                    System.out.println(tempUser.toString());
                    technicalsupportoperatorList.add((Technicalsupportoperatoruser)tempUser);
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
            } catch (IOException ex) { 
                
            }}
        
        System.out.println(technicalsupportoperatorList);        
        return technicalsupportoperatorList;
    
}
}
