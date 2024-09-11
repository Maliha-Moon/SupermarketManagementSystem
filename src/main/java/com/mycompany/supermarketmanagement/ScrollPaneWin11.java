/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;

public class ScrollPaneWin11 extends JScrollPane{
    
     public ScrollPaneWin11() {
        // Call to the superclass constructor
        super();

        // Set custom UI properties for Windows 11 look and feel
        setBorder(new javax.swing.border.LineBorder(new Color(200, 200, 200), 1, true));
        setBackground(new Color(245, 245, 245));
        
        // Customize the scroll bars
        getVerticalScrollBar().setUI(new Win11ScrollBarUI());
        getHorizontalScrollBar().setUI(new Win11ScrollBarUI());
        
        // Additional customization
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
     
     // Inner class to customize the scroll bar UI
    private static class Win11ScrollBarUI extends javax.swing.plaf.basic.BasicScrollBarUI {

        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(180, 180, 180);
            this.trackColor = new Color(230, 230, 230);
        }

        @Override
        protected void installComponents() {
            super.installComponents();
            // Additional customizations if needed
        }

        @Override
        protected void installDefaults() {
            super.installDefaults();
            scrollbar.setUnitIncrement(16);
        }

        @Override
        protected javax.swing.JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected javax.swing.JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private javax.swing.JButton createZeroButton() {
            javax.swing.JButton button = new javax.swing.JButton();
            button.setPreferredSize(new java.awt.Dimension(0, 0));
            button.setMinimumSize(new java.awt.Dimension(0, 0));
            button.setMaximumSize(new java.awt.Dimension(0, 0));
            return button;
        }
    }
}
