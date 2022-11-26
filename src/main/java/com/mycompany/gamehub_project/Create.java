package com.mycompany.gamehub_project;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Matthew
 */
public class Create {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}