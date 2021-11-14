-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbmarket
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!50001 DROP VIEW IF EXISTS `bill`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `bill` AS SELECT 
 1 AS `Bill_ID`,
 1 AS `Bill_DATE`,
 1 AS `name`,
 1 AS `phone`,
 1 AS `mail`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `billreceipt`
--

DROP TABLE IF EXISTS `billreceipt`;
/*!50001 DROP VIEW IF EXISTS `billreceipt`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `billreceipt` AS SELECT 
 1 AS `Bill_ID`,
 1 AS `Receipt_ID`,
 1 AS `bar_code`,
 1 AS `designation`,
 1 AS `price`,
 1 AS `Quantity`,
 1 AS `Amount`,
 1 AS `Bill_DATE`,
 1 AS `name`,
 1 AS `phone`,
 1 AS `mail`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `bills`
--

DROP TABLE IF EXISTS `bills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bills` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `id_client` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_client` (`id_client`),
  CONSTRAINT `bills_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bills`
--

LOCK TABLES `bills` WRITE;
/*!40000 ALTER TABLE `bills` DISABLE KEYS */;
INSERT INTO `bills` VALUES (1,'2019-09-21',1),(5,'2019-09-21 13:22:38',2),(6,'2019-10-01',2),(7,' 2019-Nov- 02',4);
/*!40000 ALTER TABLE `bills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `mail` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'joshua','male','0989','jos@icloud.com'),(2,'reby','female','079','becca@gmail.com'),(3,'rubens','Male','08979807','rubens@gmail.com'),(4,'gloire','Male','09808709','gloirebahati@gmail.com');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contain`
--

DROP TABLE IF EXISTS `contain`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_bill` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `bill_qty` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_bill` (`id_bill`),
  KEY `id_product` (`id_product`),
  CONSTRAINT `contain_ibfk_1` FOREIGN KEY (`id_bill`) REFERENCES `bills` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `contain_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `products` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contain`
--

LOCK TABLES `contain` WRITE;
/*!40000 ALTER TABLE `contain` DISABLE KEYS */;
INSERT INTO `contain` VALUES (1,1,1,20),(2,5,1,10),(3,5,1,1),(4,6,3,5),(5,7,7,3),(6,7,4,12),(7,7,4,5);
/*!40000 ALTER TABLE `contain` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `dim1` BEFORE INSERT ON `contain` FOR EACH ROW update `products` 
set `stock_qty`=(`stock_qty`-new.bill_qty) 
where products.`id`=new.id_product */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary view structure for view `facture`
--

DROP TABLE IF EXISTS `facture`;
/*!50001 DROP VIEW IF EXISTS `facture`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `facture` AS SELECT 
 1 AS `Receipt_ID`,
 1 AS `Bill_ID`,
 1 AS `bar_code`,
 1 AS `designation`,
 1 AS `price`,
 1 AS `Quantity`,
 1 AS `Amount`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `designation` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `nature` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `categories` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `bar_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `exp_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `description` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `stock_qty` int(11) NOT NULL,
  `stock_date` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `bar_code` (`bar_code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'inyange apple',700,'P','Drink','6161106380459','2022-02-19','fruit drink',70,'2019-09-21'),(2,'pens',100,'P','Scholarstic','342343','2021-02-19','red, blue, and black pens',1000,'2019-09-21'),(3,'inyange pumkins',800,'P','Drink','6161106380217','2019-09-21','fruit drink',5,'2019-09-21'),(4,'cocacola',700,'P','Drink','54491472','2020-01-01','original taste',127,'2019-11-01 08:50:32'),(5,'inyange mango',400,'P','Drink','6161106380985','2020-11-02','mango fruit drink with white cover bottle',100,'2019-11-02'),(6,'movit',700,'P','Cosmetic','6161107220358','2021-11-02','curl activator hair get',50,'2019-11-02'),(7,'innocence',2000,'P','Cosmetic','693163914831','2020-11-02','white and pink box with floors',29,'2019-11-02 14:23:41');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usernames` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passwords` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `types` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `phones` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'joshbatey','201909','admin','0784976465'),(2,'josue','josue','user1','0789765433'),(3,'batey','batey','user2','0780798967'),(4,'rubens','rubens','user2','08766453656');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbmarket'
--

--
-- Dumping routines for database 'dbmarket'
--

--
-- Final view structure for view `bill`
--

/*!50001 DROP VIEW IF EXISTS `bill`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `bill` AS select `bills`.`id` AS `Bill_ID`,`bills`.`bill_date` AS `Bill_DATE`,`clients`.`name` AS `name`,`clients`.`phone` AS `phone`,`clients`.`mail` AS `mail` from (`clients` join `bills` on((`bills`.`id_client` = `clients`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `billreceipt`
--

/*!50001 DROP VIEW IF EXISTS `billreceipt`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `billreceipt` AS select `facture`.`Bill_ID` AS `Bill_ID`,`facture`.`Receipt_ID` AS `Receipt_ID`,`facture`.`bar_code` AS `bar_code`,`facture`.`designation` AS `designation`,`facture`.`price` AS `price`,`facture`.`Quantity` AS `Quantity`,`facture`.`Amount` AS `Amount`,`bill`.`Bill_DATE` AS `Bill_DATE`,`bill`.`name` AS `name`,`bill`.`phone` AS `phone`,`bill`.`mail` AS `mail` from (`facture` join `bill` on((`facture`.`Bill_ID` = `bill`.`Bill_ID`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `facture`
--

/*!50001 DROP VIEW IF EXISTS `facture`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `facture` AS select `c`.`id` AS `Receipt_ID`,`c`.`id_bill` AS `Bill_ID`,`p`.`bar_code` AS `bar_code`,`p`.`designation` AS `designation`,`p`.`price` AS `price`,`c`.`bill_qty` AS `Quantity`,(`c`.`bill_qty` * `p`.`price`) AS `Amount` from (`products` `p` join `contain` `c` on((`c`.`id_product` = `p`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-23 16:37:29
