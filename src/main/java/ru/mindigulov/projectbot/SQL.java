package ru.mindigulov.projectbot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL {
    Connection connection;
    PreparedStatement statement;
    final String url = "jdbc:postgresql://localhost:5432/Techniks";
    final String user = "postgres";
    final String password = "230493den";



    public SQL() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Коннект выполнен");

    }
    public void setSQL(String sql) throws SQLException {
        statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        connection.close();
    }
}
