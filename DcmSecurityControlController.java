/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;
import Bsccl.Main.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class DcmSecurityControlController implements Initializable {

    @FXML
    private TableView<SecurityControl> SecurityControlTableView;
    @FXML
    private TableColumn<SecurityControl, LocalDate> DateSAColumn;
    @FXML
    private TableColumn<SecurityControl, Integer> EmployeeIDSAColumn;
    @FXML
    private TableColumn<SecurityControl, String> TimeInColumn;
    @FXML
    private TableColumn<SecurityControl, String> TimeOutColumn;
    @FXML
    private DatePicker DateSATextField;
    @FXML
    private TextField TimeInTextField;
    @FXML
    private TextField SaEmployeeIDTextField;
    @FXML
    private TextField TimeOutTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        DateSAColumn.setCellValueFactory(new PropertyValueFactory<SecurityControl,LocalDate>("AccessDate"));
        EmployeeIDSAColumn.setCellValueFactory(new PropertyValueFactory<SecurityControl,Integer>("SaEmployeeID"));
        TimeInColumn.setCellValueFactory(new PropertyValueFactory<SecurityControl,String>("TimeIn"));
        TimeOutColumn.setCellValueFactory(new PropertyValueFactory<SecurityControl,String>("TimeOut"));

    }    

    @FXML
    private void ReturnToDashboardOnClick(ActionEvent event) throws IOException {
    Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DataCentreManagerDashboard2.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();        
    }

    @FXML
    private void SaveSecurityControlOnClick(ActionEvent event) {
        ObjectOutputStream oos=null;
        File f = null;
        FileOutputStream fos = null;
        
           try {
                f = new File("Stud.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }        
                SecurityControl stu = new SecurityControl(
                        DateSATextField.getValue(), 
                Integer.parseInt(SaEmployeeIDTextField.getText()),
                SaEmployeeIDTextField.getText(),TimeOutTextField.getText());
                SecurityControlTableView.getItems().add(stu);               
                oos.writeObject(stu);
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
    private void LoadSecurityControlTableOnClick(ActionEvent event) {
      ObjectInputStream ois=null;
         try {
            SecurityControl s;
            ois = new ObjectInputStream(new FileInputStream("Security.bin"));
            s = (SecurityControl) ois.readObject();
            SecurityControlTableView.getItems().add(s);
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }   
    }  
    }
       
    
