/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
//import java.util.Queue;
//import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
//import javax.swing.Timer;

/**
 *
 * @author DELL
 */
public class AdminPanel extends javax.swing.JFrame {

    //private ArrayList<Product> notificationList = new ArrayList<>();
    private JPanel notificationsPanel;
    private JDialog notificationDialog;
    private LinkedList<Product> productQueue;

    public AdminPanel() {
        initComponents();
        setProductIcon("C:\\Users\\DELL\\Downloads\\new-product (1).png", 128, 128);
        setCategoryIcon("C:\\Users\\DELL\\Downloads\\to-do-list.png",128,128);
        setUpdateIcon("C:\\Users\\DELL\\Downloads\\updated.png",128,128);
        
        productQueue = new LinkedList<>();

        int itemCount = getTotalSoldNumber();
        //itemsLabel.setText(String.valueOf(itemCount));
        String item = String.valueOf(itemCount);
        SwingUtilities.invokeLater(() -> jLabel_soldItem.setText(item)); //handling component update
        jLabel_soldItem.revalidate();
        jLabel_soldItem.repaint();

        double Total = getTotalIncome();
        //jLabel_grandTotal.setText(String.valueOf(grandTotal));
        String TotalIncome = String.valueOf(Total);
        SwingUtilities.invokeLater(() -> jLabel_totalIncome.setText(TotalIncome));
        jLabel_totalIncome.revalidate();
        jLabel_totalIncome.repaint();

        simulateStockUpdate(); // Call stock update on initialization
//        notificationsPanel = new JPanel();
//        notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_addCategory = new javax.swing.JButton();
        jButton_AddProduct = new javax.swing.JButton();
        jButton_updateProduct = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_soldItem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_totalIncome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 18, 59));

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Welcome");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Admin!");

        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 18, 59));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        jButton_addCategory.setBackground(new java.awt.Color(255, 204, 204));
        jButton_addCategory.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jButton_addCategory.setForeground(new java.awt.Color(255, 255, 255));
        jButton_addCategory.setBorder(null);
        jButton_addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addCategoryActionPerformed(evt);
            }
        });

        jButton_AddProduct.setBackground(new java.awt.Color(255, 204, 204));
        jButton_AddProduct.setBorder(null);
        jButton_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddProductActionPerformed(evt);
            }
        });

        jButton_updateProduct.setBackground(new java.awt.Color(255, 204, 204));
        jButton_updateProduct.setBorder(null);
        jButton_updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateProductActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 18, 59));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("      Total Sold Product");

        jLabel_soldItem.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel_soldItem.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_soldItem.setText("            00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel_soldItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_soldItem, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 18, 59));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("              Total Income");

        jLabel_totalIncome.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jLabel_totalIncome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_totalIncome.setText("  000.oo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_totalIncome)
                .addGap(97, 97, 97))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_totalIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_addCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButton_AddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jButton_updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_addCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jButton_AddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_updateProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateProductActionPerformed
        // TODO add your handling code here:
        EditDeleteProduct obj = new EditDeleteProduct();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Close the current login form
        this.dispose();
    }//GEN-LAST:event_jButton_updateProductActionPerformed

    private void jButton_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddProductActionPerformed
        // TODO add your handling code here:
        ProductManagement obj = new ProductManagement();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Close the current login form
        this.dispose();

    }//GEN-LAST:event_jButton_AddProductActionPerformed

    private void jButton_addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addCategoryActionPerformed
        // TODO add your handling code here:
        CategoryMnagement obj = new CategoryMnagement();
        obj.setVisible(true);
        obj.pack();
        obj.setLocationRelativeTo(null);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Close the current login form
        this.dispose();
    }//GEN-LAST:event_jButton_addCategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Dispose the current frame (AdminPanel)
        this.dispose();

        // Redirect to the login screen
        AdminLogin login = new AdminLogin();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void simulateStockUpdate() {
        PreparedStatement st = null;
        ResultSet rs = null;

        String query = "SELECT * FROM supermarket_login.product";
        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);
            rs = st.executeQuery(); // Execute the query and get the ResultSet

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setSubCategory(new ArrayList<>(Collections.singleton(rs.getString("subcategory"))));
                product.setPrice(rs.getString("price"));
                product.setStock(rs.getString("stock"));
               // product.setStatus(rs.getString("prod_status"));

               // Clean the stock value and parse it to an integer
            String stockString = product.getStock();
            String numericPart = stockString.replaceAll("[^0-9]", ""); // Remove non-numeric characters

            if (!numericPart.isEmpty()) {
                int stock = Integer.parseInt(numericPart);

                if (stock == 0) {
                    notifyAdmin(product);
                }
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, "Error fetching products from database", ex);
        } finally {
            // Close ResultSet, PreparedStatement, and Database Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                DatabaseConnection.getConnection().close(); // Close connection
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, "Error closing resources", ex);
            }
        }
    }

    // Notification method to show dialog
    public void notifyAdmin(Product product) {
        System.out.println("Notifying admin about product: " + product.getName());
        productQueue.add(product);
        processNotification();

//        if (!notificationList.contains(product)) {
//            notificationList.add(product);
//            JLabel notificationLabel = new JLabel("Stock of " + product.getName() + " has reached 0!");
//            notificationsPanel.add(notificationLabel);
//            notificationsPanel.revalidate();
//            notificationsPanel.repaint();
//        }
    }

    private void processNotification() {
        if (notificationDialog == null || !notificationDialog.isShowing()) {
            if (!productQueue.isEmpty()) {
                Product product = productQueue.poll();

                notificationDialog = new JDialog(this, "Stock Notification", true);
                notificationDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                notificationDialog.setSize(300, 200);
                notificationDialog.setLayout(new BorderLayout());

                JLabel messageLabel = new JLabel("Stock of " + product.getName() + " has reached 0!");
                messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                notificationDialog.add(messageLabel, BorderLayout.CENTER);

                JButton updateButton = new JButton("Update Stock");
                updateButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String newStockString = JOptionPane.showInputDialog(notificationDialog, "Enter new stock for " + product.getName() + ":");
                        try {
                            int newStock = Integer.parseInt(newStockString);
                            if (newStock > 0) {
                                product.setStock(String.valueOf(newStock));
                                Product.update(product);
                                notificationDialog.dispose();
                                processNotification(); // Process the next product in the queue
                            } else {
                                JOptionPane.showMessageDialog(notificationDialog, "Invalid stock value. Please enter a positive integer.");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(notificationDialog, "Invalid input. Please enter a valid number.");
                        }
                    }
                });

                JPanel buttonPanel = new JPanel();
                buttonPanel.add(updateButton);
                notificationDialog.add(buttonPanel, BorderLayout.SOUTH);

                notificationDialog.setLocationRelativeTo(this);
                notificationDialog.setVisible(true);
            }
        }
    }
