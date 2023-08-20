/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import Bsccl.Main.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author User
 */
public class TechnicalsupportoperatordashboardController implements Initializable {
    private Technicalsupportoperatoruser tos;
    private User user;

    @FXML
    private Label tosidtextfield;
    @FXML
    private Label tosnametextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }   
    

    public void setTos(Technicalsupportoperatoruser tos) {
        this.tos = tos;
        tosidtextfield.setText(String.valueOf(tos.getUserID()));
        tosnametextfield.setText(tos.getUserName());
    }

    public Technicalsupportoperatoruser getTos() {
        return tos;
    }

    @FXML
    private void toslogoutbutton(ActionEvent event) throws IOException {
        Parent login1=null;
        try {
            login1 = FXMLLoader.load(getClass().getResource("/bscclsimulationoop/Loginscene.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(TechnicalsupportoperatordashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene11 = new Scene(login1);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene11);
        window.show();
    }


    @FXML
    private void inhousetechsupportbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader scheduleLoader = new FXMLLoader(getClass().getResource("inhousetechsupport.fxml"));
        root = (Parent) scheduleLoader.load();
        Scene customerscene = new Scene(root);

        InhousetechsupportController p = scheduleLoader.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void accessingcustomerinformationbutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader2 = new FXMLLoader(getClass().getResource("accessingcustomerinformation.fxml"));
        root = (Parent) scheduleLoader2.load();
        Scene customerscene = new Scene(root);

        AccessingcustomerinformationController p = scheduleLoader2.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void customercommentbutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader3 = new FXMLLoader(getClass().getResource("updatingtroubleshootingstepsfromcomments.fxml"));
        root = (Parent) scheduleLoader3.load();
        Scene customerscene = new Scene(root);

        UpdatingtroublesootingstepsfromcommentsController p = scheduleLoader3.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void tsosupportticekts(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader4 = new FXMLLoader(getClass().getResource("supporttickets.fxml"));
        root = (Parent) scheduleLoader4.load();
        Scene customerscene = new Scene(root);

        SupportticketsController p = scheduleLoader4.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void chatbutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader5 = new FXMLLoader(getClass().getResource("chatwithcustomer.fxml"));
        root = (Parent) scheduleLoader5.load();
        Scene customerscene = new Scene(root);

        ChatwithcustomerController p = scheduleLoader5.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void datesformaintenanceactivitybutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader scheduleLoader = new FXMLLoader(getClass().getResource("datesformaintenanceactivity.fxml"));
        root = (Parent) scheduleLoader.load();
        Scene customerscene = new Scene(root);

        DatesformaintenanceactivityController p = scheduleLoader.getController();
        p.setTsp(this.tos);

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void updatingtroubleshootingstepsbutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader = new FXMLLoader(getClass().getResource("updatingtroubleshootingstepssecondscenefromcomments.fxml"));
        root = (Parent) scheduleLoader.load();
        Scene customerscene = new Scene(root);
        UpdatingtroubleshootingstepssecondscenefromcommentsController s = scheduleLoader.getController();
        s.setTsp(this.tos);



        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    @FXML
    private void dailyactivitybutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader scheduleLoader = new FXMLLoader(getClass().getResource("dashboardoftechnicalsupport.fxml"));
        root = (Parent) scheduleLoader.load();
        Scene customerscene = new Scene(root);

        dailyactivitycontroller p = scheduleLoader.getController();
        p.setTsp(this.tos);
        
        

        Stage scheduleStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        scheduleStage.setScene(customerscene);
        scheduleStage.show();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        tosnametextfield.setText(tosnametextfield.getText()+" "+user.getUserName());
        tosidtextfield.setText(tosidtextfield.getText()+" "+user.getUserID());
        
    }

    
    }
    
    

