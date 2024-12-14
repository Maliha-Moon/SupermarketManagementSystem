# Supermarket Management System
This is a Java-based supermarket management system using Java Swing. It helps manage product inventory, track customer orders, generate bills, and handle various aspects of a supermarket's operations.
## Features
- **Product Management**: Add, update, and delete product details.
- **Category & Sub-Category Management**: Organize products into categories and sub-categories for easier browsing.
- **Cart Functionality**: Customers can add items to the cart, adjust quantities, and remove items.
- **Search for Products**: Quickly find products using a search bar.
- **Filter Products**: Filter products based on category.
- **Order Processing with Bill Generation**: Easily process orders and generate detailed bills.
- **User Authentication**: Secure login and registration for customers and admins.
- **Stock Notifications**: Alerts for admins when product stock reaches zero.
## Tech Stack
- **Programming Language:** Java
- **UI Framework:** Swing
- **Database:** MySQL
- **Build Tool:** Maven
## Software and Tools Required

To set up and run the Supermarket Management System (E-commerce), you need the following:

1. **Java Development Kit (JDK)**  
   - Version: JDK 8 or later  
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Integrated Development Environment (IDE)**  
   - Recommended: Apache NetBeans  
   - [Download NetBeans](https://netbeans.apache.org/download/index.html)

3. **MySQL**  
   - Version: 8.0 or compatible  
   - [Download MySQL](https://dev.mysql.com/downloads/mysql/)

   - **MySQL Workbench** (optional): For database management and query execution  
  [Download MySQL Workbench here](https://dev.mysql.com/downloads/workbench/)


4. **Libraries and Dependencies**
    - **JDBC Driver**: For connecting the application to the MySQL database
    - Example: MySQL Connector/J (v8.0 or higher)
    - [Download MySQL Connector/J here](https://dev.mysql.com/downloads/connector/j/)
  
   Maven dependency for MySQL Connector/J (add to your pom.xml):
  ```xml
   <dependencies>
    <!-- MySQL Connector/J Dependency for connecting Java application to MySQL database -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.28</version>
    </dependency>
</dependencies>
```

5. **Build Tools**
- **Maven**: For dependency management and project builds (if applicable)
  -  https://maven.apache.org/download.cgi
  -  Apache Maven [https://www.youtube.com/watch?v=jd2zx3dLjuw]

6. **Git**  
   - For version control.  
   - [Download Git](https://git-scm.com/)

### **Operating System**
- Compatible with Windows, macOS, or Linux

### **Additional Tools**
- **Image Editor**: For creating/editing product images (optional)
  - Examples: GIMP, Photoshop
- **Browser**: For viewing exported HTML reports or online references


## Importing and Running The Project Through NetBeans


  This section will guide you through importing and running the Supermarket Management System project using NetBeans IDE.
  

 **1. Clone the Repository**
Clone the repository to your local machine using Git

Clone using Git:
git clone https://github.com/Maliha-Moon/supermarket-management.git

 **2. Open NetBeans IDE**
  - Launch NetBeans IDE on your machine.
  - If you don't have it installed, you can download it from the [NetBeans download page.](https://netbeans.apache.org/front/main/download/index.html)

 **3. Import the Project into NetBeans**
  - From the NetBeans IDE, click on File > Open Project.
  - Navigate to the directory where you cloned or extracted the project.
  - Select the project folder (it should contain a nbproject folder if it's a NetBeans project) and click Open Project.
  - NetBeans will automatically detect the project type (Java or Maven-based) and set it up for you.

 **4. Database Setup Instructions**


   Follow these steps to set up the database for the Supermarket Management System:
   

 **Step 1:** Open MySQL Command Line or MySQL Workbench
  
   - Option 1: Open the MySQL Command Prompt (on Windows) or use the terminal (on macOS/Linux).
   - Option 2: Open MySQL Workbench (GUI-based).
     
 **Step 2:** Login to MySQL as the Administrator User
   - In the MySQL Command Prompt or terminal, execute the following command to log in as the MySQL root user:
   ```
   mysql -u <username> -p
   
   ```
   - Replace <username> with your MySQL username (e.g., root).
   - Enter your password when prompted.

 **Step 3:** Update the Database Connection Settings:
   - After the database schema has been executed, you need to configure the database connection in your project.
   - Open the DatabaseHelper.java (or the corresponding file in your project).
   - Update the connection string with your MySQL credentials (username, password, and database name):

     ```
     String url = "jdbc:mysql://localhost:3306/supermarket_management";
     String username = "your_username";
     String password = "your_password";
     ```

 **Step 4:** Create a New Database:
    - Open MySQL Workbench or use the command-line MySQL client.
    - Create a new database using the following SQL query
    
    CREATE DATABASE supermarket_management;
  
    
 **Step 5:** Execute the Database Schema Query
  - Download the SQL query file from the repository (located at databases/mysql_query.sql).
  - Copy the contents of the mysql_query.sql file.
  - Option 1: In MySQL Command Prompt, paste the query and press Enter to execute.
  - Option 2: In MySQL Workbench, open the mysql_query.sql file and click the Execute button.


**5. Resolve Project Dependencies**
  - If you're using Maven, NetBeans should automatically resolve the dependencies defined in the pom.xml file when the project is imported.
  - If Maven dependencies are not automatically downloaded, you can right-click the project in the Projects window and select Resolve Project Problems or use the following Maven command in the Output window:

    ```
    mvn install

    ```
**6. Run the Project**
  - After the project is set up, locate the Main Class of the project (it’s usually called Main.java or App.java).
  - Right-click on the Main class file in the Projects window and select Run File.
  - Alternatively, you can click the Run button (green play icon) in the toolbar to run the project.
    
**7. Access the Application**
  - The Supermarket Management System (E-commerce) application will launch in a new window.
  - You can start using the application to manage products, create orders, and generate invoices.

**8. Stop the Application**
  - To stop the application, simply close the running window or click the Stop button (red square icon) in NetBeans.
    
## Usage
- After launching the application, users can:
  - Register or log in
  - Browse products, add them to the cart
  - Place orders

## Screenshots
### log-in 
![supermarket_log_in](https://github.com/user-attachments/assets/4ea28859-ac27-4ad3-8a88-06174687c343)

### sign-up 
![supermarket_sign_up](https://github.com/user-attachments/assets/abee2c39-dbbc-4120-99d3-9e7aac6aad53)

### Home Page
![supermarket_home_page](https://github.com/user-attachments/assets/07bbc40e-c966-4efd-a439-e6d9a0e06010)

### Search products
![supermarket_search](https://github.com/user-attachments/assets/fb173612-ca11-4a5f-8e78-d1943abaa5b1)





