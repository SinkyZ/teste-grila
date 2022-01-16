package com.snk.testegrila;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class EndQuizzControllerGeography extends QuestionControllerGeography implements Initializable {

    @FXML
    private Label scoreLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        scoreLabel.setText(Integer.toString(finalScore));
    }

}
