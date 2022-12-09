package com.mycompany.gamehub_project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guzma
 */
public abstract class Game{
    
    private int wins;
    private int losses;
   
    protected enum GameState{
        WINNER,
        LOSER,
        DRAW    
    };
    
    abstract GameState GameLogic();
   
    abstract void GameResult();
    
    public void winCounter(){
        if (GameLogic() == GameState.WINNER) {
            ++this.wins;
        }
        
        else if (GameLogic() == GameState.LOSER) {
            ++this.losses;
        }
        
    }
        
    public void lossCounter(){
        if (GameLogic() == GameState.WINNER) {
            ++this.wins;
        }
        
        else if (GameLogic() == GameState.LOSER) {
            ++this.losses;
        }
        
    }
 
}
