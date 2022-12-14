package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Matthew
 */
public class Create {
    
    @FXML
    private Label Create_Instructions;
    @FXML
    private Label Name_Label;
    @FXML
    private TextField Name_Text_Field;
    @FXML
    private Label DOB_Label;
    @FXML
    private TextField DOB_Text_Field;
    @FXML
    private Label UserName_Label;
    @FXML
    private TextField Username_Text_Field;
    @FXML
    private Label Password_Label;
    @FXML
    private TextField Password_Text_Field;
    @FXML
    private Button All_Done_Button;
    User User1 = new User();
    @FXML
    private void switchToLogin() throws IOException {
        UserStorage.USI.setUser(User1 = new User(Name_Text_Field.getText(), DOB_Text_Field.getText(), Username_Text_Field.getText(), Password_Text_Field.getText()));
        App.setRoot("Login");
    }
}