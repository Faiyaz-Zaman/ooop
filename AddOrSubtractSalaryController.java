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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class AddOrSubtractSalaryController implements Initializable {

    @FXML
    private TextField AddorSubAmount;
    @FXML
    private RadioButton AddRadioButton;
    @FXML
    private ToggleGroup AddOrSub;
    @FXML
    private RadioButton SubtractRadioButton;
    @FXML
    private TextField EmployeeName;
    @FXML
    private TextField EmployeeSalary;
    @FXML
    private TextField EmployeeID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void confirmAddOrSubtractOnClick(ActionEvent event) {
    }

    @FXML
    private void BackToEmpList(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("EmpSalary.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
