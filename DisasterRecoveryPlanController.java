/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;

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
 * @author DELL
 */
public class DisasterRecoveryPlanController implements Initializable {

    @FXML
    private TableView<?> DisasterPlanTableView;
    @FXML
    private TableColumn<?, ?> TypeOfDisasterColumn;
    @FXML
    private TableColumn<?, ?> ImpactLevelColumn;
    @FXML
    private TableColumn<?, ?> ResponsePlanColumn;
    @FXML
    private TableColumn<?, ?> ResponsibleTeamColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void UpdatePlanOnClick(ActionEvent event) {
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) {
    }
    
}
