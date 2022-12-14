/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class GameHub {

    @FXML
    private Button TicTackToeButton;
    @FXML
    private Button HigherOrLowerButton;
    @FXML
    private Button RockPaperScissorsButton;
    @FXML
    private Button TwentyQuestionsButton;
    @FXML
    private Label GameHub_Label;
    @FXML
    private Label TicTackToe_Label;
    @FXML
    private Label HigherOrLower_Label;
    @FXML
    private Label RockPaperScissors_Label;
    @FXML
    private Label TwentyQuestions_Label;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToTic_Tack_Toe() throws IOException {
        App.setRoot("sample");
    }
    
    @FXML
    private void switchToHigherOrLower() throws IOException {
        App.setRoot("HigherOrLower");
    }
    
    @FXML
    private void switchToRock_Paper_Scissors() throws IOException {
        App.setRoot("JanKenPon");
    }
    
    @FXML
    private void switchTo20Questions() throws IOException {
        App.setRoot("TwentyQuestions");
    }
}
