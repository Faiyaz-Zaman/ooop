/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package viewsofcustomers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TableView<?> tableforviewandupdate;
    @FXML
    private TableColumn<?, ?> employeeidcolumn;
    @FXML
    private TableColumn<?, ?> employeenamecolumn;
    @FXML
    private TableColumn<?, ?> employeedesignationcolumn;
    @FXML
    private TableColumn<?, ?> employeetaskscolumn;
    @FXML
    private TableColumn<?, ?> employeeprogresscolumn;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadtable(ActionEvent event) {
    }

    @FXML
    private void savebutton(ActionEvent event) {
    }

    @FXML
    private void returnbutton(ActionEvent event) {
    }
    
}