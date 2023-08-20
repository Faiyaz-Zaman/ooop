/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

package Bsccl.Bushra.DataCentreManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DcDeptExpenditureReqController implements Initializable {

    @FXML
    private TextField ExpenditureTitleTextField;
    @FXML
    private TextField ExpenditureAmountTextField;
    @FXML
    private TextField ExpenditureDetailsTextField;
    @FXML
    private TableView<ExpenditureReq> ExpenditureTableView;
    @FXML
    private TableColumn<ExpenditureReq, String> TitleColumn;
    @FXML
    private TableColumn<ExpenditureReq, String> DetailsColumn;
    @FXML
    private TableColumn<ExpenditureReq, String> AmountColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TitleColumn.setCellValueFactory(new PropertyValueFactory<ExpenditureReq,String>("ExpenditureTitle"));
        DetailsColumn.setCellValueFactory(new PropertyValueFactory<ExpenditureReq,String>("ExpenditureDetails"));
        AmountColumn.setCellValueFactory(new PropertyValueFactory<ExpenditureReq,String>("ExpenditureAmount"));
      
        // TODO
    }    

    @FXML
    private void SaveExpenditureOnClick(ActionEvent event) {
        
        
    }

    @FXML
    private void SubmitExpReqOnClick(ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Budget Expenditure has been submitted");
            a.showAndWait();
         
    
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
    private void LoadTableOnClcik(ActionEvent event) {
        ObjectInputStream ois=null;
         try {
            ExpenditureReq s;
            ois = new ObjectInputStream(new FileInputStream("Expenditure.bin"));
            s = (ExpenditureReq) ois.readObject();

            ExpenditureTableView.getItems().add(s);         
            
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
