/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bsccl.Main;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class loginhelper implements Serializable {
     private static final long serialVersionUID = 13L;   
    private int id;
    private String password;
    String typeofuser;

    public loginhelper(int id, String password, String typeofuser) {
        this.id = id;
        this.password = password;
        this.typeofuser = typeofuser;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getTypeofuser() {
        return typeofuser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTypeofuser(String typeofuser) {
        this.typeofuser = typeofuser;
    }
     public String toString() {
        return "LoginInfo: " + "id=" + id + ", pass=" + password + ", type=" + typeofuser;
    }
    
}
