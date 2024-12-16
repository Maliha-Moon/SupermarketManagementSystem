CREATE TABLE `sign_up_info` (
   `id` int NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   `username` varchar(45) NOT NULL,
   `E_mail` varchar(100) NOT NULL,
   `password` varchar(32) NOT NULL,
   PRIMARY KEY (`id`,`name`,`username`,`E_mail`,`password`),
   UNIQUE KEY `username_UNIQUE` (`username`)
 ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

 CREATE TABLE `category` (
   `id` int NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   PRIMARY KEY (`id`,`name`),
   UNIQUE KEY `name_UNIQUE` (`name`)
 ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

 CREATE TABLE `product` (
   `id` int NOT NULL AUTO_INCREMENT,
   `name` varchar(45) NOT NULL,
   `category` varchar(45) NOT NULL,
   `subcategory` varchar(45) NOT NULL,
   `price` varchar(45) NOT NULL,
   `stock` varchar(255) NOT NULL,
   `image_path` varchar(255) NOT NULL DEFAULT 'default/path/to/image.jpg',
   PRIMARY KEY (`id`,`name`,`category`,`subcategory`,`price`,`stock`),
   UNIQUE KEY `name_UNIQUE` (`name`),
   KEY `category_idx` (`category`),
   CONSTRAINT `category` FOREIGN KEY (`category`) REFERENCES `category` (`name`)
 ) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

 CREATE TABLE `order_details` (
   `id` int NOT NULL AUTO_INCREMENT,
   `username` varchar(45) NOT NULL,
   `items` int NOT NULL,
   `payment` decimal(10,2) NOT NULL,
   `order_date` date NOT NULL,
   `paymethod` varchar(45) NOT NULL,
   PRIMARY KEY (`id`,`username`,`items`,`payment`,`order_date`,`paymethod`),
   KEY `username_idx` (`username`),
   CONSTRAINT `username` FOREIGN KEY (`username`) REFERENCES `sign_up_info` (`username`)
 ) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

 CREATE TABLE `bill` (
   `id` int NOT NULL AUTO_INCREMENT,
   `order_id` int NOT NULL,
   `phone_number` varchar(45) NOT NULL,
   `city` varchar(45) NOT NULL,
   `address` varchar(45) NOT NULL,
   `items` int NOT NULL,
   `payment` decimal(10,2) NOT NULL,
   `paymethod` varchar(45) NOT NULL,
   `order_date` date NOT NULL,
   PRIMARY KEY (`id`,`order_id`,`phone_number`,`city`,`address`,`items`,`payment`,`paymethod`,`order_date`),
   KEY `order_id_idx` (`order_id`),
   CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `order_details` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci