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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class CustomerBillController implements Initializable {

    @FXML
    private TableView<?> accountsBillsTableView;
    @FXML
    private TableColumn<?, ?> BillCustomerID;
    @FXML
    private TableColumn<?, ?> BillDue;
    @FXML
    private TableColumn<?, ?> BillingID;
    @FXML
    private TableColumn<?, ?> BillAmount;
    @FXML
    private TableColumn<?, ?> BillDescription;
    @FXML
    private TableColumn<?, ?> PaidStatusColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickedBill(MouseEvent event) {
    }

    @FXML
    private void CreateBill(ActionEvent event) {
    }

    @FXML
    private void EditBill(ActionEvent event) {
    }

    @FXML
    private void MarkAsPaid(ActionEvent event) {
    }

    @FXML
    private void returnToDashboardOnClick(ActionEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AccountsOfficerDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
