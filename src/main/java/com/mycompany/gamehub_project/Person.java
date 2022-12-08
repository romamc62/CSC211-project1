/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

/**
 *
 * @author Matthew
 */
public class Person {
    protected String Full_Name;
    protected String DOB;
    
    public Person() {
        Full_Name = "no_name";
        DOB = "no_DOB";
    }
    
    public Person(String Name, String Birth) {
        this.Full_Name = Name;
        this.DOB = Birth;
    }
    
    public void setName(String Name) {
        this.Full_Name = Name;
    }
    
    public void setBirth(String Birth) {
        this.DOB = Birth;
    }
    
    public String getName() {
        return Full_Name;
    }
    
    public String getBirth() {
        return DOB;
    }
  }
    
