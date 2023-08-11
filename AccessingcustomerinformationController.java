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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AccessingcustomerinformationController implements Initializable {

    @FXML
    private TableView<?> customertable;
    @FXML
    private TableColumn<?, ?> customerIDcolumn;
    @FXML
    private TableColumn<?, ?> customerNamecolumn;
    @FXML
    private TableColumn<?, ?> customeremailAddresscolumn;
    @FXML
    private TableColumn<?, ?> customerpackagescolumn;
    @FXML
    private TableColumn<?, ?> customerdobcolumn;
    @FXML
    private TableColumn<?, ?> customerdojcolumn;
    @FXML
    private TableColumn<?, ?> packagespeedcolumn;
    @FXML
    private TableColumn<?, ?> customerdojcolumn2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returndashboard(ActionEvent event) {
    }

    @FXML
    private void updatebuttonforaccessing(ActionEvent event) {
    }

    @FXML
    private void savebuttonforaccessing(ActionEvent event) {
    }
    
}
