/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class DataCentreManagerDashboard2Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SeeTasksOnClick(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader queryLoader = new FXMLLoader(getClass().getResource("/DataCentreManager/ViewTask.fxml"));
        root = (Parent) queryLoader.load();
        Scene queryScene = new Scene(root);
        Stage queryStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        queryStage.setScene(queryScene);
        queryStage.show();
        
    }

    @FXML
    private void PurchaseReqOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("PurchaseRequest.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void ExpRequirementOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DcDeptExpenditureReq.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();

    }

    @FXML
    private void ViewSecurityControlOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DcmSecurityControl.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void ViewDisasterPlanOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewSoldBundleOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewCustomerComplaintOnClick(ActionEvent event) {
    }

    @FXML
    private void ServerCapacityChangesOnClick(ActionEvent event) {
    }

    @FXML
    private void LogoutOnClick(ActionEvent event) {
    }
    
}
