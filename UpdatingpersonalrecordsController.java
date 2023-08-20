/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Bsccl.Main.User;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdatingpersonalrecordsController implements Initializable {

  
 
   
   
    
    @FXML
    private TextField confirmpasswordtext;
    @FXML
    private Label dojlabel;
    @FXML
    private Label doblabel;
    @FXML
    private Label idlabel;
    @FXML
    private TextField nametextfield;
    @FXML
    private TextField emailtextfield;
    @FXML
    private TextField contactnotextfield;
    @FXML
    private TextField addresstextfield;
    private Customer customer;
     Alert badEmail = new Alert(Alert.AlertType.WARNING, "Error, enter a valid email!");
    Alert success = new Alert(Alert.AlertType.INFORMATION, "Successfully updated info!");
    Alert wrongPW = new Alert(Alert.AlertType.WARNING, "Error, wrong password entered!");
     Alert failure = new Alert(Alert.AlertType.WARNING, "Error!");
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
        
        
        
        
        
        
        
       
        
    
    
   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        idlabel.setText(Integer.toString(customer.getUserID()));
        nametextfield.setText(customer.getUserName());
        emailtextfield.setText(customer.getEmail());
        addresstextfield.setText(customer.getAddress());
        contactnotextfield.setText(customer.getContactNo());
        doblabel.setText(customer.getDOB().toString());
        dojlabel.setText(customer.getDOJ().toString());
        
    }
    
   
    
    

  
    
    
    
    @FXML
    private void returnbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("customerdashboard.fxml"));
        root = (Parent) profileLoader.load();
        Scene profileScene = new Scene(root);

//        customerdashboardController p = profileLoader.getController();
//        p.setUser(user);

        Stage profileStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        profileStage.setScene(profileScene);
        profileStage.show();
    }
    

    @FXML
    private void updatepersonalrecordonclick(ActionEvent event) {
        String pw = confirmpasswordtext.getText();
        if (!pw.equals(customer.getPassword())) {
            wrongPW.show();
            System.out.println(customer.getPassword());
            return;
        }
        
        String newName = nametextfield.getText();
        String newEmail = emailtextfield.getText();
        String newAddr = addresstextfield.getText();
        String newContactNo = contactnotextfield.getText();
        if (!newEmail.contains("@")){badEmail.show();return;}
        
        System.out.println("New Info collected: "+newName+", "+newEmail+", "+newAddr+", "+newContactNo+", ");
        if (this.customer.updatePersonalInfo(newName, newEmail, newAddr, newContactNo)){
            success.show();
        }
        else {failure.show();}
    }}
      
        
      
    
    

