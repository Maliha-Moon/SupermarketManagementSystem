/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermarketmanagement;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
//import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
//import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class HomePage extends JFrame {

    private static HomePage instance;
    private final JPanel productPanel = new JPanel();
    //private AdminPanel adminPanel; // Declare adminPanel instance variable

    public HomePage() {
        initComponents();
        populateCategories();
        // Set the layout manager for productPanel
        newProductPanel.setLayout(new GridLayout(0, 2, 10, 10));
        // Display all products initially
        displayAllProducts();
        setSearchIcon("C:/Users/DELL/Pictures/search icon.png", 42, 42);
        //setCartIcon("C:\\Users\\DELL\\Pictures\\cart.jpg",42,42);
        // HomeButton
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        SubCategory = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        newProductPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 18, 59));

        HomeButton.setBackground(new java.awt.Color(4, 59, 92));
        HomeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(4, 59, 92));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Cetagories");

        category.setBackground(new java.awt.Color(4, 59, 92));
        category.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        category.setForeground(new java.awt.Color(255, 255, 255));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(4, 59, 92));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Sub-Cetagories");

        SubCategory.setBackground(new java.awt.Color(4, 59, 92));
        SubCategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SubCategory.setForeground(new java.awt.Color(255, 255, 255));
        SubCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubCategoryActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cooper Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 18, 59));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(4, 59, 92));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("My Cart");
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
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jButton5)
                    .addComponent(SubCategory, 0, 224, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 280, 470));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 18, 59)));

        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 18, 59)));

        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 18, 59));
        jLabel2.setText("HAPPY");

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 18, 59));
        jLabel3.setText("HARVEST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)))
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 150));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        newProductPanel.setBackground(new java.awt.Color(255, 250, 246));
        newProductPanel.setLayout(new java.awt.GridLayout(1, 0));
        jPanel5.add(newProductPanel);

        jScrollPane2.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 690, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Public method to provide access to the singleton instance
    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    private void updateHomePage() {
        ArrayList<Product> products = fetchProductsFromDatabase();

        // Clear existing components from newProductPanel
        newProductPanel.removeAll();

        // Set layout to GridLayout with 2 columns
        newProductPanel.setLayout(new GridLayout(0, 2, 10, 10));

        // Add products to newProductPanel
        for (Product product : products) {
            JPanel productDisplayPanel = createProductDisplay(product);
            newProductPanel.add(productDisplayPanel);
        }

        // Update UI
        newProductPanel.revalidate();
        newProductPanel.repaint();
    }

    // Fetch categories from database
    private void populateCategories() {
        ArrayList<Category> categories = Category.getAllCategory(); //Fetches all categories from the database.
        DefaultComboBoxModel<String> categoryModel = new DefaultComboBoxModel<>(); //Creates a new combo box model to hold category names.
        for (Category cat : categories) {
            categoryModel.addElement(cat.getName()); //Adds each category name to the combo box model.
        }
        category.setModel(categoryModel);

        // Populate subcategories for the initially selected category
        if (category.getItemCount() > 0) {
            populateSubcategories(category.getItemAt(0));
        }
    }

    private void addMainCategoryComboBoxListener() {
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCategory = (String) category.getSelectedItem();
                populateSubcategories(selectedCategory);
            }
        });
    }


    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
        String selectedCategory = (String) category.getSelectedItem();
        if (selectedCategory != null) {
            populateSubcategories(selectedCategory);
        }
    }//GEN-LAST:event_categoryActionPerformed

    private void SubCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubCategoryActionPerformed
        // TODO add your handling code here:
        String selectedSubcategory = (String) SubCategory.getSelectedItem();
        if (selectedSubcategory != null) {
            displayProductsBySubCategory(selectedSubcategory);
        }
    }//GEN-LAST:event_SubCategoryActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        displayAllProducts();
    }//GEN-LAST:event_HomeButtonActionPerformed


    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        // TODO add your handling code here:
