package com.snk.testegrila;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EndQuizzController extends QuestionControllerHistory implements Initializable {

    @FXML
    private Label scoreLabel;

    @FXML
    private Button menuButton, logOutbutton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        scoreLabel.setText(Integer.toString(finalScore));
    }

    /**
     * Metoda pentru a ne intoarce la meniul de Quiz-uri prin apasarea butonului corespunzator
     */
    public void backToMenu() throws IOException {
        SwitchScene switchScene = new SwitchScene("logged-in.fxml", menuButton, 800, 600);
    }

    /**
     * Metoda pentru a ne intoarce inapoi la Log-in prin apasarea butonului corespunzator
     */
    public void logOut() throws IOException {
        SwitchScene switchScene = new SwitchScene("hello-view.fxml", logOutbutton, 800, 600);
    }

}