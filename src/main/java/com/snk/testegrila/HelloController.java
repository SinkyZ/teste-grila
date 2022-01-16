package com.snk.testegrila;


import databases.DatabaseConnection;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.*;

public class HelloController {


    @FXML
    protected TextField tf_username;

    @FXML
    protected PasswordField tf_password;

    @FXML
    protected Button button_login, button_signup;


    @FXML
    public void loginButton() throws SQLException, IOException {

        DatabaseConnection database = new DatabaseConnection("jdbc:mysql://localhost:3306/javapp?profilleSQL=true", "root", "");

        if (database.verifyAccount("members", tf_username.getText(), tf_password.getText())) {
            System.out.println("Succesfully logged in.");
            SwitchScene switchScene = new SwitchScene("logged-in.fxml", button_login, 800, 600);
        } else {
            System.out.println("Wrong USERNAME or/and PASSWORD.");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Wrong USERNAME or/and PASSWORD.");
            alert.show();
        }
    }

    @FXML
    public void goToRegister() throws SQLException, IOException {
        SwitchScene switchScene = new SwitchScene("register.fxml", button_signup, 800, 600);
    }

}


