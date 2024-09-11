/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {

    // Method to resize and set the image on jLabel_image
    private void setImage(String imagePath, int width, int height) {
        // Load the image
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Resize the image
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(resizedImage);

        // Set the resized image as the icon of jLabel_image
        jLabel_image.setIcon(imageIcon);
    }

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        logInButton.setEnabled(false);
        setImage("C:\\Users\\DELL\\Downloads\\moon website (1)(1)(1).png", 435, 560);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        JlabelRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_image = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(0, 153, 153), new java.awt.Color(255, 153, 153)));

        jLabel_close.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_close.setText("  X");
        jLabel_close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_minimize.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_minimize.setText("  -");
        jLabel_minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 18, 59));
        jLabel3.setText("Welcome back to ");

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 18, 59));
        jLabel6.setText("username");

        jTextField_username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_username.setText("username");
        jTextField_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_usernameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 18, 59));
        jLabel7.setText("password");

        jPasswordField_password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField_password.setText("password");
        jPasswordField_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jPasswordField_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusLost(evt);
            }
        });
        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });
        jPasswordField_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_passwordKeyTyped(evt);
            }
        });

        JlabelRegister.setBackground(new java.awt.Color(241, 231, 254));
        JlabelRegister.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        JlabelRegister.setForeground(new java.awt.Color(0, 89, 110));
        JlabelRegister.setText("Sign up");
        JlabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlabelRegisterMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 18, 59));
        jLabel1.setText("            Don't have an account?");

        logInButton.setBackground(new java.awt.Color(4, 59, 92));
        logInButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logInButton.setForeground(new java.awt.Color(255, 255, 255));
        logInButton.setText("Login");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 18, 59));

        jLabel4.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please sign in to enjoy ");

        jLabel5.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("a fruitful shopping experience!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel8.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 18, 59));
        jLabel8.setText("HAPPY");

        jLabel9.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 18, 59));
        jLabel9.setText("HARVEST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPasswordField_password)
                                    .addComponent(jTextField_username)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(JlabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(logInButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_minimize))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelRegister))
                .addGap(70, 70, 70))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#006666"));
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.decode("#006666"));
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#FF6666"));
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.decode("#FF6666"));
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void JlabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelRegisterMouseClicked
        // TODO add your handling code here:
        SignUp sign = new SignUp();
        sign.setVisible(true);
        sign.pack();
        sign.setLocationRelativeTo(null);
        sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_JlabelRegisterMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#006666"));
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.decode("#006666"));
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.decode("#FF6666"));
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.decode("#FF6666"));
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        // TODO add your handling code here:
        // clear the textfield on focus if the text is "username" 
        if (jTextField_username.getText().trim().toLowerCase().equals("username")) {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.decode("#2F4F4F"));
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        // TODO add your handling code here:
        if (jTextField_username.getText().trim().equals("")
                || jTextField_username.getText().trim().toLowerCase().equals("username")) {
            jTextField_username.setText("username");
            jTextField_username.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordField_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jPasswordField_password.getPassword());
        if (pass.trim().toLowerCase().equals("password")) {
            jPasswordField_password.setText("");  // user input
            jPasswordField_password.setForeground(Color.decode("#2F4F4F"));
        }

    }//GEN-LAST:event_jPasswordField_passwordFocusGained

    private void jPasswordField_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusLost
        // TODO add your handling code here:
        String pass1 = String.valueOf(jPasswordField_password.getPassword());
        if (pass1.trim().equals("")
                || pass1.trim().toLowerCase().equals("password")) {
            jPasswordField_password.setText("password");
            jPasswordField_password.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_jPasswordField_passwordFocusLost

    public void validateField() {
        final String username = jTextField_username.getText().trim();
        final String password = String.valueOf(jPasswordField_password.getPassword()).trim();

        if (!username.isEmpty() && !password.isEmpty() && !username.equals("username") && !password.equals("password")) {
            logInButton.setEnabled(true);
        } else {
            logInButton.setEnabled(false);
        }
    }


    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs;

        String username = jTextField_username.getText();
        String Password = String.valueOf(jPasswordField_password.getPassword());

        String query = "SELECT * FROM supermarket_login.sign_up_info WHERE username = ? AND password = ?";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);

            st.setString(1, username);
            st.setString(2, Password);
            rs = st.executeQuery();

            if (!username.isEmpty() && !Password.isEmpty()) {
                if (rs.next()) {   //moves the pointer of the current (ResultSet) object to the next row,
                    
                    // Login successful, navigate to OrderPlacement page
//                OrderPlacement order = new OrderPlacement();
//                order.setVisible(true);
//                order.pack();
//                order.setLocationRelativeTo(null);
//                order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Login successful, store the username and email in TrackUser
            TrackUser.setLoggedInCustomerName(username);
            //TrackUser.setLoggedInCustomerEmail(rs.getString("email"));
            
                    HomePage home = new HomePage();
                    home.setVisible(true);
                    home.pack();
                    home.setLocationRelativeTo(null);
                    home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    // Close the current login form
                    this.dispose();
                } else {
                    // Invalid username or password, show error message
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Username or password is empty, show error message
                JOptionPane.showMessageDialog(null, "Please enter both username and password", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_logInButtonActionPerformed

    private void jTextField_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_usernameKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jTextField_usernameKeyTyped

    private void jPasswordField_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passwordKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jPasswordField_passwordKeyTyped

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JButton logInButton;
    // End of variables declaration//GEN-END:variables
}
