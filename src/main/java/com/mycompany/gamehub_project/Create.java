package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Matthew
 */
public class Create {

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("Login");
    }
}