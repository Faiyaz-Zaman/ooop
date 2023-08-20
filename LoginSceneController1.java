/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Main;
import Bsccl.Faiyaz.Customer.Customer;
import Bsccl.Faiyaz.Customer.customerdashboardController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginSceneController1 implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> typeOfUserComboBox;
    @FXML
    private TextField loginUserNameTxt;
    @FXML
    private TextField passwordLoginTxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeOfUserComboBox.getItems().addAll("Customer","Data Centre Manager","Accounts Officer","HR","Technical Support Operator","Admin","Network Engineer","Managing Director");
        
        // TODO
    }    

    @FXML
    private void LoginButton(ActionEvent event) throws FileNotFoundException, IOException {
                int id = Integer.parseInt(loginUserNameTxt.getText());
                String pass = passwordLoginTxt.getText();
                int login = User.userLogin(id, pass);
                
    
            switch(login){
//            case 0: someError.show(); break;        //Some exception
//            case 1: noUser.show(); break;                  //User not found in database
//            case 2: wrongPW.show(); break;                  //Authorisation failed
            case 1: 
                                     //Doctor authenticated
                Parent doctorDashboard = null;
                FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("/Bsccl/Faiyaz/Customer/customerdashboard.fxml"));
                doctorDashboard = (Parent) doctorLoader.load();
                Scene doctorScene = new Scene(doctorDashboard);
                
                customerdashboardController d = doctorLoader.getController();
                d.setCustomer((Customer) User.getInstance(id, "Customer"));
                
                Stage doctorStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                doctorStage.setScene(doctorScene);
                doctorStage.show();
                break;
            case 2:
                Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Bsccl/Bushra/DataCentreManager/DataCentreManagerDashboard2.fxml"));
                Scene scene1 = new Scene(mainSceneParent);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene1);
                window.show();
                break;
                
}
                    
                
}
            
            
        
       

        
                
        
    

    @FXML
    private void signUpButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Signup.fxml"));
                            Parent registrationFormParent = loader.load();
                            Scene registrationFormScene = new Scene(registrationFormParent);

//                            StudentHomeController controller = loader.getController();
//                            controller.init(p.getUserName(), p.getUserid(), (Student)p);

                            Stage registrationFormStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                            registrationFormStage.setScene(registrationFormScene);
                            registrationFormStage.setTitle("BSCCL");
                            registrationFormStage.show();
                        }
    }
    

