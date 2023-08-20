/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdatingtroubleshootingstepssecondscenefromcommentsController implements Initializable {

    @FXML
    private TextArea commentstextarea;
    @FXML
    private TextArea troublesootingstepstextarea;
    private Technicalsupportoperatoruser tsp;

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
    private void returnbutton(ActionEvent event) {
    }

    @FXML
    private void updatebutton(ActionEvent event) {
    }
    
}
