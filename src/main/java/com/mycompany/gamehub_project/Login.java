package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;

public class Login {

    @FXML
    private void switchToCreate() throws IOException {
        App.setRoot("Create");
    }
    
    @FXML
    private void switchToGameHub() throws IOException {
        App.setRoot("GameHub");
    }
}