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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UpdatingtroublesootingstepsfromcommentsController implements Initializable {

    @FXML
    private TableView<?> queryListTableView;
    @FXML
    private TableColumn<?, ?> patientIDTableColumn;
    @FXML
    private TableColumn<?, ?> patientNameTableColumn;
    @FXML
    private TableColumn<?, ?> patientAgeTableColumn;
    @FXML
    private TableColumn<?, ?> statusTableColumn;
    @FXML
    private RadioButton noneStatusRadioButton;
    @FXML
    private ToggleGroup queryStatusTG;
    @FXML
    private RadioButton answeredStatusRadioButton;
    @FXML
    private ToggleGroup queryStatusTG1;
    @FXML
    private RadioButton pendingStatusRadioButton;
    @FXML
    private ToggleGroup queryStatusTG2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void applyFiltersOnClick(ActionEvent event) {
    }

    @FXML
    private void answerQueryOnClick(ActionEvent event) {
    }
    
}
