package com.pvt.less_24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {
    public static void main(String[] args) throws Exception {
        ResultSet rs1 = null;
        try {
            Connection connection = ConnectionManager.getConnection();
            Statement stmt = connection.createStatement();
            //create
            stmt.executeUpdate("INSERT INTO books (name, ganr, year, id_author) VALUES ('name10', 'ganr10', '0010', '5')");
            System.out.println("value added");
            //read
            rs1 = stmt.executeQuery("SELECT * FROM books");
            while (rs1.next()) {
                System.out.println(rs1.getString("NAME"));
            }
            //update
            stmt.executeUpdate("UPDATE books SET name = 'name11' WHERE id_book='11';");
            System.out.println("value changed");
            //delite
            stmt.executeUpdate("DELETE FROM books WHERE id_book>'10';");
            System.out.println("value delited");


        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs1 != null)
                    rs1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}