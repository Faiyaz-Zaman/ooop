/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package viewsoftechnicalsupportoperator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DatesformaintenanceactivityController implements Initializable {

    @FXML
    private TableView<?> maintanencetable;
    @FXML
    private TableColumn<?, ?> datecolumn;
    @FXML
    private TableColumn<?, ?> maintenancecolumn;
    @FXML
    private TableColumn<?, ?> typeofproblemofcolumn;
    @FXML
    private DatePicker maintenancedob;
    @FXML
    private TextArea outputtextarea;
    @FXML
    private ComboBox<?> typeofproblemcombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returntodashboardbutton(ActionEvent event) {
    }

    @FXML
    private void sendnotificationbutton(ActionEvent event) {
    }

    @FXML
    private void addingtothetablebutton(ActionEvent event) {
    }
    
}
