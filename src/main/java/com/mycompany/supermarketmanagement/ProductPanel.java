/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductPanel extends JPanel {

    private Product product;

    public ProductPanel(Product product) {
        this.product = product;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Dimension size = new Dimension(450, 600);
        setPreferredSize(size); // Set the preferred size
        setMinimumSize(size); // Set the minimum size
        setMaximumSize(size);
        // Image
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        if (product.getImagePath() != null && !product.getImagePath().isEmpty()) {
            ImageIcon icon = new ImageIcon(product.getImagePath());
            imageLabel.setIcon(icon);
        } else {
            imageLabel.setText("No Image Available");
        }
        add(imageLabel, BorderLayout.NORTH);

        // Product Details
        JPanel detailsPanel = new JPanel(new GridLayout(3, 1));
        detailsPanel.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel(product.getName());
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        detailsPanel.add(nameLabel);

        JLabel priceLabel = new JLabel(product.getPrice());
        priceLabel.setHorizontalAlignment(JLabel.CENTER);
        detailsPanel.add(priceLabel);

        JComboBox<Integer> quantityComboBox = new JComboBox<>();
        for (int i = 1; i <= 10; i++) {
            quantityComboBox.addItem(i);
        }
        detailsPanel.add(quantityComboBox);

        add(detailsPanel, BorderLayout.CENTER);

        // Buy Button
        JButton buyButton = new JButton("Buy");
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantity = (int) quantityComboBox.getSelectedItem();
                System.out.println("Bought " + quantity + " of " + product.getName());
                // Add further logic for buying product
            }
        });
        add(buyButton, BorderLayout.SOUTH);
    }

    public Product getProduct() {

        return product;
    }
}
