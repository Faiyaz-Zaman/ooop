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
public class ExpenditureReq implements Serializable{
    private static final long serialVersionUID = 15L;
    private String ExpenditureTitle;
    private String ExpenditureDetails;
    private String ExpenditureAmount;

    public ExpenditureReq(String ExpenditureTitle, String ExpenditureDetails, String ExpenditureAmount) {
        this.ExpenditureTitle = ExpenditureTitle;
        this.ExpenditureDetails = ExpenditureDetails;
        this.ExpenditureAmount = ExpenditureAmount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getExpenditureTitle() {
        return ExpenditureTitle;
    }

    public String getExpenditureDetails() {
        return ExpenditureDetails;
    }

    public String getExpenditureAmount() {
        return ExpenditureAmount;
    }

    public void setExpenditureTitle(String ExpenditureTitle) {
        this.ExpenditureTitle = ExpenditureTitle;
    }

    public void setExpenditureDetails(String ExpenditureDetails) {
        this.ExpenditureDetails = ExpenditureDetails;
    }

    public void setExpenditureAmount(String ExpenditureAmount) {
        this.ExpenditureAmount = ExpenditureAmount;
    }

    @Override
    public String toString() {
        return "ExpenditureReq{" + "ExpenditureTitle=" + ExpenditureTitle + ", ExpenditureDetails=" + ExpenditureDetails + ", ExpenditureAmount=" + ExpenditureAmount + '}';
    }

}