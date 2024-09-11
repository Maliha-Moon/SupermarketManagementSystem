/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Product {

    private int id;
    private String name;
    private String category;
    private ArrayList<String> subcategory;
    private String price;
    private String stock;
   // private String status;
    private String imagePath;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getSubCategory() {
        return subcategory;
    }

    public void setSubCategory(ArrayList<String> subcategory) {
        this.subcategory = subcategory;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public String getImagePath() {
        return imagePath;
    }  // Getter for image path

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }  // Setter for image path

    public static ArrayList<Product> getAllProduct() {

        ArrayList<Product> list = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String Productquery = "SELECT * FROM supermarket_login.product";
        try {
            st = DatabaseConnection.getConnection().prepareStatement(Productquery);
            rs = st.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setSubCategory(new ArrayList<>(Collections.singleton(rs.getString("subcategory"))));
                product.setPrice(rs.getString("price"));
                product.setStock(rs.getString("stock"));
                //product.setStatus(rs.getString("prod_status"));

                String subcategoryString = rs.getString("subcategory");
                ArrayList<String> subcategories = new ArrayList<>();
                if (subcategoryString != null && !subcategoryString.isEmpty()) {
                    String[] subcategoryArray = subcategoryString.split(",");
                    for (String subcategory : subcategoryArray) {
                        subcategories.add(subcategory.trim());
                    }
                }
                product.setSubCategory(subcategories);
                list.add(product);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            // JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    // Method to get subcategories by category
    public static ArrayList<String> getSubCategoriesByCategory(String categoryName) {
        ArrayList<String> subcategoryNames = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT DISTINCT subcategory FROM supermarket_login.product WHERE category = ?";
        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);
            st.setString(1, categoryName);
            rs = st.executeQuery();
            while (rs.next()) {
                String subcategoryString = rs.getString("subcategory");
                if (subcategoryString != null && !subcategoryString.isEmpty()) {
                    String[] subcategoryArray = subcategoryString.split(",");
                    for (String subcategory : subcategoryArray) {
                        subcategoryNames.add(subcategory.trim());
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // JOptionPane.showMessageDialog(null, e);
        }
        return subcategoryNames;
    }

    // Method to fetch products by subcategory
    public static ArrayList<Product> getProductsBySubcategory(String categoryName, String subcategory) {
        ArrayList<Product> products = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT * FROM supermarket_login.product WHERE category = ? AND subcategory LIKE ?";
        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);
            st.setString(1, categoryName);
            st.setString(2, "%" + subcategory + "%"); // Using LIKE for partial matching
            rs = st.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setSubCategory(new ArrayList<>(Collections.singleton(rs.getString("subcategory"))));
                product.setPrice(rs.getString("price"));
                product.setStock(rs.getString("stock"));
                
                product.setImagePath(rs.getString("image_path"));

                // Splitting subcategory string into array list of subcategories
                String subcategoryString = rs.getString("subcategory");
                ArrayList<String> subcategories = new ArrayList<>();
                if (subcategoryString != null && !subcategoryString.isEmpty()) {
                    String[] subcategoryArray = subcategoryString.split(",");
                    for (String sub : subcategoryArray) {
                        subcategories.add(sub.trim());
                    }
                }
                product.setSubCategory(subcategories);

                products.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, e);
        }
        return products;
    }

    public static ArrayList<Product> getProductByName(String name) {
        ArrayList<Product> products = new ArrayList<>();

        PreparedStatement st;
        ResultSet rs;
        String searchQuery = "SELECT * FROM supermarket_login.product WHERE name LIKE ?"; //LIKE -> partial match

        try {
            st = DatabaseConnection.getConnection().prepareStatement(searchQuery);
            st.setString(1, "%" + name + "%");

            rs = st.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setSubCategory(new ArrayList<>(Collections.singleton(rs.getString("subcategory"))));
                product.setPrice(rs.getString("price"));
                product.setStock(rs.getString("stock"));
               
                product.setImagePath(rs.getString("image_path"));

                products.add(product); // Add the product to the list
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void update(Product product) {
        int id = product.getId();
        String ProdName = product.getName();
        String CateName = product.getCategory();
        //String SubCateName = product.getSubCategory().toString();
        String SubCateName = String.join(",", product.getSubCategory());
        String Price = product.getPrice();
        String Stock = product.getStock();
        
        PreparedStatement st;
        String updateQuery = "UPDATE supermarket_login.product SET name = ?, category = ?, subcategory = ?,price = ?, stock = ? WHERE id = ?";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(updateQuery);

            st.setString(1, ProdName);
            st.setString(2, CateName);
            st.setString(3, SubCateName);
            st.setString(4, Price);
            st.setString(5, Stock);
            
            st.setInt(6, id);
            //st.executeUpdate();

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated < 0) {
                // JOptionPane.showMessageDialog(null, "Product updated successfully!");
                //} else {
                JOptionPane.showMessageDialog(null, "Product not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public static void delete(String id) {
        PreparedStatement st;
        String query = "DELETE FROM supermarket_login.product WHERE id = ?";
        try {
            Connection connection = DatabaseConnection.getConnection();
            st = connection.prepareStatement(query);
            st.setString(1, id);
            int rowsDeleted = st.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Product deleted successfully");
                // } else {
                // JOptionPane.showMessageDialog(null, "Product not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
