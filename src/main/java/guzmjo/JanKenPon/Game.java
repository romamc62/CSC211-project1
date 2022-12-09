package guzmjo.JanKenPon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guzma
 */
public abstract class Game {
    
    private int wins;
    private int losses;
    private int highScore;
   
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
        
 
}
