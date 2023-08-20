/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import Bsccl.Main.User;
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
import javafx.stage.Stage;

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
    private Technicalsupportoperatoruser tsp;
    private User user;

    /**
     * Initializes the controller class.
     */
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
    private void returndashboard(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader patientLoader = new FXMLLoader(getClass().getResource("technicalsupportoperatordashboard.fxml"));
        root = (Parent) patientLoader.load();
        Scene patientScene = new Scene(root);

         TechnicalsupportoperatordashboardController p = patientLoader.getController();
         p.setUser(user);

        Stage patientStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        patientStage.setScene(patientScene);
        patientStage.show();
    }
    

    @FXML
    private void updatebuttonforaccessing(ActionEvent event) {
    }

    @FXML
    private void savebuttonforaccessing(ActionEvent event) {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        
    }
    
    
}
