/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

import java.io.IOException;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

/**
 *
 * @author guzma
 */
public class JanKenPonController extends Game /*implements Scoreboard*/{
    
  
    private static PlayerState playerState;
    private static PlayerState compState;
   
    @Override
    public GameState GameLogic() {
            if (playerState == PlayerState.ROCK && compState == PlayerState.PAPER) {return GameState.LOSER;}            
            else if (playerState == PlayerState.ROCK && compState == PlayerState.SCISSOR) {return GameState.WINNER;}
            else if (playerState == PlayerState.PAPER && compState == PlayerState.SCISSOR) {return GameState.LOSER;}
            else if (playerState == PlayerState.PAPER && compState == PlayerState.SCISSOR) {return GameState.WINNER;}
            else if (playerState == PlayerState.SCISSOR && compState == PlayerState.ROCK) {return GameState.LOSER;}
            else if (playerState == PlayerState.SCISSOR && compState == PlayerState.PAPER) {return GameState.WINNER;}
            else {return GameState.DRAW;}
        }
    
    @Override
    public void GameResult() {
         if (GameLogic() != GameState.DRAW) {
            Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "You're the " + 
                    GameLogic().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
        }
        
        else {
             Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "The game ended in a " + 
                    GameLogic().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait();        
        } 
    }

    /*@Override
    public void switchBack(KeyEvent f, String fxml) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setStats() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
    
    private enum PlayerState {
        ROCK,
        PAPER,
        SCISSOR;
        
        private static final Random random = new Random();
              
        public static PlayerState randomState() {
            PlayerState[] playerStates = values();
            return playerStates[random.nextInt(playerStates.length)];
        }
    }       
    
    
    public void selRock() {
        playerState = PlayerState.ROCK;
        compState = PlayerState.randomState();
        
        GameResult();                   
    }
        
    public void selPaper() {
        playerState = PlayerState.PAPER;
        compState = PlayerState.randomState();
        
        GameResult(); 
    }
        
    public void selScissor() {
        playerState = PlayerState.SCISSOR;
        compState = PlayerState.randomState();
        
        GameResult();  
    }
    
   
    
    @FXML
    public void setStats(KeyEvent g) throws IOException{
        //supposed to set text to textFields but couldn't get it to work
        //:(
    }
    
    
    /*@FXML
    @Override
    public void switchBack(KeyEvent f) throws IOException {
        if (f.getCode() == KeyCode.TAB) {
            Main.setRoot("JanKenPon");
        }
    }*/
   
    
}
