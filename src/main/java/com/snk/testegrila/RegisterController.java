package com.snk.testegrila;

import databases.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class RegisterController {

    @FXML
    private TextField tf_username, tf_email;

    @FXML
    private PasswordField tf_password;

    @FXML
    public void register() throws SQLException {
        DatabaseConnection database = new DatabaseConnection("jdbc:mysql://localhost:3306/javapp?profilleSQL=true", "root", "");
        String username = tf_username.getText();
        String password = tf_password.getText();
        String email = tf_email.getText();
        try {
            if (!database.verifyUsername("members", username)) {
                database.insert(username, password, email);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("User has been registered succesfully!");
                alert.showAndWait();
                SwitchScene switchScene = new SwitchScene("hello-view.fxml", tf_username, 800, 600);
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Username already exists. Please choose another one");
                alert.showAndWait();
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}
