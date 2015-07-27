-- MySQL dump 10.13  Distrib 5.5.1-m2, for Win32 (ia32)
--
-- Host: localhost    Database: osd
-- ------------------------------------------------------
-- Server version	5.5.1-m2-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car_booking`
--

DROP TABLE IF EXISTS `car_booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_booking` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `booking_ref` varchar(45) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `vehicle_reg_num` varchar(45) DEFAULT NULL,
  `start_date_time` datetime DEFAULT NULL,
  `end_date_time` datetime DEFAULT NULL,
  `actual_end_date_time` datetime DEFAULT NULL,
  `booking_status` int(3) DEFAULT NULL,
  `updatedUser` int(11) DEFAULT NULL,
  `createdUser` int(11) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `system_id` varchar(45) DEFAULT NULL,
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_date` datetime DEFAULT NULL,
  `ltsp_id` int(11) DEFAULT NULL,
  `car_hub` varchar(45) DEFAULT NULL,
  `car_model` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_booking`
--

LOCK TABLES `car_booking` WRITE;
/*!40000 ALTER TABLE `car_booking` DISABLE KEYS */;
INSERT INTO `car_booking` VALUES (18,'OCRN-PKHOLH4E',15,NULL,'2015-07-27 00:00:00','2015-07-27 21:00:00',NULL,0,NULL,NULL,NULL,NULL,'2015-07-27 06:09:17','2015-07-27 11:39:17',NULL,'Delhi','Audi A6'),(19,'OCRN-WXOFIHCH',15,NULL,'2015-07-27 00:00:00','2015-07-27 13:00:00',NULL,0,NULL,NULL,NULL,NULL,'2015-07-27 11:01:58','2015-07-27 16:31:58',NULL,'Delhi','Nissan Sunny');
/*!40000 ALTER TABLE `car_booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_booking_tax`
--

DROP TABLE IF EXISTS `car_booking_tax`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_booking_tax` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_booking_tax`
--

LOCK TABLES `car_booking_tax` WRITE;
/*!40000 ALTER TABLE `car_booking_tax` DISABLE KEYS */;
INSERT INTO `car_booking_tax` VALUES (1,'Service Tax',14);
/*!40000 ALTER TABLE `car_booking_tax` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_customer`
--

DROP TABLE IF EXISTS `car_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(200) DEFAULT NULL,
  `customer_dob` varchar(15) DEFAULT NULL,
  `customer_dlExpiryDate` datetime DEFAULT NULL,
  `customer_sex` varchar(10) DEFAULT NULL,
  `customer_mobile` varchar(10) DEFAULT NULL,
  `customer_email` varchar(25) DEFAULT NULL,
  `customer_address` varchar(500) DEFAULT NULL,
  `customer_adhar` varchar(30) DEFAULT NULL,
  `customer_passport` varchar(30) DEFAULT NULL,
  `customer_dl_number` varchar(30) DEFAULT NULL,
  `dl_issuing_state` varchar(15) DEFAULT NULL,
  `dl_issuing_authority` varchar(15) DEFAULT NULL,
  `customer_security_question` varchar(100) DEFAULT NULL,
  `customer_security_answer` varchar(45) DEFAULT NULL,
  `customer_contact_person` varchar(45) DEFAULT NULL,
  `customer_contact_number` varchar(12) DEFAULT NULL,
  `customer_pickup_location` varchar(45) DEFAULT NULL,
  `customer_prefered_car` varchar(45) DEFAULT NULL,
  `customer_docs_path` varchar(45) DEFAULT NULL,
  `request_status` int(3) NOT NULL DEFAULT '0',
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_customer`
--

