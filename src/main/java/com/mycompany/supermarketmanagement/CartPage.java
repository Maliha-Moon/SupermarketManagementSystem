/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CartPage extends JPanel {
    private List<ProductPanel> productPanels;

    public CartPage() {
        setLayout(new GridLayout(0, 1)); // Vertical layout for product panels
        productPanels = new ArrayList<>();
    }

//    public void addProduct(Product product, int quantity) {
//        ProductPanel productPanel = new ProductPanel(product, quantity);
//        productPanels.add(productPanel);
//        add(productPanel);
//        revalidate(); // Refresh layout
//        repaint(); // Repaint to show changes
//    }
}
