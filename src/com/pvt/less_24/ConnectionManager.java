package com.pvt.less_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionManager {
    private static ResourceBundle rb = null;
    private static volatile boolean isDriverLoaded = false;
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("com/pvt/less_24/database");
        if (rb == null) {
            URL = "UNDEFINED";
            USER = "UNDEFINED";
            PASSWORD = "UNDEFINED";
            System.out.println("Бандл для db не был инициализирован");
        } else {
            URL = rb.getString("url");
            USER = rb.getString("user");
            PASSWORD = rb.getString("password");
            try {
                Class.forName(rb.getString("driver"));
                isDriverLoaded = true;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws Exception {
        if (!isDriverLoaded) {
            throw new Exception("Драйвер не был загружен");
        }

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new Exception("Ошибка получения соединения " +  e.getMessage());
        }
    }

}