//      private void showNotificationPanel() {
//        notificationDialog = new JDialog();
//        notificationDialog.setTitle("Stock Notifications");
//        notificationDialog.setModal(true);
//        notificationDialog.setSize(400, 300);
//        notificationDialog.setLayout(new BorderLayout());
//
//        JPanel notificationsListPanel = new JPanel();
//        notificationsListPanel.setLayout(new BoxLayout(notificationsListPanel, BoxLayout.Y_AXIS));
//
//        for (Product product : notificationList) {
//            JPanel productPanel = new JPanel();
//            productPanel.setLayout(new BorderLayout());
//
//            JLabel messageLabel = new JLabel("Stock of " + product.getName() + " has reached 0!");
//            messageLabel.setHorizontalAlignment(SwingConstants.LEFT);
//            productPanel.add(messageLabel, BorderLayout.CENTER);
//
//            JButton updateButton = new JButton("Update Stock");
//            updateButton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    String newStockString = JOptionPane.showInputDialog(notificationDialog, "Enter new stock for " + product.getName() + ":");
//                    try {
//                        int newStock = Integer.parseInt(newStockString);
//                        if (newStock > 0) {
//                            product.setStock(String.valueOf(newStock));
//                            Product.update(product); // Assuming Product.update() updates the stock in the database
//                            notificationList.remove(product);
//                            notificationsPanel.remove(messageLabel);
//                            notificationsPanel.revalidate();
//                            notificationsPanel.repaint();
//                            if (notificationList.isEmpty()) {
//                                notificationDialog.dispose();
//                            } else {
//                                showNotificationPanel();
//                            }
//                        } else {
//                            JOptionPane.showMessageDialog(notificationDialog, "Invalid stock value. Please enter a positive integer.");
//                        }
//                    } catch (NumberFormatException ex) {
//                        JOptionPane.showMessageDialog(notificationDialog, "Invalid input. Please enter a valid number.");
//                    }
//                }
//            });
//
//            productPanel.add(updateButton, BorderLayout.EAST);
//            notificationsListPanel.add(productPanel);
//        }
//
//        JScrollPane scrollPane = new JScrollPane(notificationsListPanel);
//        notificationDialog.add(scrollPane, BorderLayout.CENTER);
//
//        JButton closeButton = new JButton("Close");
//        closeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                notificationDialog.dispose();
//            }
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(closeButton);
//        notificationDialog.add(buttonPanel, BorderLayout.SOUTH);
//
//        notificationDialog.setLocationRelativeTo(notificationsPanel);
//        notificationDialog.setVisible(true);
//    }
      
    public double getTotalIncome() {
        double totalIncome = 0.0;
        PreparedStatement st = null;
        ResultSet rs = null;

        // SQL query to sum up prices from the bill table
        String query = "SELECT SUM(payment) AS total_income FROM supermarket_login.bill";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);

            rs = st.executeQuery();

            if (rs.next()) {
                totalIncome = rs.getDouble("total_income");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any SQL exceptions as needed
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
        return totalIncome;
    }

    public int getTotalSoldNumber() {
        int total_sold_item = 0;
        PreparedStatement st = null;
        ResultSet rs = null;

        // SQL query to sum up prices from the bill table
        String query = "SELECT SUM(items) AS total_sold_item FROM supermarket_login.bill";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);

            rs = st.executeQuery();

            if (rs.next()) {
                total_sold_item = rs.getInt("total_sold_item");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any SQL exceptions as needed
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
        return total_sold_item;
    }

    private void setProductIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
        jButton_AddProduct.setIcon(resizedIcon);

    }
    
    private void setUpdateIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
        jButton_updateProduct.setIcon(resizedIcon);

    }
    
    private void setCategoryIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
       jButton_addCategory.setIcon(resizedIcon);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_AddProduct;
    private javax.swing.JButton jButton_addCategory;
    private javax.swing.JButton jButton_updateProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_soldItem;
    private javax.swing.JLabel jLabel_totalIncome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
