/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

/**
 *
 * @author mattr
 */
public class UserStorage {
    public static UserStorage USI = new UserStorage();
    
    private User User1 = new User();
    public void setUser(User u){
        User1 = u;
    }
    public User getUser(){
        return User1;
    }
}
