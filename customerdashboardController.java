/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

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
import Bsccl.Main.User;


/**
 *
 * @author User
 */
public class customerdashboardController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label usernamelabeltext;
    @FXML
    private Label idlabeltext;
    private Customer customer;
    private User user;
    
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        usernamelabeltext.setText(this.customer.userName);
        idlabeltext.setText(Integer.toString(this.customer.userID));
         
    }
      
//    }
//    public void setCustomer(User customer) {
//        this.customer = (Customer) customer;
//        idlabeltext.setText(String.valueOf(this.customer.userID));
//        usernamelabeltext.setText(this.customer.userName);
//    }
    
public void init(String name, Integer id, Customer S){
        usernamelabeltext.setText("Name : "+ name);
        idlabeltext.setText(Integer.toString(id));
      
    }

    @FXML
    private void buypackagesbutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader queryLoader = new FXMLLoader(getClass().getResource("packages.fxml"));
        root = (Parent) queryLoader.load();
        Scene queryScene = new Scene(root);

        PackagesController q = queryLoader.getController();
        q.setCustomer(this.customer);

        Stage queryStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        queryStage.setScene(queryScene);
        queryStage.show();
        
    
    }

    @FXML
    private void supportticketsbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader f = new FXMLLoader(getClass().getResource("supportingtickets.fxml"));
        root = (Parent) f.load();
        Scene queryScene = new Scene(root);

        SupportingticketsController q = f.getController();
        q.setUser(user);

        Stage queryStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        queryStage.setScene(queryScene);
        queryStage.show();
    }

    @FXML
    private void updatepersonalinfobutton(ActionEvent event) throws IOException {
         Parent root = null;
        FXMLLoader f = new FXMLLoader(getClass().getResource("updatingpersonalrecords.fxml"));
        root = (Parent) f.load();
        Scene personalScene = new Scene(root);

        UpdatingpersonalrecordsController q = f.getController();
        q.setCustomer(customer);

        Stage recordstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        recordstage.setScene(personalScene);
        recordstage.show();
    }
    

    @FXML
    private void chatbutton(ActionEvent event) {
//        Parent root = null;
//        FXMLLoader f = new FXMLLoader(getClass().getResource("updatingpersonalrecords.fxml"));
//        root = (Parent) f.load();
//        Scene personalScene = new Scene(root);
//
//        UpdatingpersonalrecordsController q = f.getController();
//        q.setCustomer(this.customer);
//
//        Stage recordstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
//        recordstage.setScene(personalScene);
//        recordstage.show();
//        
    }

    @FXML
    private void cancelmembershipbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader f = new FXMLLoader(getClass().getResource("cancelmembership.fxml"));
        root = (Parent) f.load();
        Scene personalScene = new Scene(root);

        CancelmembershipController q = f.getController();
        q.setUser(user);

        Stage recordstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        recordstage.setScene(personalScene);
        recordstage.show();
    }

    @FXML
    private void logoutbutton(ActionEvent event) {
        Parent login=null;
        try {
            login = FXMLLoader.load(getClass().getResource("/bscclsimulationoop/Loginscene.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(customerdashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene1 = new Scene(login);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void viewbillbutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader f = new FXMLLoader(getClass().getResource("viewbill.fxml"));
        root = (Parent) f.load();
        Scene personalScene = new Scene(root);

        ViewbillController q = f.getController();
        q.setUser(user);

        Stage recordstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        recordstage.setScene(personalScene);
        recordstage.show();
    }

    @FXML
    private void viewtroubleshootandupdatebutton(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader f = new FXMLLoader(getClass().getResource("viewtroubleshootingsteps.fxml"));
        root = (Parent) f.load();
        Scene personalScene = new Scene(root);

        ViewtroubleshootingstepsController q = f.getController();
        q.setUser(user);

        Stage recordstage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        recordstage.setScene(personalScene);
        recordstage.show();
    }
    
}
