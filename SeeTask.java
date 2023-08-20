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
public class SeeTask implements Serializable {
    private static final long serialVersionUID = 15L;
    private LocalDate TaskDate;
    private int EmployeeID;
    private String TaskPriority;
    private String TaskDetails;
    private String TaskStatus;

    public SeeTask(LocalDate TaskDate, int EmployeeID, String TaskPriority, String TaskDetails, String TaskStatus) {
        this.TaskDate = TaskDate;
        this.EmployeeID = EmployeeID;
        this.TaskPriority = TaskPriority;
        this.TaskDetails = TaskDetails;
        this.TaskStatus = TaskStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public LocalDate getTaskDate() {
        return TaskDate;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getTaskPriority() {
        return TaskPriority;
    }

    public String getTaskDetails() {
        return TaskDetails;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskDate(LocalDate TaskDate) {
        this.TaskDate = TaskDate;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setTaskPriority(String TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    public void setTaskDetails(String TaskDetails) {
        this.TaskDetails = TaskDetails;
    }

    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    @Override
    public String toString() {
        return "SeeTask{" + "TaskDate=" + TaskDate + ", EmployeeID=" + EmployeeID + ", TaskPriority=" + TaskPriority + ", TaskDetails=" + TaskDetails + ", TaskStatus=" + TaskStatus + '}';
    }

}
