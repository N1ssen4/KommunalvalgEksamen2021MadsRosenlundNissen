-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: samsokv
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `kandidat`
--

DROP TABLE IF EXISTS `kandidat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kandidat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `navn` varchar(90) NOT NULL,
  `parti_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_kandidat_parti_idx` (`parti_id`),
  CONSTRAINT `fk_kandidat_parti` FOREIGN KEY (`parti_id`) REFERENCES `parti` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kandidat`
--

LOCK TABLES `kandidat` WRITE;
/*!40000 ALTER TABLE `kandidat` DISABLE KEYS */;
INSERT INTO `kandidat` VALUES (1,'Marcel Meijer',1),(2,'Michael Kristensen',1),(3,'Helle Hansen',1),(4,'Stefan Hafstein Wolffbrandt',1),(5,'Karina Knobelauch',1),(6,'Robert V. Rasmussen',1),(7,'Pia Ramsing',1),(8,'Anders Baun Sørensen',1),(9,'Per Urban Olsen',2),(10,'Peter Askjær',2),(11,'Martin Sørensen',2),(12,'Louise Bramstorp',2),(13,'Sigfred Jensen',2),(14,'Jørn C. Nissen',2),(15,'Morten Ø. Kristensen',2),(16,'Susanne Andersen',2),(17,'Iulian V. Paiu',2),(18,'Per Hingel',2),(19,'Ulla Holm',3),(20,'Kjeld Bønkel',3),(21,'Anne Grethe Olsen',3),(22,'Lone Krag',3),(23,'Børge S. Buur',3),(24,'Per Mortensen',4),(25,'Søren Wiese',5),(26,'Anita Elgaard Højholt Olesen',5),(27,'Carsten Bruun',5),(28,'Mogens Exner',5),(29,'Anja Guldborg',5),(30,'Klaus Holdorf',5),(31,'Katrine Høegh Mc Quaid',6),(32,'Jette M. Søgaard',6),(33,'Søren Caspersen',6),(34,'Pia Birkmand',6);
/*!40000 ALTER TABLE `kandidat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20 19:55:49
