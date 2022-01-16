package databases;

import java.sql.*;

public class DatabaseConnection {
    public Connection connection;
    private Statement statement;
    private ResultSet result;

    public DatabaseConnection(String url, String username, String password) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
    }

    public void insert(String username, String password, String email) throws SQLException {
        String test = "123";
        statement.executeUpdate("INSERT INTO members VALUES (null,'" + username + "','" + password + "','" + email + "')");
    }

    public void select(String queryParam) throws SQLException {
        result = statement.executeQuery("SELECT * FROM " + queryParam);
    }

    public void printData() throws SQLException {
        while (result.next()) {
            System.out.println(result.getInt("_id") + " " + result.getString("username") + " " +
                    result.getString("password") + " " + result.getString("email"));
        }
    }

    public boolean verifyAccount(String queryParam, String username, String password) throws SQLException {
        ResultSet verifiedThing = statement.executeQuery("SELECT username, password FROM " + queryParam +
                " WHERE username = '" + username + "' and password ='" + password + "'");
        return verifiedThing.first();
    }

    public boolean verifyUsername(String queryParam, String username) throws SQLException {
        ResultSet verifiedUsername = statement.executeQuery("SELECT username FROM " + queryParam + " WHERE username =  '" + username + "'");
        return verifiedUsername.first();
    }
}




   /* public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javapp", "root", "");

        Statement statement = connection.createStatement();

        ResultSet result = statement.executeQuery("select * from members");

        while (result.next()) {
            System.out.println(result.getInt("_id") + " " + result.getString("username") + " " + result.getString("password") + " " + result.getString("email"));
        }
    }*/