//        String searchText = searchField.getText().trim();
//        searchProducts(searchText);

        String searchProduct = searchField.getText().trim();
        // Clear the product panel
        newProductPanel.removeAll();
        // Fetch product from the database based on the product name
        ArrayList<Product> products = Product.getProductByName(searchProduct);
        // Display product in the product panel
        if (products.isEmpty()) {
            JLabel searchResult = new JLabel("Your search " + searchProduct + " did not match any product!");
            newProductPanel.add(searchResult);
        } else {
            displayProducts(products);
        }

        // Refresh the product panel
        newProductPanel.revalidate();
        newProductPanel.repaint();

    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Dispose the current frame (AdminPanel)
        this.dispose();

        // Redirect to the login screen
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Cart login = new Cart();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //populates the subcategoryComboBox with subcategories based on the selected categoryName.
    private void populateSubcategories(String categoryName) {

        ArrayList<String> subcategories = Product.getSubCategoriesByCategory(categoryName); // Fetch subcategories from database
        DefaultComboBoxModel<String> subcategoryModel = new DefaultComboBoxModel<>(subcategories.toArray(new String[0]));
        SubCategory.setModel(subcategoryModel);

        // Display products for the initially selected subcategory
        if (SubCategory.getItemCount() > 0) {
            displayProductsBySubCategory((String) SubCategory.getSelectedItem());
        }
    }

    private void displayAllProducts() {
        ArrayList<Product> products = fetchProductsFromDatabase();
        displayProducts(products);
    }

    private ArrayList<Product> fetchProductsFromDatabase() {

        PreparedStatement st;
        ResultSet rs;

        ArrayList<Product> products = new ArrayList<>();
        String query = "SELECT * FROM supermarket_login.product";

        try {
            st = DatabaseConnection.getConnection().prepareStatement(query);
            rs = st.executeQuery();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setSubCategory(new ArrayList<>(Collections.singleton(rs.getString("subcategory"))));
                product.setPrice(rs.getString("price"));
                product.setStock(rs.getString("stock"));
                // product.setStatus(rs.getString("prod_status"));
                product.setImagePath(rs.getString("image_path"));

                String subcategoryString = rs.getString("subcategory");
                ArrayList<String> subcategories = new ArrayList<>();
                if (subcategoryString != null && !subcategoryString.isEmpty()) {
                    String[] subcategoryArray = subcategoryString.split(",");
                    for (String subcategory : subcategoryArray) {
                        subcategories.add(subcategory.trim());
                    }
                }
                product.setSubCategory(subcategories);

                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    // Displays products in the productPanel
    private void displayProducts(ArrayList<Product> products) {
        // Clear the product panel
        newProductPanel.removeAll();

        // Set layout manager
        newProductPanel.setLayout(new GridLayout(0, 2, 10, 10));

        // Display products in the product panel
        for (Product product : products) {
            JPanel productItemPanel = createProductDisplay(product); // Directly use the createProductDisplay method
            productItemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add a border to each product item panel
            newProductPanel.add(productItemPanel);
        }

        // Refresh the product panel
        newProductPanel.revalidate();
        newProductPanel.repaint();
    }

    private JPanel createProductDisplay(Product product) {
        JPanel productItemPanel = new JPanel();
        productItemPanel.setLayout(new BoxLayout(productItemPanel, BoxLayout.Y_AXIS));
        productItemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        productItemPanel.setBackground(Color.WHITE); // Set background color to white
        Dimension size = new Dimension(450, 600);
        productItemPanel.setPreferredSize(size); // Set the preferred size
        productItemPanel.setMinimumSize(size); // Set the minimum size
        productItemPanel.setMaximumSize(size); // Set the maximum size

        // JLabel for the product image
        JLabel imageLabel = new JLabel();
        String imagePath = product.getImagePath();
        if (imagePath != null && !imagePath.isEmpty()) {
            File file = new File(imagePath);
            if (file.exists() && file.isFile()) {
                try {
                    BufferedImage image = ImageIO.read(file);
                    if (image != null) {
                        int width = 180;
                        int height = 80;
                        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                        ImageIcon icon = new ImageIcon(scaledImage);
                        imageLabel.setIcon(icon);
                    } else {
                        imageLabel.setToolTipText("Unable to read image");
                    }
                } catch (IOException e) {
                    imageLabel.setToolTipText("Error reading image");
                    e.printStackTrace();
                }
            } else {
                imageLabel.setToolTipText("Image not available");
            }
        } else {
            imageLabel.setToolTipText("Image not available");
        }
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setPreferredSize(new Dimension(80, 80));
        productItemPanel.add(imageLabel);

        // JLabel for the product name
        JLabel nameLabel = new JLabel(product.getName());
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setPreferredSize(new Dimension(150, 20));
        nameLabel.setFont(new Font("Cooper Black", Font.PLAIN, 11));
        productItemPanel.add(nameLabel);

        // JLabel for the product price
        String priceString = product.getPrice();
        String priceNumeric = priceString.replaceAll("[^0-9]", "");
        JLabel priceLabel = new JLabel(priceNumeric);
        priceLabel.setHorizontalAlignment(JLabel.CENTER);
        priceLabel.setPreferredSize(new Dimension(120, 20));
        // priceLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\taka.png"));
        priceLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set the font and size
        priceLabel.setForeground(new Color(255, 18, 59));
        productItemPanel.add(priceLabel);

        // Load and resize the icon
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\DELL\\Downloads\\taka.png");
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the icon on the right side of the label
        priceLabel.setIcon(resizedIcon);
        priceLabel.setHorizontalTextPosition(JLabel.RIGHT);
        priceLabel.setIconTextGap(3);

//        String priceText = priceString.replaceAll("[0-9]", "").trim();
//        JLabel priceTextLabel = new JLabel(priceText);
//        priceTextLabel.setHorizontalAlignment(JLabel.CENTER);
//        priceTextLabel.setPreferredSize(new Dimension(120, 20));
//        priceTextLabel.setFont(new Font("Arial", Font.PLAIN, 10));
//        productItemPanel.add(priceTextLabel);
        // JPanel for quantity label and combo box
        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new BoxLayout(quantityPanel, BoxLayout.Y_AXIS));
        quantityPanel.setBackground(Color.WHITE);

//        JLabel quantityLabel = new JLabel("Quantity:");
//        quantityLabel.setPreferredSize(new Dimension(120, 20));
//        quantityLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center alignment
//        quantityPanel.add(quantityLabel);
        String stockString = product.getStock();

// Extract numeric part from stockString
        String numericPart = stockString.replaceAll("[^0-9]", "");

// Convert numeric part to integer
        int stockValue = 0; // Default value in case extraction fails or no valid number found
        try {
            stockValue = Integer.parseInt(numericPart);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Handle exception appropriately
        }

        // Populate JComboBox with integers from 1 to stockValue
        JComboBox<Integer> quantityComboBox = new JComboBox<>();
        for (int i = 1; i <= stockValue; i++) {
            quantityComboBox.addItem(i);
        }
        quantityComboBox.setPreferredSize(new Dimension(60, 20)); // Adjusted size for JComboBox
        quantityComboBox.setMaximumSize(new Dimension(60, 20)); // Ensure maximum size
        quantityComboBox.setAlignmentX(Component.CENTER_ALIGNMENT); // Center alignment
        quantityPanel.add(quantityComboBox);

        productItemPanel.add(quantityPanel);

        // JLabel for current status
        JLabel stockLabel;
        if (quantityComboBox.getSelectedItem() == null) {
            stockLabel = new JLabel("Out Of Stock");
        } else {
            stockLabel = new JLabel("Available");
        }

        stockLabel.setHorizontalAlignment(JLabel.CENTER);
        stockLabel.setPreferredSize(new Dimension(120, 20));
        productItemPanel.add(stockLabel);

        // JButton for buying the product
        JButton buyButton = new JButton("Buy");
        buyButton.setPreferredSize(new Dimension(80, 30));
        buyButton.setMaximumSize(new Dimension(80, 30)); // Ensure maximum size
        buyButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center alignment
        buyButton.setBackground(new Color(255, 18, 59));
        buyButton.setForeground(Color.WHITE);

        productItemPanel.add(buyButton);

        if (quantityComboBox.getSelectedItem() == null) {
            buyButton.setEnabled(false);
        }

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantityToBuy = (int) quantityComboBox.getSelectedItem();

                // Get the instance of OrderPlacement
                OrderPlacement order = OrderPlacement.getInstance();

                // Add product to order placement frame table
                order.addRowToTable(product.getName(), quantityToBuy, Double.parseDouble(priceNumeric) * quantityToBuy);
                // Show the order placement frame
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        order.setVisible(true);
                        order.pack();
                        order.setLocationRelativeTo(null);
                    }
                });

            }
        });

        //productItemPanel.add(buyButton);
