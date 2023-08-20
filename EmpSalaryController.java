/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.AccountsOfficer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class EmpSalaryController implements Initializable {

    @FXML
    private TableView<?> employeeTableView;
    @FXML
    private TableColumn<?, ?> employeeIDTableColumn;
    @FXML
    private TableColumn<?, ?> employeeNameTableColumn;
    @FXML
    private TableColumn<?, ?> employeeGenderColumn;
    @FXML
    private TableColumn<?, ?> employeeEmailTableColumn;
    @FXML
    private TableColumn<?, ?> employeePhoneTableColumn;
    @FXML
    private TableColumn<?, ?> employeDeptTableColumn;
    @FXML
    private TableColumn<?, ?> employeeDesigTableColumn;
    @FXML
    private TableColumn<?, ?> employeeDOBTableColumn;
    @FXML
    private TableColumn<?, ?> employeeDOJTableColumn;
    @FXML
    private TableColumn<?, ?> employeeAddressTableColumn;
    @FXML
    private TableColumn<?, ?> SalaryOfEmp;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddOrSubSalaryToNewScene(ActionEvent event) throws IOException {
    Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AddOrSubtractSalary.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();    
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AccountsOfficerDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
