/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class orderDAO {

    public static ArrayList<order> getOrdersWithCustomerNames() {
        ArrayList<order> orders = new ArrayList<>();
        String query = "SELECT o.order_id, s.username, o.total_items, o.payment, o.paymethod, o.order_date "
                + "FROM supermarket_login.order_details o "
                + "JOIN supermarket_login.sign_up_info s ON o.username = s.username";

        try (Connection con = DatabaseConnection.getConnection(); PreparedStatement st = con.prepareStatement(query); ResultSet rs = st.executeQuery()) {

            while (rs.next()) {
                order orderObj = new order();
                orderObj.setOrderId(rs.getInt("order_id"));
                orderObj.setUsername(rs.getString("username"));
                //orderObj.setEmail(rs.getString("email"));
                orderObj.setTotalItems(rs.getInt("total_items"));
                orderObj.setPayment(rs.getDouble("payment"));
                orderObj.setPayMethod(rs.getString("paymethod"));
                orderObj.setOrderDate(rs.getDate("order_date"));
                orders.add(orderObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }

    public static int placeOrder(order orderObj) {
        PreparedStatement st;
        ResultSet rs;
        String insertOrderQuery = "INSERT INTO supermarket_login.order_details (username, items, payment, order_date, paymethod) VALUES (?, ?, ?, ?, ?)";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(insertOrderQuery, Statement.RETURN_GENERATED_KEYS);

            // Insert the order details
            st.setString(1, TrackUser.getLoggedInCustomerName()); // Replace with appropriate column
            //st.setString(2, orderObj.getEmail()); // Replace with appropriate column
            st.setInt(2, orderObj.getTotalItems()); // Replace with appropriate column
            st.setDouble(3, orderObj.getPayment()); // Replace with appropriate column
            st.setDate(4, new java.sql.Date(orderObj.getOrderDate().getTime())); // Replace with appropriate column
            st.setString(5, orderObj.getPayMethod()); // Replace with appropriate column
            st.executeUpdate();

            // Retrieve the generated order ID
            rs = st.getGeneratedKeys();
            int orderId = -1;
            if (rs.next()) {
                orderId = rs.getInt(1);
            }
            return orderId;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to place order: " + e.getMessage());
            return -1;
        }
    }

}
