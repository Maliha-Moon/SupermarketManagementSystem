/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;
import java.sql.*;

 /*
 * @author DELL
 */
public class DatabaseConnection {
    //public static void main(String[] args){
        private static final String DB_URL = "jdbc:mysql://localhost:3306/supermarket_login";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "M@lih@123";
        
       public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
//}
