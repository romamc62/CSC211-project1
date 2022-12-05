package com.mycompany.gamehub_project;

import java.io.IOException;
import java.util.Scanner;
import javafx.fxml.FXML;

/**
 *
 * @author Matt R
 */
public class TwentyQuestions {

    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
   
    public void GameLogic(){
        Scanner scan = new Scanner(System.in);
    String ans = scan.nextLine().toLowerCase();
    boolean win = false;
    int j=0;
    
    for(int i=1;i<=20;i++)
    {
        System.out.println("Question #"+i);
        String Q = scan.nextLine();
        System.out.println("0=yes, 1=no, 2=maybe, 3 = win");
        int res = scan.nextInt();
            switch (res) {
                case 0: // 0 = Yes
                    System.out.println("The answer to the last Question was Yes");
                case 1: //1 = No
                    System.out.println("The answer to the last Question was No");
                case 2: //2=Maybe
                    System.out.println("The answer to the last Question was Maybe");
                case 3: {
                    //3=You win
                    j=i;
                    i=20;
                    win = true;
                }
            }
    }
    if(win){
        System.out.println("Congratulations, you guessed "+ans+" in "+j+" Questions!");
    }
    else
    {
        System.out.println("Sorry, the answer was: "+ans);
    }
    
    }
}