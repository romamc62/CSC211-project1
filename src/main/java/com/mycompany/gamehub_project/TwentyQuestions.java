package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Matt R
 */
public class TwentyQuestions {
    @FXML
    private Button StartButton;
    @FXML
    private Button AskButton;
    @FXML
    private Button YesButton;
    @FXML
    private Button NoButton;
    @FXML
    private Button MaybeButton;
    @FXML
    private Button CorrectButton;
    @FXML
    private Button HomeButton;
    @FXML
    private Button PlayAgain;
    @FXML
    private TextField CorrectAnswer;
    @FXML
    private TextField PreviousAnswer;
    @FXML
    private TextField Question;
    @FXML
    private TextField InXGuesses;
    @FXML
    private TextField QuestionNumber;
    @FXML
    private TextField A2Q;
    @FXML
    private TextField Welcome1;
    @FXML
    private TextField Welcome2;
    @FXML
    private TextField OtherGuess;
    @FXML
    private TextField SorryCongrats;
    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
    @FXML
    private void switchToStart() throws IOException {
        GameLogicSetup();
        af();
        Starter(true);
    }
    @FXML
    private void switchToP1() throws IOException {
        af();
        P1(true);
        PreviousAnswer.setText("N/A");
        setqNum();
    }
    @FXML
    private void switchToP1Y() throws IOException {
        af();
        P1(true);
        PreviousAnswer.setText("Yes!");
        setqNum();
        if(getqNum()==21){
           switchToLoss(); 
        }
    }
    @FXML
    private void switchToP1N() throws IOException {
        af();
        P1(true);
        PreviousAnswer.setText("No!");
        setqNum();
        if(getqNum()==21){
           switchToLoss(); 
        }
        
    }
    @FXML
    private void switchToP1M() throws IOException {
        af();
        P1(true);
        PreviousAnswer.setText("Maybe?");
        setqNum();
        if(getqNum()==21){
           switchToLoss(); 
        }
    }
    @FXML
    private void switchToP2() throws IOException {
        
        af();
        P2(true);
    }
    @FXML
    private void switchToWin() throws IOException {
        af();
        SorryCongrats.setText("Congratulations! You guessed:");
        if(getqNum()!=1)
        {
            InXGuesses.setText("in "+getqNum()+" guesses!");
        }
        else
        {
            InXGuesses.setText("in 1 guess!");
        }
        WinLoss(true);
    }
    @FXML
    private void switchToLoss() throws IOException {
        af();
        SorryCongrats.setText("Sorry! The answer was:");
        InXGuesses.setText("Better luck next time!");
        WinLoss(true);
    }
    
   private int qNum;
   
    public void GameLogicSetup(){
        qNum=0;
        CorrectAnswer.setText("");
        
    }
    public int getqNum(){
        return qNum;
    }
    public void setqNum(){
        qNum++;
        QuestionNumber.setText("Question #"+getqNum());
        Question.setText("");
    }

    public void Starter(boolean tf){
        Welcome1.setVisible(tf);
        Welcome2.setVisible(tf);
        CorrectAnswer.setVisible(tf);
        CorrectAnswer.setEditable(true);
        StartButton.setVisible(tf);
    }
    public void P1(boolean tf){
        QuestionNumber.setVisible(tf);
        Question.setVisible(tf);
        Question.setEditable(true);
        AskButton.setVisible(tf);
        A2Q.setVisible(tf);
        CorrectAnswer.setEditable(false);
        PreviousAnswer.setVisible(tf);
    }
    public void P2(boolean tf){
        OtherGuess.setVisible(tf);
        Question.setVisible(tf);
        Question.setEditable(false);    
        YesButton.setVisible(tf);
        NoButton.setVisible(tf);
        MaybeButton.setVisible(tf);
        CorrectButton.setVisible(tf);
    }
    public void WinLoss(boolean tf){
        SorryCongrats.setVisible(tf);
        CorrectAnswer.setVisible(tf);
        InXGuesses.setVisible(tf);
        PlayAgain.setVisible(tf);
        HomeButton.setVisible(tf);
    }
    public void af(){
        Starter(false);
        P1(false);
        P2(false);
        WinLoss(false);
    }
}