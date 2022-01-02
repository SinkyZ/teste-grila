package com.snk.testegrila;

import databases.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class HelloController {

    @FXML
    protected TextField tf_username;

    @FXML
    protected PasswordField tf_password;

    @FXML
    protected void loginButton() throws SQLException {
        DatabaseConnection database = new DatabaseConnection("jdbc:mysql://localhost:3306/javapp", "root", "");
        System.out.println(database.verify("members", tf_username.getText(), tf_password.getText()));
    }


}