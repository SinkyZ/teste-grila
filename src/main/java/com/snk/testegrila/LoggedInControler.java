package com.snk.testegrila;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoggedInControler implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    @FXML
    private Button button_history, button_geography, button_football, button_tennis;

    private String[] difficultyList = {"Easy", "Medium", "Hard"};

    public static String diff;


    @FXML
    public void enterHistory() throws IOException {
        if (myChoiceBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("You must choose a difficulty before you start a Quiz");
            alert.show();
        }
        diff = myChoiceBox.getValue();
        if (myChoiceBox.getValue() != null) {
            diff = myChoiceBox.getValue();
            SwitchScene switchScene = new SwitchScene("question.fxml", button_history, 800, 600);
        }
    }

    @FXML
    public void enterGeography() throws IOException {
        if (myChoiceBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("You must choose a difficulty before you start a Quiz");
            alert.show();
        }
        if (myChoiceBox.getValue() != null) {
            diff = myChoiceBox.getValue();
            SwitchScene switchScene = new SwitchScene("questionsGeography.fxml", button_geography, 800, 600);
        }
    }

    @FXML
    public void enterFootball() throws IOException {
        if (myChoiceBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("You must choose a difficulty before you start a Quiz");
            alert.show();
        } else {
            diff = myChoiceBox.getValue();
            SwitchScene switchScene = new SwitchScene("questionsFootball.fxml", button_football, 800, 600);
        }
    }

    @FXML
    public void enterTennis() throws IOException {
        if (myChoiceBox.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("You must choose a difficulty before you start a Quiz");
            alert.show();
        } else {
            diff = myChoiceBox.getValue();
            SwitchScene switchScene = new SwitchScene("questionsTennis.fxml", button_tennis, 800, 600);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(difficultyList);
        myChoiceBox.setOnAction(this::getDifficulty);
    }

    public void getDifficulty(ActionEvent event) {
        String myDifficulty = myChoiceBox.getValue();
        System.out.println(myChoiceBox.getValue());
        myLabel.setText(myDifficulty);
    }

}
