<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Matthew
 */
public class HigherOrLower {

    @FXML
    private Button StartButton;
    @FXML
    private Button BackButton;
    @FXML
    private TextField FirstCardFlip;
    @FXML
    private TextField SecondCardFlip;
    @FXML
    private TextField HigherOrLowerQuestionBox;
    @FXML
    private Button HigherButton;
    @FXML
    private Button LowerButton;
    @FXML
    private Button Play_Again_Button;
    
    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
    
    public static int HigherOrLower () {
       Random card = new Random();
       int min = 1;
       int max = 12;
       int Result = card.nextInt(max - min + 1) + min;
    return Result;
   }
  public static void Main() {
      //Scanner guess = new Scanner(System.in);
      HigherOrLower();
      int User_flip = HigherOrLower();
      if (User_flip == HigherOrLower()) {
        System.out.println("You Win!");
      }
      else {
        System.out.println("You lose!");
      }
  }

    @FXML
    private void Start_Button_Clicked(ActionEvent event) {
        FirstCardFlip.setVisible(true);
        Play_Again_Button.setVisible(true);
        LowerButton.setVisible(true);
        HigherButton.setVisible(true);
        HigherOrLowerQuestionBox.setVisible(true);
        SecondCardFlip.setVisible(true);
        StartButton.setVisible(false);
        FirstCardFlip.setText("" + HigherOrLower());
    }

    @FXML
    private void Higher_Button_Clicked(ActionEvent event) {
        SecondCardFlip.setText("" + HigherOrLower());
        String FirstNumber = FirstCardFlip.getText();
        String SecNumber = SecondCardFlip.getText();
        Integer.parseInt(SecNumber);
        Integer.parseInt(FirstNumber);
        if (Integer.parseInt(FirstNumber) < Integer.parseInt(SecNumber)) {
            HigherOrLowerQuestionBox.setText("You Win!");
        }
        else {
            HigherOrLowerQuestionBox.setText("You Lose!");
        }
    }

    @FXML
    private void Lower_Button_Clicked(ActionEvent event) {
        SecondCardFlip.setText("" + HigherOrLower());
        String FirstNumber = FirstCardFlip.getText();
        String SecNumber = SecondCardFlip.getText();
        Integer.parseInt(SecNumber);
        Integer.parseInt(FirstNumber);
        if (Integer.parseInt(FirstNumber) > Integer.parseInt(SecNumber)) {
            HigherOrLowerQuestionBox.setText("You Win!");
        }
        else {
            HigherOrLowerQuestionBox.setText("You Lose!");
        }
    }

    @FXML
    private void Play_Again_Button_Clicked(ActionEvent event) throws IOException {
        App.setRoot("HigherOrLower");
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamehub_project;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Matthew
 */
public class HigherOrLower {

    @FXML
    private Button StartButton;
    @FXML
    private Button BackButton;
    @FXML
    private TextField FirstCardFlip;
    @FXML
    private TextField SecondCardFlip;
    @FXML
    private TextField HigherOrLowerQuestionBox;
    @FXML
    private Button HigherButton;
    @FXML
    private Button LowerButton;
    @FXML
    private Button Play_Again_Button;
    
    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
    
    public static int HigherOrLower () {
       Random card = new Random();
       int min = 1;
       int max = 12;
       int Result = card.nextInt(max - min + 1) + min;
    return Result;
   }
  public static void Main() {
      //Scanner guess = new Scanner(System.in);
      HigherOrLower();
      int User_flip = HigherOrLower();
      if (User_flip == HigherOrLower()) {
        System.out.println("You Win!");
      }
      else {
        System.out.println("You lose!");
      }
  }

    @FXML
    private void Start_Button_Clicked(ActionEvent event) {
        FirstCardFlip.setVisible(true);
        Play_Again_Button.setVisible(true);
        LowerButton.setVisible(true);
        HigherButton.setVisible(true);
        HigherOrLowerQuestionBox.setVisible(true);
        SecondCardFlip.setVisible(true);
        StartButton.setVisible(false);
        FirstCardFlip.setText("" + HigherOrLower());
    }

    @FXML
    private void Higher_Button_Clicked(ActionEvent event) {
        SecondCardFlip.setText("" + HigherOrLower());
        String FirstNumber = FirstCardFlip.getText();
        String SecNumber = SecondCardFlip.getText();
        Integer.parseInt(SecNumber);
        Integer.parseInt(FirstNumber);
        if (Integer.parseInt(FirstNumber) < Integer.parseInt(SecNumber)) {
            HigherOrLowerQuestionBox.setText("You Win!");
        }
        else {
            HigherOrLowerQuestionBox.setText("You Lose!");
        }
    }

    @FXML
    private void Lower_Button_Clicked(ActionEvent event) {
        SecondCardFlip.setText("" + HigherOrLower());
        String FirstNumber = FirstCardFlip.getText();
        String SecNumber = SecondCardFlip.getText();
        Integer.parseInt(SecNumber);
        Integer.parseInt(FirstNumber);
        if (Integer.parseInt(FirstNumber) > Integer.parseInt(SecNumber)) {
            HigherOrLowerQuestionBox.setText("You Win!");
        }
        else {
            HigherOrLowerQuestionBox.setText("You Lose!");
        }
    }

    @FXML
    private void Play_Again_Button_Clicked(ActionEvent event) throws IOException {
        App.setRoot("HigherOrLower");
    }
}
>>>>>>> 38990ea11eb6ccec7b5557d2912962379a0e7abc
