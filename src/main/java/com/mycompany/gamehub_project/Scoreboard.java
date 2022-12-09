package guzmjo.JanKenPon;


import java.io.IOException;
import javafx.scene.input.KeyEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guzma
 */
public interface Scoreboard {
    
    //put a button in fxml and add a onKeyPressed function to it 
    //scoreboard fxml file will show when they press tab
    public void displayScoreboard(KeyEvent e) throws IOException;
       
        /*if (e.getCode() == KeyCode.TAB) {
            Main.setRoot(yourGame.fxml);
        }*/
    
    //add a button to scoreboard fxml
    //repeat the same steps in displayScoreboard() 
    public void switchBack(KeyEvent f, String fxml) throws IOException; 

        /*if (e.getCode() == KeyCode.TAB) {
            Main.setRoot(Original.fxml);
        }*/
    
    
    //still has to be implemented figuring out a way to write to TextFields from controller
    public void setStats();
}
