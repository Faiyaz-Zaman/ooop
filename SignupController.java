/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Main;
import Bsccl.Bushra.DataCentreManager.DataCentreManager;
import Bsccl.Faiyaz.Customer.Customer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SignupController implements Initializable {

    @FXML
    private DatePicker dobpicker;
    @FXML
    private DatePicker dojpicker;
    @FXML
    private TextField idtextfield;
    @FXML
    private TextField emailtxtfield;
    @FXML
    private TextField contacttxtfield;
    @FXML
    private TextField addresstxtfield;
    @FXML
    private TextField passwordtxtfield;
    @FXML
    private TextField nametextfield;
    @FXML
    private ComboBox<String> usertypecombobox;
    Alert failure = new Alert(Alert.AlertType.WARNING, "Error, sign up failed!");
    Alert success = new Alert(Alert.AlertType.INFORMATION, "Sign up successful!");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypecombobox.getItems().addAll("Customer","Accounts Officer","Technical Support Operator","Data Centre Manager","Admin","HR","Managing Director","Network Engineer");
        // TODO
    }    

    @FXML
    private void returnbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("LoginScene.fxml"));
        root = (Parent) profileLoader.load();
        Scene profileScene = new Scene(root);
        Stage profileStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        profileStage.setScene(profileScene);
        profileStage.show();
    }

    @FXML
    private void signupbutton(ActionEvent event) throws IOException {
        String usertype = usertypecombobox.getValue();
        String name = nametextfield.getText();
        int ID =Integer.parseInt(idtextfield.getText());
        String Password = passwordtxtfield.getText();
        String  email = emailtxtfield.getText();
        String contactNo = contacttxtfield.getText();
        String address = addresstxtfield.getText();
        LocalDate dob = dobpicker.getValue();
        LocalDate doj = dojpicker.getValue();
        if(usertype.equals("Customer")){
        Customer add = new Customer(name, ID, Password, email, contactNo, address, dob, doj);
        if(Customer.addingcustomer(add)){
            success.show();
            
        }else{
            failure.show();
        }          
    }
        
        DataCentreManager toadd = new DataCentreManager(name, ID, Password, email, contactNo, address, dob, doj);
        if(DataCentreManager.addingdcm(toadd)){
            success.show();
            
        }else{
            failure.show();
        }
            
        }}
    

        
    

