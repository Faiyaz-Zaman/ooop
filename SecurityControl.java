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
public class SecurityControl implements Serializable{
    private static final long serialVersionUID = 15L;
    private LocalDate AccessDate;
    private Integer SaEmployeeID;
    private String TimeIn;
    private String TimeOut;

    public SecurityControl(LocalDate AccessDate, Integer SaEmployeeID, String TimeIn, String TimeOut) {
        this.AccessDate = AccessDate;
        this.SaEmployeeID = SaEmployeeID;
        this.TimeIn = TimeIn;
        this.TimeOut = TimeOut;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LocalDate getAccessDate() {
        return AccessDate;
    }

    public Integer getSaEmployeeID() {
        return SaEmployeeID;
    }

    public String getTimeIn() {
        return TimeIn;
    }

    public String getTimeOut() {
        return TimeOut;
    }

    public void setAccessDate(LocalDate AccessDate) {
        this.AccessDate = AccessDate;
    }

    public void setSaEmployeeID(Integer SaEmployeeID) {
        this.SaEmployeeID = SaEmployeeID;
    }

    public void setTimeIn(String TimeIn) {
        this.TimeIn = TimeIn;
    }

    public void setTimeOut(String TimeOut) {
        this.TimeOut = TimeOut;
    }

    @Override
    public String toString() {
        return "SecurityControl{" + "AccessDate=" + AccessDate + ", SaEmployeeID=" + SaEmployeeID + ", TimeIn=" + TimeIn + ", TimeOut=" + TimeOut + '}';
    }

}   