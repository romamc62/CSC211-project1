package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Login {

    @FXML
    private Button CreateButton;
    @FXML
    private Button GameHubButton;

    @FXML
    private void switchToCreate() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
}