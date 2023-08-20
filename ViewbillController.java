/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bsccl.Faiyaz.Customer;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;
import Bsccl.Main.User;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewbillController implements Initializable {

    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TableView<Bill> billtableview;
    @FXML
    private TableColumn<Bill, LocalDate> billDateTableColumn;
    @FXML
    private TableColumn<Bill, String> detailsTableColumn;
    @FXML
    private TableColumn<Bill, Float> amountTableColumn;
    @FXML
    private TableColumn<Bill, String> statusTableColumn;
    @FXML
    private RadioButton padiradiobutton;
    @FXML
    private ToggleGroup allbillstatus;
    @FXML
    private RadioButton unpadiradiobutton;
    @FXML
    private RadioButton allpadiradiobutton2;
    private User user;
    private Customer customer;
    private FilteredList<Bill> filterBillList;
     Alert noBill = new Alert(Alert.AlertType.WARNING, "Error, select a bill!");
    Alert paid = new Alert(Alert.AlertType.WARNING, "Error, selected bill already paid!");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         Callback<TableColumn.CellDataFeatures<Bill, String>, ObservableValue<String>> paidCVF = feature -> {
            Bill temp = feature.getValue();
            if (temp.isPaidStatus()){return new SimpleStringProperty("Paid");}
            else{return new SimpleStringProperty("Due");}
        };
        
        billDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("createdDate"));
        detailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusTableColumn.setCellValueFactory(paidCVF);
        
        startDatePicker.setDayCellFactory(dp -> new DateCell(){
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                if (endDatePicker.getValue()!=null){
                    if (date.isAfter(endDatePicker.getValue())) {
                        setDisable(true);
                    }
                }
            }
        });
        
        endDatePicker.setDayCellFactory(dp -> new DateCell(){
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                if (startDatePicker.getValue()!=null){
                    if (date.isBefore(startDatePicker.getValue())) {
                        setDisable(true);
                    }
                }
            }
        });
        allpadiradiobutton2.setSelected(true);
        // TODO
    }    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

    
    

    public void setCustomer(Customer customer) {
//        this.customer = customer;
//         if(user instanceof Customer ){ 
//        Customer newcustomer = (Customer) user;
//        ObservableList<Bill> BillList = newcustomer.getBillList();
//        this.filterBillList = new FilteredList<>(BillList, b -> true);
//        billtableview.setItems(this.filterBillList);
//    }
    }

    public Customer getCustomer() {
        return customer;
        
        
    }

   
    

    @FXML
    private void applyFIltersOnClick(ActionEvent event) {
         if (padiradiobutton.isSelected()){
            filterBillList.setPredicate(temp ->{
                if (temp.isPaidStatus()){
                    return true;
                } else {return false;}
            }
            );
        }
        else if (unpadiradiobutton.isSelected()){
            filterBillList.setPredicate(temp ->{
                if (!temp.isPaidStatus()){
                    return true;
                } else {return false;}
            }
            );
        }
        else{
            filterBillList.setPredicate(tempTQ -> true);
        }
        LocalDate start = startDatePicker.getValue();
        LocalDate end = endDatePicker.getValue();
        if (start!=null && end!=null){
            filterBillList.setPredicate(temp ->{
                LocalDate billDate = temp.getCreatedDate();
                if (billDate.isAfter(start)&&billDate.isBefore(end)){
                    return true;
                } else {return false;}
            }
            );
        }
    }

    @FXML
    private void payselectedbutton(ActionEvent event) {
        Bill toPay = billtableview.getSelectionModel().getSelectedItem();
        if (toPay==null){noBill.show();return;}
        else if (toPay.isPaidStatus()){paid.show();return;}
        
    }
    

    @FXML
    private void returnbutton(ActionEvent event) {
    }
    
}
