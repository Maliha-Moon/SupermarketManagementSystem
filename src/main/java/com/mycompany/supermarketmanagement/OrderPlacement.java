/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Image;
//import java.awt.event.ComponentAdapter;
//import java.awt.event.ComponentEvent;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class OrderPlacement extends javax.swing.JFrame {

    private static OrderPlacement instance;
    public int billId = 1;
    public int itemOrder = 0;
    // public int orderDeliveryFee = 50;
    public int orderDiscount = 0;
    public int orderVat = 5;
    //public double totalPayment = 0.00;
    public String totalPayment;
    public String phoneNumberPattern = "^(?:\\+?88)?01[3-9]\\d{8}$";

    public OrderPlacement() {
        initComponents();

        jButton_generateBill.setEnabled(false);
        setPriviousIcon("C:\\Users\\DELL\\Downloads\\previous.png", 50, 50);

    }

    public static OrderPlacement getInstance() {
        if (instance == null) {
            instance = new OrderPlacement();
        }
        return instance;
    }

    public void addRowToTable(String productName, int quantity, double totalPrice) {
        DefaultTableModel tableModel = (DefaultTableModel) orderPlacementTableModel.getModel();
        tableModel.addRow(new Object[]{productName, quantity, totalPrice});
        updateItemsAndGrandTotal();
    }

    public void validateField() {
//        String name = jTextField_name.getText();
//        String email = jTextField_email.getText();
        String phoneNum = jTextField_phoneNum.getText();
        String city = jTextField_city.getText();
        String address = jTextField_address.getText();
        totalPayment = jLabel_grandTotal.getText(); //string
        double grandTotal = 0.0;
        grandTotal = Double.parseDouble(totalPayment);
        String payMethod = ((String) jComboBox_paymentMethod.getSelectedItem()).trim();

        if (phoneNum.matches(phoneNumberPattern) && phoneNum.length() == 14 && !city.isEmpty() && !address.isEmpty() && grandTotal > 0.0 && !payMethod.isEmpty()) {
            jButton_generateBill.setEnabled(true);
        } else {
            jButton_generateBill.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_phoneNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_city = new javax.swing.JTextField();
        jButton_generateBill = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        itemsLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_grandTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderPlacementTableModel = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jComboBox_paymentMethod = new javax.swing.JComboBox<>();
        jButton_back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 18, 59));
        jLabel2.setText("Phone Number");

        jTextField_phoneNum.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 18, 59)));
        jTextField_phoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_phoneNumKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 18, 59));
        jLabel3.setText("City");

        jTextField_address.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 18, 59)));
        jTextField_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_addressKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 18, 59));
        jLabel6.setText("Address");

        jTextField_city.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 18, 59)));
        jTextField_city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_cityKeyTyped(evt);
            }
        });

        jButton_generateBill.setBackground(new java.awt.Color(4, 59, 92));
        jButton_generateBill.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_generateBill.setForeground(new java.awt.Color(255, 255, 255));
        jButton_generateBill.setText("Generate bills ");
        jButton_generateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateBillActionPerformed(evt);
            }
        });

        jButton_clear.setBackground(new java.awt.Color(153, 0, 0));
        jButton_clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton_clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 18, 59), new java.awt.Color(255, 18, 59), new java.awt.Color(4, 59, 92), new java.awt.Color(4, 59, 92)));

        jLabel9.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 18, 59));
        jLabel9.setText("Item:");

        itemsLabel.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        itemsLabel.setForeground(new java.awt.Color(255, 18, 59));
        itemsLabel.setText("0");

        jLabel11.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 18, 59));
        jLabel11.setText("Delivery Fee");

        jLabel12.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 18, 59));
        jLabel12.setText("50.00");

        jLabel13.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 18, 59));
        jLabel13.setText("Discount");

        jLabel14.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 18, 59));
        jLabel14.setText("0%");

        jLabel15.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 18, 59));
        jLabel15.setText("Vat");

        jLabel16.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 18, 59));
        jLabel16.setText("5%");

        jLabel7.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 18, 59));
        jLabel7.setText("Grand Total:");

        jLabel_grandTotal.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel_grandTotal.setForeground(new java.awt.Color(255, 18, 59));
        jLabel_grandTotal.setText("000.00");

        orderPlacementTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ));
        orderPlacementTableModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderPlacementTableModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderPlacementTableModel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(itemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jLabel22.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 18, 59));
        jLabel22.setText("Payment Method");

        jComboBox_paymentMethod.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 18, 59)));
        jComboBox_paymentMethod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox_paymentMethodKeyTyped(evt);
            }
        });

        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 18, 59));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log out");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                            .addComponent(jTextField_city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22))
                                    .addComponent(jComboBox_paymentMethod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jButton_generateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_paymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_generateBill, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_back, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Method to update items count and grand total
    private void updateItemsAndGrandTotal() {
        // Code to update items count and grand total as previously discussed
        // For example:
        int itemCount = orderPlacementTableModel.getRowCount();
        //itemsLabel.setText(String.valueOf(itemCount));
        String item = String.valueOf(itemCount);
        SwingUtilities.invokeLater(() -> itemsLabel.setText(item)); //handling component update
        itemsLabel.revalidate();
        itemsLabel.repaint();

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

        for (int i = 0; i < orderPlacementTableModel.getRowCount(); i++) {
            Object value = orderPlacementTableModel.getValueAt(i, priceColumnIndex);
            double price = Double.parseDouble(value.toString());

            grandTotal += price;
        }

        double vat = grandTotal * 0.05;
        grandTotal += vat;

        double deliveryFee = 50.0;
        grandTotal += deliveryFee;

        return grandTotal;
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        // Add predefined payment methods to the JComboBox
        String[] paymentMethods = {"Credit Card", "Debit Card", "Cash on delivery", "Online Payment"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(paymentMethods);
        jComboBox_paymentMethod.setModel(model);
        jComboBox_paymentMethod.setSelectedIndex(0);

        // Add a table model listener to the table model
        orderPlacementTableModel.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                updateItemsAndGrandTotal();
            }
        });
    }//GEN-LAST:event_formComponentShown

    private void jComboBox_paymentMethodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_paymentMethodKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jComboBox_paymentMethodKeyTyped

    private void orderPlacementTableModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPlacementTableModelMouseClicked
        // TODO add your handling code here:
        int index = orderPlacementTableModel.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to remove?", "Select", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            TableModel model = orderPlacementTableModel.getModel();

            ((DefaultTableModel) orderPlacementTableModel.getModel()).removeRow(index);

            // Update the items and grand total after removing the row
            updateItemsAndGrandTotal();
        }
    }//GEN-LAST:event_orderPlacementTableModelMouseClicked

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
        //jTextField_name.setText("");
        //jTextField_email.setText("");
        jTextField_phoneNum.setText("");
        jTextField_city.setText("");
        jTextField_address.setText("");
        jButton_generateBill.setEnabled(false);
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_generateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generateBillActionPerformed
        // TODO add your handling code here:

        // Fetch logged-in user information from TrackUser
        String username = TrackUser.getLoggedInCustomerName();
        //String email = TrackUser.getLoggedInCustomerEmail();

        // Fetch user input from UI components
        String phone = jTextField_phoneNum.getText().trim();
        String city = jTextField_city.getText().trim();
        String address = jTextField_address.getText().trim();
        String payMethod = (String) jComboBox_paymentMethod.getSelectedItem();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String todayDate = dateFormat.format(date);

        String totalItem = itemsLabel.getText();
        int item = Integer.parseInt(totalItem);
        String totalText = jLabel_grandTotal.getText().trim();
        double total = Double.parseDouble(totalText);

        // Create the order object
        order orderObj = new order();
        orderObj.setUsername(username);
        //orderObj.setEmail(email);
        orderObj.setTotalItems(item);
        orderObj.setPayment(total);
        try {
            orderObj.setOrderDate(new SimpleDateFormat("yyyy-MM-dd").parse(todayDate));
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle the parse exception as needed
        }
        orderObj.setPayMethod(payMethod);

        // Insert order details into the database and get the generated order ID
        int orderId = orderDAO.placeOrder(orderObj);
        if (orderId == -1) {
            JOptionPane.showMessageDialog(null, "Failed to save order details. Please try again.");
            return;
        }

        // Create and save the bill object
        Bill bill = new Bill();
        bill.setOrderId(orderId);
        bill.setPhoneNumber(phone);
        bill.setCity(city);
        bill.setAddress(address);
        bill.setOrderDate(date);
        bill.setTotalItems(item);
        bill.setPayment(total);
        bill.setPayMethod(payMethod);

        boolean savedSuccessfully = BillDAO.save(bill);

        if (savedSuccessfully) {
            JOptionPane.showMessageDialog(null, "Bill generated successfully!");

            // Update stock for purchased items
            // Iterate through each row in the table model
            for (int i = 0; i < orderPlacementTableModel.getRowCount(); i++) {
                String productName = orderPlacementTableModel.getValueAt(i, 0).toString();
                int quantityToBuy = Integer.parseInt(orderPlacementTableModel.getValueAt(i, 1).toString());

                // Retrieve products from database based on productName
                ArrayList<Product> products = Product.getProductByName(productName);

                if (products.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Product not found: " + productName);
                    continue; // Skip if product not found
                }

                // Assuming you want the first product from the list
                Product product = products.get(0);

                // Now you can use 'product' as needed
                int currentStock = Integer.parseInt(product.getStock());
                int updatedStock = currentStock - quantityToBuy;

                if (updatedStock >= 0) {
                    // Update stock in product object
                    product.setStock(String.valueOf(updatedStock));

                    // Update database
                    Product.update(product);

                }
                //else {
//                    JOptionPane.showMessageDialog(null, "Insufficient stock available for: " + productName);
//                    // Handle insufficient stock scenario
//                    // You might want to consider rolling back the order or other actions here
//                }
            }

            // Generate PDF document
            String path = "E:\\";
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path + orderId + ".pdf"));
                doc.open();

                // Add content to PDF
                Paragraph supermarket = new Paragraph("                                                      HAPPY HARVEST\n");
                doc.add(supermarket);
                Paragraph startLine = new Paragraph("*****************************************************************************************************************************\n");
                doc.add(startLine);
                Paragraph paragraph3 = new Paragraph("\tBill ID: " + orderId + "\nTotal Paid: " + total);
                doc.add(paragraph3);
                doc.add(startLine);

                // Create table for items
                PdfPTable table = new PdfPTable(4);
                table.addCell("Name");
                table.addCell("Quantity");
                table.addCell("Price");
                table.addCell("Total");

                // Assuming orderPlacementTableModel is accessible and correctly initialized
                for (int i = 0; i < orderPlacementTableModel.getRowCount(); i++) {
                    String name = orderPlacementTableModel.getValueAt(i, 0).toString();
                    String quantity = orderPlacementTableModel.getValueAt(i, 1).toString();
                    String price = orderPlacementTableModel.getValueAt(i, 2).toString();

                    double totalForItem = (Double.parseDouble(quantity) * Double.parseDouble(price) * .05) + 50.0;
                    table.addCell(name);
                    table.addCell(quantity);
                    table.addCell(price);
                    table.addCell(String.valueOf(totalForItem));
                }

                doc.add(table);
                doc.add(startLine);
                Paragraph thankYou = new Paragraph("Thanks for buying.");
                doc.add(thankYou);

                // Close document
                doc.close();

                // Open PDF using OpenPdf class (assuming it works correctly)
                OpenPdf open = new OpenPdf();
                open.openById(String.valueOf(orderId)); // Convert orderId to String

            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
            }

            // Close current window and show OrderPlacement frame
            setVisible(false);
            new OrderPlacement().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to save bill. Please try again.");
        }
    }//GEN-LAST:event_jButton_generateBillActionPerformed

// Method to get current date in yyyy-MM-dd format
    private String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void jTextField_cityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cityKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jTextField_cityKeyTyped

    private void jTextField_addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_addressKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jTextField_addressKeyTyped

    private void jTextField_phoneNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_phoneNumKeyTyped
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_jTextField_phoneNumKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Dispose the current frame (AdminPanel)
        this.dispose();

        // Redirect to the login screen
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    private void setPriviousIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
        jButton_back.setIcon(resizedIcon);

    }

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
            java.util.logging.Logger.getLogger(OrderPlacement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderPlacement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderPlacement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderPlacement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPlacement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_generateBill;
    private javax.swing.JComboBox<String> jComboBox_paymentMethod;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_grandTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_phoneNum;
    private javax.swing.JTable orderPlacementTableModel;
    // End of variables declaration//GEN-END:variables
}