LOCK TABLES `car_customer` WRITE;
/*!40000 ALTER TABLE `car_customer` DISABLE KEYS */;
INSERT INTO `car_customer` VALUES (8,'Amit','27/07/1997',NULL,'male','8792594483','gyandeep.amit@gmail.com','sanjay nagar','adn123','pass123','dl123','kar123','indian',NULL,NULL,'jeethu','9900200135','delhi','city','Amit1437977217871',1,'2015-07-27 06:07:47','2015-07-27 11:36:57');
/*!40000 ALTER TABLE `car_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_customer_doc`
--

DROP TABLE IF EXISTS `car_customer_doc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_customer_doc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fileType` int(2) DEFAULT NULL,
  `path` varchar(200) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `customer_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_customer_doc`
--

LOCK TABLES `car_customer_doc` WRITE;
/*!40000 ALTER TABLE `car_customer_doc` DISABLE KEYS */;
INSERT INTO `car_customer_doc` VALUES (22,1,'Amit1437977217871/ADHAR/000.jpg','2015-07-27 06:06:58',8),(23,2,'Amit1437977217871/PASSPORT/22.png','2015-07-27 06:06:58',8),(24,3,'Amit1437977217871/DRIVING_LICENCE/50188.jpg','2015-07-27 06:06:58',8);
/*!40000 ALTER TABLE `car_customer_doc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_invoice`
--

DROP TABLE IF EXISTS `car_invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_invoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `booking_id` int(11) DEFAULT NULL,
  `security_deposit` float DEFAULT NULL,
  `adnl_security_deposit` double DEFAULT NULL,
  `trip_cost` double DEFAULT NULL,
  `adjusted_from_wallet` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `service_tax` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `updatedUser` int(11) DEFAULT NULL,
  `createdUser` int(11) DEFAULT NULL,
  `ltsp` int(11) DEFAULT NULL,
  `client` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `drop_off_date` datetime DEFAULT NULL,
  `pickup_date` datetime DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_invoice`
--

LOCK TABLES `car_invoice` WRITE;
/*!40000 ALTER TABLE `car_invoice` DISABLE KEYS */;
INSERT INTO `car_invoice` VALUES (8,18,10000,1000,8316,1000,0,14,16320.24,NULL,NULL,NULL,NULL,NULL,'2015-07-27 06:09:17','2015-07-27 21:00:00','2015-07-27 00:00:00',1),(9,19,4000,1000,1495,1000,0,14,8544.3,NULL,NULL,NULL,NULL,NULL,'2015-07-27 11:01:59','2015-07-27 13:00:00','2015-07-27 00:00:00',1);
/*!40000 ALTER TABLE `car_invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_penalty`
--

DROP TABLE IF EXISTS `car_penalty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_penalty` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(3) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `penalty_type` int(3) DEFAULT NULL,
  `lastUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `creationTime` datetime DEFAULT NULL,
  `updatedUser` int(11) DEFAULT NULL,
  `createdUser` int(11) DEFAULT NULL,
  `ltsp` int(11) DEFAULT NULL,
  `client` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_penalty`
--

LOCK TABLES `car_penalty` WRITE;
/*!40000 ALTER TABLE `car_penalty` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_penalty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_penalty_type`
--

DROP TABLE IF EXISTS `car_penalty_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_penalty_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  `updated_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_penalty_type`
--

LOCK TABLES `car_penalty_type` WRITE;
/*!40000 ALTER TABLE `car_penalty_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_penalty_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_security_deposite`
--

DROP TABLE IF EXISTS `car_security_deposite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_security_deposite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_segment` varchar(45) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_security_deposite`
--

LOCK TABLES `car_security_deposite` WRITE;
/*!40000 ALTER TABLE `car_security_deposite` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_security_deposite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_security_deposite_history`
--

DROP TABLE IF EXISTS `car_security_deposite_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_security_deposite_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_segment` varchar(45) DEFAULT NULL,
  `cost` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_security_deposite_history`
--

LOCK TABLES `car_security_deposite_history` WRITE;
/*!40000 ALTER TABLE `car_security_deposite_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_security_deposite_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_segment`
--

DROP TABLE IF EXISTS `car_segment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_segment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_segment`
--

LOCK TABLES `car_segment` WRITE;
/*!40000 ALTER TABLE `car_segment` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_segment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_tariff`
--

DROP TABLE IF EXISTS `car_tariff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_tariff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cost` float DEFAULT NULL,
  `cutOffKMs` float DEFAULT NULL,
  `ratePerHour` float DEFAULT NULL,
  `ratePerKM` float DEFAULT NULL,
  `tariff_type` int(2) DEFAULT NULL,
  `car_model` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_tariff`
--

LOCK TABLES `car_tariff` WRITE;
/*!40000 ALTER TABLE `car_tariff` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_tariff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_tariff_type`
--

DROP TABLE IF EXISTS `car_tariff_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_tariff_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `value` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_tariff_type`
--

LOCK TABLES `car_tariff_type` WRITE;
/*!40000 ALTER TABLE `car_tariff_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `car_tariff_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `days_of_week`
--

DROP TABLE IF EXISTS `days_of_week`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `days_of_week` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `day` varchar(45) DEFAULT NULL,
  `day_number` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `days_of_week`
--

LOCK TABLES `days_of_week` WRITE;
/*!40000 ALTER TABLE `days_of_week` DISABLE KEYS */;
/*!40000 ALTER TABLE `days_of_week` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_role`
--

DROP TABLE IF EXISTS `tbl_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_role`
--

LOCK TABLES `tbl_role` WRITE;
/*!40000 ALTER TABLE `tbl_role` DISABLE KEYS */;
INSERT INTO `tbl_role` VALUES (1,'ADMIN'),(2,'CUSTOMER'),(3,'HUB USER');
/*!40000 ALTER TABLE `tbl_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_emailId` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_role` int(11) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `hubName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES (1,'gyandeep@gmail.com','12345',1,'2015-07-13 16:44:10',NULL),(13,'hub@gmail.com','1234',3,'2015-07-26 05:17:10','Delhi'),(15,'gyandeep.amit@gmail.com','2wmama',2,'2015-07-27 06:07:47',NULL);
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_security_deposite`
--

DROP TABLE IF EXISTS `user_security_deposite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_security_deposite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_security_deposite`
--

LOCK TABLES `user_security_deposite` WRITE;
/*!40000 ALTER TABLE `user_security_deposite` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_security_deposite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-27 17:15:38
