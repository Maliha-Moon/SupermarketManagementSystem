/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermarketmanagement;

/**
 *
 * @author DELL
 */
public class SuperMarketManagement {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Attempt to connect to the database
        try {
            DatabaseConnection.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
