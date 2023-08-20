/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;

import Bsccl.Main.AppendableObjectOutputStream;
import java.io.File;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class DataCentreNewTaskController implements Initializable {

    @FXML
    private TextField TaskPriorityTextField;
    @FXML
    private TextField TaskDetailsTextField;
    @FXML
    private TextField TaskStatusTextField;
    @FXML
    private TextField EmployeeIDTextField;
    @FXML
    private DatePicker TaskDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    @FXML
    private void SaveNewTaskOnClick(ActionEvent event) {
        ObjectOutputStream oos=null;
        File f = null;
        FileOutputStream fos = null;
        try {
                f = new File("AddTask.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                    SeeTask stud = new SeeTask(  
                    TaskDate.getValue(),
                    Integer.parseInt(EmployeeIDTextField.getText()),
                    TaskPriorityTextField.getText(),
                    TaskDetailsTextField.getText(),
                    TaskStatusTextField.getText() 
                );               
                oos.writeObject(stud);

            } catch (IOException ex) {
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                }
        } 
    }

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ViewTask.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
