package com.snk.testegrila;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EndQuizzControllerFootball extends QuestionControllerFootball implements Initializable {

    @FXML
    private Label scoreLabel;

    @FXML
    private Button menuButton, logOutbutton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        scoreLabel.setText(Integer.toString(finalScore));
    }

    public void backToMenu() throws IOException {
        SwitchScene switchScene = new SwitchScene("logged-in.fxml", menuButton, 800, 600);
    }

    public void logOut() throws IOException {
        SwitchScene switchScene = new SwitchScene("hello-view.fxml", logOutbutton, 800, 600);
    }

}
