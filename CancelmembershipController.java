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
import javafx.scene.control.TextArea;
import Bsccl.Main.User;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CancelmembershipController implements Initializable {

    @FXML
    private Label idlabeltxt;
    @FXML
    private Label namelabeltxt;
    @FXML
    private TextArea reasontxtarea;
    private User user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        namelabeltxt.setText(namelabeltxt.getText()+" "+user.getUserName());
        idlabeltxt.setText(idlabeltxt.getText()+" "+user.getUserID());
    }

    

    
    

    @FXML
    private void cancelmembership(ActionEvent event) {
    }

    @FXML
    private void returnbutton(ActionEvent event) {
    }
    
}
