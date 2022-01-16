package com.snk.testegrila;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchScene {

    public SwitchScene(String fxmlFile, Button button, int width, int height) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage window = (Stage) button.getScene().getWindow();
        window.setScene(new Scene(root, width, height));
    }

    public SwitchScene(String fxmlFile, TextField textField, int width, int height) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage window = (Stage) textField.getScene().getWindow();
        window.setScene(new Scene(root, width, height));
    }
}

