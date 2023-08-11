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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InhousetechsupportController implements Initializable {

    @FXML
    private Label EmployeeID;
    @FXML
    private Label employeeName;
    @FXML
    private Label employeeDept;
    @FXML
    private TextArea problemtextarea;
    @FXML
    private TextArea solutiontextarea;
    @FXML
    private ComboBox<?> departmentcombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retruntodashboard(ActionEvent event) {
    }

    @FXML
    private void submitsolutionbutton(ActionEvent event) {
    }
    
}
