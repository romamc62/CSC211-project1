/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

/**
 *
 * @author Matthew
 */
public class User extends Person{
    protected String Username;
    protected String Password;
    
    public User() {
        Full_Name = "no_name";
        DOB = "no_DOB";
        Username = "no_username";
        Password = "no_password";
    }
    
    public User(String Name, String Birth, String UName, String PWRD) {
        this.Full_Name = Name;
        this.DOB = Birth;
        this.Username = UName;
        this.Password = PWRD;
    }
    
    public void setUName(String UName) {
        this.Username = UName;
    }
    
    public void setPWRD(String PWRD) {
        this.Password = PWRD;
    }
    
    public String getUName() {
        return Username;
    }
    
    public String getPWRD() {
        return Password;
    }
}
