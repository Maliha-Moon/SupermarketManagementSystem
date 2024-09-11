/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarketmanagement;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class OpenPdf {

    public static void openById(String id) {
        try {
            String filePath = "C:\\Users\\DELL\\Desktop\\Happy Harvest\\" + id + ".pdf";
            
            // Print file path for debugging
            System.out.println("Checking file path: " + filePath);
            // Attempt to create the PDF
    

            File file = new File(filePath);
            

            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                //JOptionPane.showMessageDialog(null, "File does not exist: " + filePath);
            }
        } catch (IOException e) {
            //JOptionPane.showMessageDialog(null, "Error opening file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Test with a known ID
        openById("test");  // Replace "test" with an actual ID you know exists
    }
}


