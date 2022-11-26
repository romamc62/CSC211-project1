package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;

public class Login {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
