package com.mycompany.gamehub_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Text winnerText;
    private int playerTurn = 0;
    ArrayList<Button> buttons;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));

        buttons.forEach(button ->{
            setupButton(button);
            button.setFocusTraversable(false);
        });
    }

    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(this::resetButton);
        winnerText.setText("Tic Tac Toe");
    }
    public void resetButton(Button button){
        button.setDisable(false);
        button.setText("");
    }
    private void setupButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(button);
            button.setDisable(true);
            checkIfGameIsOver();
        });
    }

    public void setPlayerSymbol(Button button){
        if(playerTurn % 2 == 0){
            button.setText("X");
            playerTurn = 1;
        } else{
            button.setText("O");
            playerTurn = 0;
        }
    }

    public void checkIfGameIsOver(){
        String line="";
        for (int a = 0; a < 8; a++) {
                switch (a) {
                case 0: 
                    line = button1.getText() + button2.getText() + button3.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 1: 
                    line = button4.getText() + button5.getText() + button6.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 2: 
                    line = button7.getText() + button8.getText() + button9.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 3: 
                    line = button1.getText() + button5.getText() + button9.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 4: 
                    line = button3.getText() + button5.getText() + button7.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 5:
                    line = button1.getText() + button4.getText() + button7.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 6:
                    line = button2.getText() + button5.getText() + button8.getText();
                    if(checkWin(line)){
                        break;
                    }
                case 7: 
                    line = button3.getText() + button6.getText() + button9.getText();
                    if(checkWin(line)){
                        break;
                    }
            }
        } 
    }
    public boolean checkWin(String l){
        switch (l) {
            case "XXX":
                winnerText.setText("X won!");
                return true;
            case "OOO":
                winnerText.setText("O won!");
                return true;
            default:
                return false;
        }
    }
}