// JButton for adding to cart with an icon
        JButton addToCartButton = new JButton("Add to cart");
        addToCartButton.setPreferredSize(new Dimension(50, 30));
        addToCartButton.setMaximumSize(new Dimension(100, 30)); // Ensure maximum size
        addToCartButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Center alignment
        addToCartButton.setBackground(new Color(255, 18, 59));
        addToCartButton.setForeground(Color.WHITE);

        // Add buttonBox to productItemPanel
        productItemPanel.add(addToCartButton);

        if (quantityComboBox.getSelectedItem() == null) {
            addToCartButton.setEnabled(false);
        }

        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantityToBuy = (int) quantityComboBox.getSelectedItem();
                //Cart cart = new Cart();
                Cart cart = Cart.getInstance();
                // Add product to order placement frame table
                cart.addRowToTable( product.getName(), quantityToBuy, Double.parseDouble(priceNumeric) * quantityToBuy);
                //show the cart frame
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        cart.setVisible(true);
                        cart.pack();
                        cart.setLocationRelativeTo(null);
                    }
                });
            }
        });

        // Set preferred size for the entire panel
        productItemPanel.setPreferredSize(new Dimension(220, 220)); // Adjust size as needed

        return productItemPanel;
    }

    // Displays products fetched by subcategory in the productPanel
    private void displayProductsBySubCategory(String subcategory) {
        // Clear the product panel
        newProductPanel.removeAll();

        // Fetch products from the database based on the selected subcategory
        ArrayList<Product> products = Product.getProductsBySubcategory((String) category.getSelectedItem(), subcategory);

        // Display products in the product panel
        displayProducts(products);
    }

