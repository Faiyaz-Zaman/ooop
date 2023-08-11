/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package viewsoftechnicalsupportoperator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SupportticketsController implements Initializable {

    @FXML
    private RadioButton solvedradiobutton;
    @FXML
    private ToggleGroup filter;
    @FXML
    private RadioButton pendingradiobutton;
    @FXML
    private RadioButton allradiobutton;
    @FXML
    private TableView<?> supportticketstable;
    @FXML
    private TableColumn<?, ?> customerid;
    @FXML
    private TableColumn<?, ?> customername;
    @FXML
    private TableColumn<?, ?> typeofproblem;
    @FXML
    private TableColumn<?, ?> problemdescription;
    @FXML
    private TableColumn<?, ?> statustablecolumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void applyfilter(ActionEvent event) {
    }

    @FXML
    private void returnbutton(ActionEvent event) {
    }


    @FXML
    private void sendtonetworkengineers(ActionEvent event) {
    }

    @FXML
    private void sendnotificationtocustomerbutton(ActionEvent event) {
    }
    
}
