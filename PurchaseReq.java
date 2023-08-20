/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Bushra.DataCentreManager;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class PurchaseReq implements Serializable{
    private static final long serialVersionUID = 15L;



    protected String PurchaseTypeTextField;
    protected String PurchaseAmountTextField;

    public PurchaseReq(String PurchaseTypeTextField, String PurchaseAmountTextField) {
        this.PurchaseTypeTextField = PurchaseTypeTextField;
        this.PurchaseAmountTextField = PurchaseAmountTextField;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPurchaseTypeTextField() {
        return PurchaseTypeTextField;
    }

    public String getPurchaseAmountTextField() {
        return PurchaseAmountTextField;
    }

    public void setPurchaseTypeTextField(String PurchaseTypeTextField) {
        this.PurchaseTypeTextField = PurchaseTypeTextField;
    }

    public void setPurchaseAmountTextField(String PurchaseAmountTextField) {
        this.PurchaseAmountTextField = PurchaseAmountTextField;
    }

    @Override
    public String toString() {
        return "PurchaseReq{" + "PurchaseTypeTextField=" + PurchaseTypeTextField + ", PurchaseAmountTextField=" + PurchaseAmountTextField + '}';
    }
    
    
}
