/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

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
public class dailyactivitycontroller implements Initializable {
    
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
    private Technicalsupportoperatoruser tsp;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }

    public void setTsp(Technicalsupportoperatoruser tsp) {
        this.tsp = tsp;
    }

    public Technicalsupportoperatoruser getTsp() {
        return tsp;
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
