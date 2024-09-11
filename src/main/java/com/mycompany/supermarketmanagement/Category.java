/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Category {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Category> getAllCategory() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        PreparedStatement st;
        ResultSet rs;

        ArrayList<Category> arrayList = new ArrayList<>();

        String query2 = "SELECT * FROM supermarket_login.category";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(query2);
            rs = st.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        PreparedStatement st;
        String query = "DELETE FROM supermarket_login.category WHERE id = ?";

        try {
            Connection connection = DatabaseConnection.getConnection();
            st = connection.prepareStatement(query);
            st.setString(1, id);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Category deleted successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
