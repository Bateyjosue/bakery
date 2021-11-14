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

--
-- Dumping events for database 'dbmarket'
--

--
-- Dumping routines for database 'dbmarket'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-23 16:35:23