// Adds a product to the display
    public void addProductToDisplay(Product product) {
        // Check if the product matches the currently selected category and subcategory
        String selectedCategory = (String) category.getSelectedItem();
        String selectedSubcategory = (String) SubCategory.getSelectedItem();
        if (selectedCategory.equals(product.getCategory()) && product.getSubCategory().contains(selectedSubcategory)) {
            // Create the product display panel
            JPanel productItemPanel = createProductDisplay(product);
            productItemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add a border to each product item panel
            newProductPanel.add(productItemPanel);

            newProductPanel.revalidate();
            newProductPanel.repaint();
        }
    }

    public void removeProductFromDisplay(String productId) {
        Component[] components = newProductPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                JPanel panel = (JPanel) component;
                for (Component subComponent : panel.getComponents()) {
                    if (subComponent instanceof JLabel) {
                        JLabel label = (JLabel) subComponent;
                        if (label.getText().contains("Product ID: " + productId)) {
                            newProductPanel.remove(panel);
                            break;
                        }
                    }
                }
            }
        }
        newProductPanel.revalidate();
        newProductPanel.repaint();
    }

    private void setSearchIcon(String iconPath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(iconPath);

        // Resize the icon
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Set the resized icon on the button
        jButton_search.setIcon(resizedIcon);

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });

//        AdminPanel adminPanel = new AdminPanel();
//        SwingUtilities.invokeLater(() -> new HomePage(adminPanel).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JComboBox<String> SubCategory;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_search;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel newProductPanel;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
