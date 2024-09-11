/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author DELL
 */
public class Cart extends javax.swing.JFrame {

    private static Cart instance;
    public DefaultTableModel tableModel;

    public Cart() {
        initComponents();
        tableModel = (DefaultTableModel) jTable_cart.getModel();
        setPriviousIcon("C:\\Users\\DELL\\Downloads\\previous.png", 50, 50);
       // Set renderer and editor for the delete button column (adjust column index as per your table)
        TableColumn column = jTable_cart.getColumnModel().getColumn(3); // Assuming delete button is in column index 4
        column.setCellRenderer(new ButtonRenderer());
        column.setCellEditor(new ButtonEditor(new JCheckBox(), jTable_cart));

    }
    // Singleton pattern 

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_cart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel_total = new javax.swing.JLabel();
        jLabel_grandTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_cart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 18, 59)));
        jTable_cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Price", "delete?"
            }
        ));
        jTable_cart.setGridColor(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(jTable_cart);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 18, 59));
        jLabel1.setText("      My Cart");

        jButton1.setBackground(new java.awt.Color(255, 18, 59));
        jButton1.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel_total.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel_total.setForeground(new java.awt.Color(255, 18, 59));
        jLabel_total.setText("Grand Total:");

        jLabel_grandTotal.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel_grandTotal.setForeground(new java.awt.Color(255, 18, 59));
        jLabel_grandTotal.setText("00.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_grandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrderPlacement order = new OrderPlacement();
        // Iterate through Cart tableModel and add each row to orderPlacementTableModel
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String productName = (String) tableModel.getValueAt(i, 0);
            int quantity = (int) tableModel.getValueAt(i, 1);
            double totalPrice = (double) tableModel.getValueAt(i, 2);
            order.addRowToTable(productName, quantity, totalPrice);
        }
        //  OrderPlacement order = new OrderPlacement();
        order.setVisible(true);
        order.pack();
        order.setLocationRelativeTo(null);
        //order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:

        HomePage home = new HomePage();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Close the current login form
        this.dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    public void addRowToTable( String productName, int quantity, double price) {
        // DefaultTableModel 
        tableModel.addRow(new Object[]{ productName, quantity, price});
        updateGrandTotal();
    }
    
     private void updateGrandTotal() {
        double grandTotal = calculateGrandTotal();
        //jLabel_grandTotal.setText(String.valueOf(grandTotal));
        String payTotal = String.valueOf(grandTotal);
        SwingUtilities.invokeLater(() -> jLabel_grandTotal.setText(payTotal));
        jLabel_grandTotal.revalidate();
        jLabel_grandTotal.repaint();

    }
    
    public double calculateGrandTotal() {
        double grandTotal = 0.0;
        int priceColumnIndex = 2;

        for (int i = 0; i < jTable_cart.getRowCount(); i++) {
            Object value = jTable_cart.getValueAt(i, priceColumnIndex);
            double price = Double.parseDouble(value.toString());

            grandTotal += price;
        }

//        double vat = grandTotal * 0.05;
//        grandTotal += vat;
//
//        double deliveryFee = 50.0;
//        grandTotal += deliveryFee;

        return grandTotal;
    }

    private void setPriviousIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
        jButton_back.setIcon(resizedIcon);

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_grandTotal;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_cart;
    // End of variables declaration//GEN-END:variables
}
