/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package viewsoftechnicalsupportoperator;
import customer.User;
import customer.Troubleshootingsteps;

import customer.Customer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TroubleshootingstepController implements Initializable {

    @FXML
    private ComboBox<?> typeofproblemcombobox;
    private Customer customer;
    @FXML
    private TextArea stepstextarea;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Troubleshootingsteps> troubleshootingstepsList = User.viewtroubleshootingsteps();
        for (Troubleshootingsteps temp : troubleshootingstepsList){
            stepstextarea.appendText(temp.getComment());
        }
    }
        
        // TODO

    @FXML
    private void updatetroublesootingstepbutton(ActionEvent event) {
    }

    @FXML
    private void returnbutton(ActionEvent event) {
    }
       

    //private void updatetroublesootingstepbutton(ActionEvent event) {
        
        
    }

    

