/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import Bsccl.Main.User;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *
 * @author User
 */
public class Technicalsupportoperatoruser extends User implements Serializable {
    private static final long serialVersionUID = 15L;

    public Technicalsupportoperatoruser(String userName, int userID, String password, String email, String contactNo, String address, LocalDate DOB, LocalDate DOJ) {
        super(userName, userID, password, email, contactNo, address, DOB, DOJ);
    }
    

    

    
    }
    
    
    
//     public static ObservableList<Technicalsupportoperatoruser> getAlloperators(){
//        ObservableList<Technicalsupportoperatoruser> technicalsupportoperatorList = FXCollections.observableArrayList();
//        File f = null;
//        FileInputStream fis = null;      
//        ObjectInputStream ois = null;
//        String path = "TechnicalSupportOPeratorsObjects.bin";
//        try {
//            f = new File(path);
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            User tempUser = null;
//            try{
//                System.out.println("Printing objects");
//                while(true){
//                    tempUser = (Technicalsupportoperatoruser) ois.readObject();
//                    System.out.println(tempUser.toString());
//                    technicalsupportoperatorList.add((Technicalsupportoperatoruser)tempUser);
//                }
//            }
//            catch(IOException | ClassNotFoundException e){
//                System.out.println(e.toString());
//                System.out.println("IOException | ClassNotFoundException in reading bin file");
//            }
//            System.out.println("End of file\n");
//        } catch (IOException ex) {
//            System.out.println("IOException on entire file handling");
//        }
//        finally {
//            try {
//                if(ois != null) ois.close();
//            } catch (IOException ex) { 
//                
//            }}
//        
//        System.out.println(technicalsupportoperatorList);        
//        return technicalsupportoperatorList;
//    
//     }
//     public static ObservableList<Troubleshootingsteps> viewtroubleshootingsteps(){
//        ObservableList<Troubleshootingsteps> troubleshootinglist = FXCollections.observableArrayList();
//        File f = null;
//        FileInputStream fis = null;      
//        ObjectInputStream ois = null;
//        String path = "troubleshootingstepsObjects.bin";
//        try {
//            f = new File(path);
//            fis = new FileInputStream(f);
//            ois = new ObjectInputStream(fis);
//            Troubleshootingsteps temptroublesteps = null;
//            try{
//                System.out.println("Printing objects");
//                while(true){
//                    temptroublesteps = (Troubleshootingsteps) ois.readObject();
//                    System.out.println("Policy  :"+temptroublesteps.toString());
//                    troubleshootinglist.add(temptroublesteps);
//                }
//            }
//            catch(IOException | ClassNotFoundException e){
//                System.out.println(e.toString());
//                System.out.println("IOException | ClassNotFoundException in reading bin file");
//            }
//            System.out.println("End of file\n");
//        } catch (IOException ex) {
//            System.out.println("IOException on entire file handling");
//        }
//        finally {
//            try {
//                if(ois != null) ois.close();
//            } catch (IOException ex) { }
//        }
//        System.out.println(troubleshootinglist);        
//        return troubleshootinglist;
//    

   



