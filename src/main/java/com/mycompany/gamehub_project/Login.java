package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private Button CreateButton;
    @FXML
    private Button GameHubButton;
    @FXML
    private Label Login_Label;
    @FXML
    private Label Create_Desc_Label;
    @FXML
    private Label Username_Label;
    @FXML
    private TextField Username_Text_Field;
    @FXML
    private Label Password_Label;
    @FXML
    private TextField Password_Text_Field;
    @FXML
    private Label Wrong_Username_Password_Label;

    @FXML
    private void switchToCreate() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchToGameHub() throws IOException {
        User User1 = new User();
        if (User1.getUName().equals(Username_Text_Field.getText()) && User1.getPWRD().equals(Password_Text_Field.getText())) {
            App.setRoot("GameHub");
        }
        else {
            Wrong_Username_Password_Label.setVisible(true);
        }
    }
}