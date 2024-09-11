/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class BillDAO {

    public static String getId() {
        int id = 1;
        PreparedStatement st = null;
        ResultSet rs = null;
        String query = "SELECT max(id) AS max_id FROM supermarket_login.order_details"; // Fetch the maximum ID
        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);
            rs = st.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return String.valueOf(id);
    }

//    public static void save(Bill bill) {
//        PreparedStatement st;
//        ResultSet rs;
//
//        String orderQuery = "INSERT INTO  supermarket_login.bill(order_id, phone_number, city, address, items, payment, paymethod, order_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//
//        try {
//            st = DatabaseConnection.getConnection().prepareStatement(orderQuery);
//
//            st.setInt(1, bill.getOrderId());
//            st.setString(2, bill.getPhoneNumber());
//            st.setString(3, bill.getAddress());
//            st.setString(4, bill.getCity());
//            st.setInt(5, bill.getTotalItems());
//            st.setDouble(6, bill.getPayment());
//            st.setString(7, bill.getPayMethod());
//            st.setDate(8, new java.sql.Date(bill.getOrderDate().getTime()));
//
//            int rowsInserted = st.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("A new bill was inserted successfully!");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static boolean save(Bill bill) {
        if (bill == null) {
            throw new NullPointerException("Bill object cannot be null");
        }
        PreparedStatement st = null;
        try {
            st = DatabaseConnection.getConnection().prepareStatement("INSERT INTO supermarket_login.bill(order_id, phone_number, city, address, items, payment, paymethod, order_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            st.setInt(1, bill.getOrderId());
            st.setString(2, bill.getPhoneNumber());
            st.setString(3, bill.getAddress());
            st.setString(4, bill.getCity());
            st.setInt(5, bill.getTotalItems());
            st.setDouble(6, bill.getPayment());
            st.setString(7, bill.getPayMethod());
            st.setDate(8, new java.sql.Date(bill.getOrderDate().getTime()));
            int rowsInserted = st.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
