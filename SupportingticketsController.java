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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
public class SupportingticketsController implements Initializable {

    @FXML
    private TextArea detailstxtarea;
    @FXML
    private ComboBox<String> typeofproblemcombobox;
    @FXML
    private Label nametxt;
    @FXML
    private Label idtxt;
    private Customer customer;
    private User user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typeofproblemcombobox.getItems().addAll("Network related Issue","Physical problem","Server problem");
        // TODO
    }    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
         if(user instanceof Customer ){ 
        Customer newcustomer = (Customer) user;
        nametxt.setText(nametxt.getText()+" "+newcustomer.getUserName());
        idtxt.setText(idtxt.getText()+" "+newcustomer.getUserID());
        
    }
    }

  
    

    @FXML
    private void returnbutton(ActionEvent event) throws IOException {
        Parent patientDashboard = null;
        FXMLLoader patientLoader = new FXMLLoader(getClass().getResource("customerdashboard.fxml"));
        patientDashboard = (Parent) patientLoader.load();
        Scene patientScene = new Scene(patientDashboard);

        customerdashboardController p = patientLoader.getController();
        p.setCustomer(customer);

        Stage patientStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        patientStage.setScene(patientScene);
        patientStage.show();
    }

    @FXML
    private void submitticketbutton(ActionEvent event) {
         Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(nametxt.getText()+"Your ticket is sent");
            a.showAndWait();
        
    }
    
}
