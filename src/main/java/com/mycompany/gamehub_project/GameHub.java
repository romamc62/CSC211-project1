/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class GameHub {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToTic_Tack_Toe() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchToHigherOrLower() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchToRock_Paper_Scissors() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchTo20Questions() throws IOException {
        App.setRoot("TwentyQuestions");
    }
}
