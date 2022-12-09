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
public class JanKenPonController extends Game {
    
    //private fields
    private static PlayerState playerState;
    private static PlayerState compState;
    
    //enum GameState will decleare if the player has either won, loss or ended in a draw
  
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

        GameResult();                   
    }
    
    //method gets called when user has clicked on paper.png
    public void selPaper() {
        playerState = PlayerState.PAPER;
        compState = PlayerState.randomState();
        
        GameResult(); 
    }
    
    //method gets called when user has clicked on scissor.png
    public void selScissor() {
        playerState = PlayerState.SCISSOR;
        compState = PlayerState.randomState();
        
        GameResult();  
        super.winCounter();
    }
    
   
}
