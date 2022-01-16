package com.snk.testegrila;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.ProgressBar;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class QuestionControllerTennis implements Initializable {

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private ProgressIndicator timeProgress;

    @FXML
    private Button aButton, bButton, cButton, dButton, end_game;

    @FXML
    private Label questionLabel, next_Question;

    private ProgressTimer progressTimer;

    private ProgressTimerMedium progressTimerMedium;

    private ProgressTimerHard progressTimerHard;

    private BigDecimal progress = new BigDecimal(String.format("%.2f", 0.0));

    private int index = 0, counter = 0, score = 0;

    public static int finalScore = 0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressBar.setStyle("-fx-accent: #0ba123;");
        questionLabel.setText("1/10");
        if (LoggedInControler.diff == "Easy") {
            progressTimer = new ProgressTimer(timeProgress);
            next_Question.setText(QuizTennis.questions[index]);
            aButton.setText(QuizTennis.options[0][0]);
            bButton.setText(QuizTennis.options[0][1]);
            cButton.setText(QuizTennis.options[0][2]);
            dButton.setText(QuizTennis.options[0][3]);
            startProgress();
        }
        if (LoggedInControler.diff == "Medium") {
            progressTimerMedium = new ProgressTimerMedium(timeProgress);
            next_Question.setText(QuizTennis.questionsMedium[index]);
            aButton.setText(QuizTennis.optionsMedium[0][0]);
            bButton.setText(QuizTennis.optionsMedium[0][1]);
            cButton.setText(QuizTennis.optionsMedium[0][2]);
            dButton.setText(QuizTennis.optionsMedium[0][3]);
            startProgressMedium();
        }
        if(LoggedInControler.diff == "Hard"){
            progressTimerHard = new ProgressTimerHard(timeProgress);
            next_Question.setText(QuizTennis.questionsHard[index]);
            aButton.setText(QuizTennis.optionsHard[0][0]);
            bButton.setText(QuizTennis.optionsHard[0][1]);
            cButton.setText(QuizTennis.optionsHard[0][2]);
            dButton.setText(QuizTennis.optionsHard[0][3]);
            startProgressHard();
        }
    }


    public void nextQuestion() {
        if (LoggedInControler.diff == "Easy") {
            index++;
            next_Question.setText(QuizTennis.questions[index]);
            aButton.setText(QuizTennis.options[index][0]);
            bButton.setText(QuizTennis.options[index][1]);
            cButton.setText(QuizTennis.options[index][2]);
            dButton.setText(QuizTennis.options[index][3]);
            counter++;
        }
        if (LoggedInControler.diff == "Medium") {
            index++;
            next_Question.setText(QuizTennis.questionsMedium[index]);
            aButton.setText(QuizTennis.optionsMedium[index][0]);
            bButton.setText(QuizTennis.optionsMedium[index][1]);
            cButton.setText(QuizTennis.optionsMedium[index][2]);
            dButton.setText(QuizTennis.optionsMedium[index][3]);
            counter++;
        }
        if(LoggedInControler.diff == "Hard"){
            index++;
            next_Question.setText(QuizTennis.questionsHard[index]);
            aButton.setText(QuizTennis.optionsHard[index][0]);
            bButton.setText(QuizTennis.optionsHard[index][1]);
            cButton.setText(QuizTennis.optionsHard[index][2]);
            dButton.setText(QuizTennis.optionsHard[index][3]);
            counter++;
        }

    }

    public void countScoreA() {
        if (timeProgress.getProgress() < 1) {
            if (counter < 10) {
                try {
                    if (LoggedInControler.diff == "Easy") {
                        if (aButton.getText() == QuizTennis.correctAnswers[index]) {
                            score += 10;
                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (aButton.getText() == QuizTennis.correctAnswersMedium[index]) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(aButton.getText() == QuizTennis.correctAnswersHard[index]){
                            score+=10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("BRAVO");
                    alert.show();
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Your time is up, sumbit the result to see your score");
            alert.show();
        }
    }

    public void countScoreB() {
        if(timeProgress.getProgress() < 1) {
            if (counter < 10) {
                try {
                    if (LoggedInControler.diff == "Easy") {
                        if (Objects.equals(bButton.getText(), QuizTennis.correctAnswers[index])) {
                            score += 10;

                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (Objects.equals(bButton.getText(), QuizTennis.correctAnswersMedium[index])) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(bButton.getText() == QuizTennis.correctAnswersHard[index]){
                            score += 10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("BRAVO");
                    alert.show();
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Your time is up, sumbit the result to see your score");
            alert.show();
        }
    }

    public void countScoreC() {
        if (timeProgress.getProgress() < 1) {
            if (counter < 10) {
                try {
                    if (LoggedInControler.diff == "Easy") {
                        if (cButton.getText() == QuizTennis.correctAnswers[index]) {
                            score += 10;

                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (cButton.getText() == QuizTennis.correctAnswersMedium[index]) {
                            score += 10;

                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(cButton.getText() == QuizTennis.correctAnswersHard[index]){
                            score +=10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("BRAVO");
                    alert.show();
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Your time is up, sumbit the result to see your score");
            alert.show();
        }
    }

    public void countScoreD() {
        if (timeProgress.getProgress() < 1) {
            if (counter < 10) {
                try {
                    if (LoggedInControler.diff == "Easy") {
                        if (Objects.equals(dButton.getText(), QuizTennis.correctAnswers[index])) {
                            score += 10;
                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (dButton.getText() == QuizTennis.correctAnswersMedium[index]) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(dButton.getText() == QuizTennis.correctAnswersHard[index]){
                            score += 10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("BRAVO");
                    alert.show();
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Your time is up, sumbit the result to see your score");
            alert.show();
        }
    }


    public void endQuiz() throws IOException {
        if(timeProgress.getProgress() > 1){
            finalScore = score;
            SwitchScene switchScene = new SwitchScene("end-quizTennis.fxml", end_game, 800, 600);
            return;
        }
        if (index == 10) {
            finalScore = score;
            SwitchScene switchScene = new SwitchScene("end-quizTennis.fxml", end_game, 800, 600);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("You still have a few questions left");
            alert.show();
        }
    }


    public void increaseProgressBar() {
        if (timeProgress.getProgress() < 1) {
            if (progress.doubleValue() < 1) {
                progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
                System.out.println("Progress: " + progress.doubleValue());
                myProgressBar.setProgress(progress.doubleValue());
            }

            if (!Objects.equals(questionLabel.getText(), "10/10")) {
                questionLabel.setText(Integer.toString((int) Math.round(progress.doubleValue() * 10) + 1) + "/10");
            }
            System.out.println(timeProgress.getProgress());
        }
    }

    public void startProgress() {
        Thread thread = new Thread(progressTimer);
        thread.setDaemon(true);
        thread.start();
    }

    public void startProgressMedium(){
        Thread thread = new Thread(progressTimerMedium);
        thread.setDaemon(true);
        thread.start();
    }

    public void startProgressHard(){
        Thread thread = new Thread(progressTimerHard);
        thread.setDaemon(true);
        thread.start();
    }


}
