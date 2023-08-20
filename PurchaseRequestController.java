/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;

import Bsccl.Bushra.DataCentreManager.PurchaseReq;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class PurchaseRequestController implements Initializable {

    @FXML
    private TextField PurchaseTypeTextField;
    @FXML
    private TextField PurchaseAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void SubmitPurchaseReqOnClick(ActionEvent event) {
        PurchaseReq re = new PurchaseReq (PurchaseTypeTextField.getText(), PurchaseAmountTextField.getText());
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("purchaseReq.bin", true)
            );
            oos.writeObject(re);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Purchase Request has been submitted");
            a.showAndWait();
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DataCentreManagerDashboard2.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    
}
