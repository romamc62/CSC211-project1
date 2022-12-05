/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guzmjo.JanKenPon;

import java.util.Random;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


/**
 *
 * @author guzma
 */
public class JanKenPonController {
    
    //private fields
    private static PlayerState playerState;
    private static PlayerState compState;
    
    //enum GameState will decleare if the player has either won, loss or ended in a draw
    private enum GameState {
        WINNER,
        LOSER,
        DRAW;
        
        public static GameState result() {
            if (playerState == PlayerState.ROCK && compState == PlayerState.PAPER) {return LOSER;}
            
            else if (playerState == PlayerState.ROCK && compState == PlayerState.SCISSOR) {return WINNER;}
            
            else if (playerState == PlayerState.PAPER && compState == PlayerState.SCISSOR) {return LOSER;}
            
            else if (playerState == PlayerState.PAPER && compState == PlayerState.ROCK) {return WINNER;}
            
             else if (playerState == PlayerState.SCISSOR && compState == PlayerState.ROCK) {return LOSER;}
            
            else if (playerState == PlayerState.SCISSOR && compState == PlayerState.PAPER) {return WINNER;}
            
            else {return DRAW;}
        }
    }
    
    //enum PlayerState will declare what the Player has chosen as their move (e.g. rock, paper, or scissor
    private enum PlayerState {
        ROCK,
        PAPER,
        SCISSOR;
        
        private static final Random random = new Random();
        
        //will randomly generate a state which will be what the Computer player will use
        public static PlayerState randomState() {
            PlayerState[] playerStates = values();
            return playerStates[random.nextInt(playerStates.length)];
        }
    }       
    
    //method gets called when user has clicked on rock.png
    public void selRock() {
        playerState = PlayerState.ROCK;
        compState = PlayerState.randomState();

        if (GameState.result() != GameState.DRAW) {
            Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "You're the " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
        }
        
        else {
             Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "The game ended in a " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
               
        }
    }
    
    //method gets called when user has clicked on paper.png
    public void selPaper() {
        playerState = PlayerState.PAPER;
        compState = PlayerState.randomState();
        
        if (GameState.result() != GameState.DRAW) {
            Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "You're the " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
        }
        
        else {
             Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "The game ended in a " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
               
        }
    }
    
    //method gets called when user has clicked on scissor.png
    public void selScissor() {
        playerState = PlayerState.SCISSOR;
        compState = PlayerState.randomState();
        
        if (GameState.result() != GameState.DRAW) {
            Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "You're the " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
        }
        
        else {
             Alert alert = new Alert(AlertType.CONFIRMATION, "The Computer picked " + compState.toString().toLowerCase() + ".\n" + "The game ended in a " + 
                    GameState.result().toString().toLowerCase() + "!\nWould you like to play again?" );
            alert.showAndWait(); 
               
        }
    }
    
   
}
