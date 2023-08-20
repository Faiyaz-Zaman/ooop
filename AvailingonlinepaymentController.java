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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AvailingonlinepaymentController implements Initializable {

    @FXML
    private TableView<?> billpayingtable;
    @FXML
    private TableColumn<?, ?> customeridtablecolumn;
    @FXML
    private TableColumn<?, ?> customernamecolumn;
    @FXML
    private TableColumn<?, ?> statuscolumn;
    @FXML
    private TableColumn<?, ?> amountcolumn;
    @FXML
    private RadioButton bkashradiobutton;
    @FXML
    private ToggleGroup payment;
    @FXML
    private RadioButton nagadradiobutton;
    @FXML
    private RadioButton rocketrdiobutton;
    @FXML
    private TextField numbertextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void paynowbutton(ActionEvent event) {
    }

    @FXML
    private void returnbutton(ActionEvent event) {
    }
    
}
