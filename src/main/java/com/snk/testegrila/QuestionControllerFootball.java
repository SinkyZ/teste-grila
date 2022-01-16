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

public class QuestionControllerFootball implements Initializable {

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
            next_Question.setText(QuizFootball.questions[index]);
            aButton.setText(QuizFootball.options[0][0]);
            bButton.setText(QuizFootball.options[0][1]);
            cButton.setText(QuizFootball.options[0][2]);
            dButton.setText(QuizFootball.options[0][3]);
            startProgress();
        }
        if (LoggedInControler.diff == "Medium") {
            progressTimerMedium = new ProgressTimerMedium(timeProgress);
            next_Question.setText(QuizFootball.questionsMedium[index]);
            aButton.setText(QuizFootball.optionsMedium[0][0]);
            bButton.setText(QuizFootball.optionsMedium[0][1]);
            cButton.setText(QuizFootball.optionsMedium[0][2]);
            dButton.setText(QuizFootball.optionsMedium[0][3]);
            startProgressMedium();
        }
        if(LoggedInControler.diff == "Hard"){
            progressTimerHard = new ProgressTimerHard(timeProgress);
            next_Question.setText(QuizFootball.questionsHard[index]);
            aButton.setText(QuizFootball.optionsHard[0][0]);
            bButton.setText(QuizFootball.optionsHard[0][1]);
            cButton.setText(QuizFootball.optionsHard[0][2]);
            dButton.setText(QuizFootball.optionsHard[0][3]);
            startProgressHard();
        }
    }


    public void nextQuestion() {
        if (LoggedInControler.diff == "Easy") {
            index++;
            next_Question.setText(QuizFootball.questions[index]);
            aButton.setText(QuizFootball.options[index][0]);
            bButton.setText(QuizFootball.options[index][1]);
            cButton.setText(QuizFootball.options[index][2]);
            dButton.setText(QuizFootball.options[index][3]);
            counter++;
        }
        if (LoggedInControler.diff == "Medium") {
            index++;
            next_Question.setText(QuizFootball.questionsMedium[index]);
            aButton.setText(QuizFootball.optionsMedium[index][0]);
            bButton.setText(QuizFootball.optionsMedium[index][1]);
            cButton.setText(QuizFootball.optionsMedium[index][2]);
            dButton.setText(QuizFootball.optionsMedium[index][3]);
            counter++;
        }
        if(LoggedInControler.diff == "Hard"){
            index++;
            next_Question.setText(QuizFootball.questionsHard[index]);
            aButton.setText(QuizFootball.optionsHard[index][0]);
            bButton.setText(QuizFootball.optionsHard[index][1]);
            cButton.setText(QuizFootball.optionsHard[index][2]);
            dButton.setText(QuizFootball.optionsHard[index][3]);
            counter++;
        }

    }

    public void countScoreA() {
        if (timeProgress.getProgress() < 1) {
            if (counter < 10) {
                try {
                    if (LoggedInControler.diff == "Easy") {
                        if (aButton.getText() == QuizFootball.correctAnswers[index]) {
                            score += 10;
                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (aButton.getText() == QuizFootball.correctAnswersMedium[index]) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(aButton.getText() == QuizFootball.correctAnswersHard[index]){
                            score+=10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Congratulations! Please sumbit your result!");
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
                        if (Objects.equals(bButton.getText(), QuizFootball.correctAnswers[index])) {
                            score += 10;

                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (Objects.equals(bButton.getText(), QuizFootball.correctAnswersMedium[index])) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(bButton.getText() == QuizFootball.correctAnswersHard[index]){
                            score += 10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Congratulations! Please sumbit your result!");
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
                        if (cButton.getText() == QuizFootball.correctAnswers[index]) {
                            score += 10;

                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (cButton.getText() == QuizFootball.correctAnswersMedium[index]) {
                            score += 10;

                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(cButton.getText() == QuizFootball.correctAnswersHard[index]){
                            score +=10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Congratulations! Please sumbit your result!");
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
                        if (Objects.equals(dButton.getText(), QuizFootball.correctAnswers[index])) {
                            score += 10;
                        }
                    }
                    if (LoggedInControler.diff == "Medium") {
                        if (dButton.getText() == QuizFootball.correctAnswersMedium[index]) {
                            score += 10;
                        }
                    }
                    if(LoggedInControler.diff == "Hard"){
                        if(dButton.getText() == QuizFootball.correctAnswersHard[index]){
                            score += 10;
                        }
                    }
                    nextQuestion();
                } catch (ArrayIndexOutOfBoundsException e) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Congratulations! Please sumbit your result!");
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
            SwitchScene switchScene = new SwitchScene("end-quizFootball.fxml", end_game, 800, 600);
            return;
        }
        if (index == 10) {
            finalScore = score;
            SwitchScene switchScene = new SwitchScene("end-quizFootball.fxml", end_game, 800, 600);
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
