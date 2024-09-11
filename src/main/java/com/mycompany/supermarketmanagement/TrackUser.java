/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

/**
 *
 * @author DELL
 */
public class TrackUser {
    private static String loggedInCustomerName;
    private static String loggedInCustomerEmail;

    public static synchronized String getLoggedInCustomerName() {
        return loggedInCustomerName;
    }

    public static synchronized void setLoggedInCustomerName(String loggedInCustomerName) {
        TrackUser.loggedInCustomerName = loggedInCustomerName;
    }

    public static synchronized String getLoggedInCustomerEmail() {
        return loggedInCustomerEmail;
    }

    public static synchronized void setLoggedInCustomerEmail(String loggedInCustomerEmail) {
        TrackUser.loggedInCustomerEmail = loggedInCustomerEmail;
    }
}

