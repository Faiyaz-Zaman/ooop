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
public class ViewtroubleshootingstepsController implements Initializable {

    @FXML
    private TextArea troubleshootingtxtarea;
    @FXML
    private TextArea commentareatxt;
    @FXML
    private ComboBox<String> typecombobox;
    private User user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        typecombobox.getItems().addAll("Network Issue","Server Issue","Physical Problem");
        // TODO
    }  

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        
        
    }
    

   
    

    @FXML
    private void returnbutton(ActionEvent event) throws IOException {
//        Parent patientDashboard = null;
//        FXMLLoader patientLoader = new FXMLLoader(getClass().getResource("customerdashboard.fxml"));
//        patientDashboard = (Parent) patientLoader.load();
//        Scene patientScene = new Scene(patientDashboard);
//
//        customerdashboardController p = patientLoader.getController();
//        p.setCustomer(customer);
//
//        Stage patientStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        patientStage.setScene(patientScene);
//        patientStage.show();
    }

    @FXML
    private void submitbutton(ActionEvent event) {
         Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(user.getUserName()+"Your ticket is sent");
            a.showAndWait();
        
    }

    @FXML
    private void showtroubleshoot(ActionEvent event) {
        String troubleshoot = typecombobox.getSelectionModel().getSelectedItem();
           if (troubleshoot != null) {
                if (troubleshoot.equals("Network Issue")) {
                    troubleshootingtxtarea.setText("Pray To God");
                } else if (troubleshoot.equals("Server Issue")) {
                    troubleshootingtxtarea.setText("You Can do it on your own");
                } else if (troubleshoot.equals("Physical Problem")) {
                    troubleshootingtxtarea.setText("Easy Problem wont solve it");
                    
                }
             
        
    
           }}
}
