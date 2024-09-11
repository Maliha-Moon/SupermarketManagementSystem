/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class userVerification extends javax.swing.JFrame {

    /**
     * Creates new form userVerification
     */
    public userVerification() {
        initComponents();
    }

//    public void approveUser(String username) {
//        ArrayList<User> list = SignUp.getUserRecords(username);
//        DefaultTableModel table = (DefaultTableModel) jTable_user.getModel();
//        table.setRowCount(0);
//
//        Iterator<User> itr = list.iterator();
//        while (itr.hasNext()) {
//            User obj = itr.next();
//            if (obj.getUserName().equals(username)) {
//                table.addRow(new Object[]{obj.getId(), obj.getFullName(), obj.getUserName(), obj.getEmail()});
//            }
//
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_user = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 18, 59));
        jLabel1.setText("Verify User");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 250, 241)));

        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 18, 59)));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jTable_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 18, 59)));
        jTable_user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "E-mail", "Status"
            }
        ));
        jTable_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_user);

        jButton1.setBackground(new java.awt.Color(255, 18, 59));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Change Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        //approveUser("");
        ArrayList<User> list = SignUp.getUserRecords();
        DefaultTableModel table = (DefaultTableModel) jTable_user.getModel();
        table.setRowCount(0);

        Iterator<User> itr = list.iterator();
        while (itr.hasNext()) {
            User obj = itr.next();
            //if (obj.getUserName().equals(username)) {
            table.addRow(new Object[]{obj.getId(), obj.getFullName(), obj.getUserName(), obj.getEmail(), obj.getStatus()});
            //}

        }
    }//GEN-LAST:event_formComponentShown

    // Method to update the JTable with user records
    public void updateUserTable() {
        DefaultTableModel model = (DefaultTableModel) jTable_user.getModel();
        model.setRowCount(0); // Clear existing rows

        ArrayList<User> users = SignUp.getUserRecords(); // Fetch updated user records
        for (User user : users) {
            Object[] row = {user.getId(), user.getFullName(), user.getUserName(), user.getEmail(), user.getStatus()};
            model.addRow(row); // Add each user as a row in the table
        }
    }
    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        String userName = searchField.getText().trim(); // Get the entered username from the search field
        DefaultTableModel tableModel = (DefaultTableModel) jTable_user.getModel();
        tableModel.setRowCount(0); // Clear existing rows in the table

        // Fetch user records based on the entered username
        ArrayList<User> users = SignUp.getUserRecords();

        // Iterate through the retrieved users and add them to the table
        for (User user : users) {
            Object[] row = {user.getId(), user.getFullName(), user.getUserName(), user.getEmail(), user.getStatus()};
            tableModel.addRow(row); // Add each user as a row in the table
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void jTable_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_userMouseClicked
        // TODO add your handling code here:
        // Check if a row is selected
        int index = jTable_user.getSelectedRow();
        //if (index != -1) {
        // Get the TableModel and check the selected row index
        TableModel table = jTable_user.getModel();

//            // Get username and status from the selected row
//            Object userNameObj = table.getValueAt(index, 2); // Assuming username is in column index 2
//            Object statusObj = table.getValueAt(index, 4); // Assuming status is in column index 4
        String userName = table.getValueAt(index, 2).toString();
        String status = table.getValueAt(index, 4).toString();

        // Perform null checks and conversions
//        if (userNameObj != null && statusObj != null) {
//            String userName = userNameObj.toString();
//            String status = statusObj.toString();

            // Toggle status and confirmation dialog
            if (status.equals("true")) {
                status = "false";
            } else {
                status = "true";
                int confirm = JOptionPane.showConfirmDialog(null, "Do you want to change status of " + userName + "?", "Select", JOptionPane.YES_NO_OPTION);
                if (confirm == 0) {
                    
                    SignUp.changeStatus(userName, status);
                    setVisible(false);
                    new userVerification().setVisible(true);
                    
                    // Refresh the table after status change
//                    DefaultTableModel model = (DefaultTableModel) jTable_user.getModel();
//                    model.setRowCount(0); // Clear current rows
                    // Load or refresh table data
                    // loadUserTable(); // Example method to reload data
                }
            }
//        } else {
//            System.out.println("Username or status is null.");
//        }
//        } else {
//            System.out.println("No row selected.");
//        }


    }//GEN-LAST:event_jTable_userMouseClicked

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
            java.util.logging.Logger.getLogger(userVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userVerification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_user;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
