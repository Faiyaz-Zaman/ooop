/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import Bsccl.Main.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import Bsccl.Main.AppendableObjectOutputStream;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PackagesController implements Initializable {

    @FXML
    private ComboBox<String> packagecombobox;
  

    @FXML
    private Label idlabeltext;
    @FXML
    private DatePicker dobbuyingpackage;
    @FXML
    private TableView<packagebuy> packagestableview;
    @FXML
    private TableColumn<packagebuy, String> customernametablecolumn;
    @FXML
    private TableColumn<packagebuy, String> customeridtablecolumn;
    @FXML
    private TableColumn<packagebuy, LocalDate> dobpackagestablecolumn;
    @FXML
    private TableColumn<packagebuy, String> packageidtablecolumn;
    @FXML
    private TableColumn<packagebuy, String> amounttablecolumn;
    private User user;
    private Customer customer;
    @FXML
    private Label amountlabel;
    private TextArea amounttextarea;
    private ArrayList<packagebuy> packarr;
    
    @FXML
    private Label customernametext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         packagecombobox.getItems().addAll("500GB","600GB","700GB","900GB");
        customeridtablecolumn.setCellValueFactory(new PropertyValueFactory<packagebuy,String>("userid"));
        customernametablecolumn.setCellValueFactory(new PropertyValueFactory<packagebuy,String>("UserName"));
        dobpackagestablecolumn.setCellValueFactory(new PropertyValueFactory<packagebuy,LocalDate>("dobbuyingpackage"));
        amounttablecolumn.setCellValueFactory(new PropertyValueFactory<packagebuy,String>("amount"));
        packageidtablecolumn.setCellValueFactory(new PropertyValueFactory<packagebuy,String>("packagedetail"));
     
          
    }  

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customernametext.setText(customer.getUserName());
        idlabeltext.setText(Integer.toString(customer.getUserID()));
    }
    
    

   

   
    
         
    
    
                
    
    
    

   
    


    @FXML
    private void returnbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("customerdashboard.fxml"));
        root = (Parent) profileLoader.load();
        Scene profileScene = new Scene(root);

        customerdashboardController p = profileLoader.getController();
        p.setCustomer(customer);
        
        Stage profileStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        profileStage.setScene(profileScene);
        profileStage.show();
    }
   

    @FXML
    private void buypackagesbutton(ActionEvent event) throws IOException {
        ObjectOutputStream oos=null;
        File f = null;
        FileOutputStream fos = null;
         

            try {
                f = new File("Studs.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                    packagebuy stud = new packagebuy(  
                    idlabeltext.getText(),
                    customernametext.getText(),
                    dobbuyingpackage.getValue(),
                    packagecombobox.getSelectionModel().getSelectedItem(),
                    amountlabel.getText() 
                );
                 
                
                 packagestableview.getItems().add(stud);
              
                        
                        
                        
               
                oos.writeObject(stud);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
            
           
                                  
        
        }   
        Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Congratulation!!"+customernametext.getText()+"Your Purchase is successfull");
            a.showAndWait();
         
        
    }
    

    @FXML
    private void loadbinfilebutton(ActionEvent event) {
        packagebuy stud = new packagebuy(  
                    idlabeltext.getText(),
                    customernametext.getText(),
                    dobbuyingpackage.getValue(),
                    packagecombobox.getSelectionModel().getSelectedItem(),
                    amountlabel.getText() 
                );
        
        stud.display();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("Studs.bin", true)
            );
            oos.writeObject(stud);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         
        
        
       
      
        
    }
           
            

    @FXML
    private void showamountbutton(ActionEvent event) {
          String packageoption =packagecombobox.getSelectionModel().getSelectedItem();
           if (packageoption != null) {
                if (packageoption.equals("500GB")) {
                    amountlabel.setText("TK.2000");
                } else if (packageoption.equals("600GB")) {
                    amountlabel.setText("TK.3000");
                } else if (packageoption.equals("700GB")) {
                    amountlabel.setText("TK.5000");
                    
                }
                else if (packageoption.equals("900GB")) {
                    amountlabel.setText("TK.6000");
          }
           }
           
    }
    
}
