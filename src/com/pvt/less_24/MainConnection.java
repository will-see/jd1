package com.pvt.less_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MainConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/books23";
        String username = "root";
        String password = "dimabase";

        System.out.println("Connecting database...");

        try (
                Connection connection = DriverManager.getConnection(url, username, password))

        {
            System.out.println("Database connected!");
        } catch (
                SQLException e)

        {
            throw new IllegalStateException("Cannot connect the database!", e);

        }
    }
}
