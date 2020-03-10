# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.15
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2020-03-10 17:33:19
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for makeyourcareers
CREATE DATABASE IF NOT EXISTS `makeyourcareers` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `makeyourcareers`;


# Dumping structure for table makeyourcareers.address
CREATE TABLE IF NOT EXISTS `address` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `street_name` varchar(5000) NOT NULL,
  `city_id` bigint(100) NOT NULL DEFAULT '0',
  `is_active` tinyint(4) DEFAULT '0',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__city` (`city_id`),
  CONSTRAINT `FK__city` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.address: ~0 rows (approximately)
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.city
CREATE TABLE IF NOT EXISTS `city` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL DEFAULT '0',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT '0',
  `state_id` bigint(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK__state` (`state_id`),
  CONSTRAINT `FK__state` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.city: ~0 rows (approximately)
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.country
CREATE TABLE IF NOT EXISTS `country` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.country: ~0 rows (approximately)
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.question_stream
CREATE TABLE IF NOT EXISTS `question_stream` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `question_stream_name` varchar(500) NOT NULL,
  `question_stream_desc` varchar(500) DEFAULT NULL,
  `create_Date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  `question_type_id` bigint(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__question_type` (`question_type_id`),
  CONSTRAINT `FK__question_type` FOREIGN KEY (`question_type_id`) REFERENCES `question_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.question_stream: ~11 rows (approximately)
/*!40000 ALTER TABLE `question_stream` DISABLE KEYS */;
INSERT INTO `question_stream` (`id`, `question_stream_name`, `question_stream_desc`, `create_Date`, `is_active`, `question_type_id`) VALUES
	(1, 'CSE', NULL, '2020-02-23 00:00:00', 1, 1),
	(2, 'EEE', NULL, '2020-02-23 00:00:00', 1, 1),
	(3, 'ECE', NULL, '2020-02-23 00:00:00', 1, 1),
	(4, 'MECH', NULL, '2020-02-23 00:00:00', 1, 1),
	(5, 'CIVIL', NULL, '2020-02-23 00:00:00', 1, 1),
	(6, 'AUTO', NULL, '2020-02-23 00:00:00', 1, 1),
	(7, 'AERO', NULL, '2020-02-23 00:00:00', 1, 1),
	(8, 'Management', NULL, '2020-02-23 00:00:00', 1, 2),
	(9, 'ICAI', NULL, '2020-02-23 00:00:00', 1, 2),
	(10, 'Commerce', NULL, '2020-02-23 00:00:00', 1, 2),
	(11, 'Arts', NULL, '2020-02-23 00:00:00', 1, 2);
/*!40000 ALTER TABLE `question_stream` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.question_type
CREATE TABLE IF NOT EXISTS `question_type` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `question_type_name` varchar(500) DEFAULT NULL,
  `question_type_desc` varchar(500) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.question_type: ~2 rows (approximately)
/*!40000 ALTER TABLE `question_type` DISABLE KEYS */;
INSERT INTO `question_type` (`id`, `question_type_name`, `question_type_desc`, `create_date`, `is_active`) VALUES
	(1, 'Technical', NULL, '2020-02-23 17:04:24', 1),
	(2, 'Non-Technical', NULL, '2020-02-23 17:05:00', 1);
/*!40000 ALTER TABLE `question_type` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.register
CREATE TABLE IF NOT EXISTS `register` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL,
  `mobile_no` varchar(500) NOT NULL,
  `email` varchar(500) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `primary_skills` varchar(5000) DEFAULT NULL,
  `nationality` varchar(500) DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  `resident_address_id` bigint(100) DEFAULT NULL,
  `comm_address_id` bigint(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_register_address` (`resident_address_id`),
  KEY `FK_register_address_2` (`comm_address_id`),
  CONSTRAINT `FK_register_address` FOREIGN KEY (`resident_address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_register_address_2` FOREIGN KEY (`comm_address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.register: ~0 rows (approximately)
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
/*!40000 ALTER TABLE `register` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.skills
CREATE TABLE IF NOT EXISTS `skills` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `skills_name` varchar(500) NOT NULL,
  `skills_desc` varchar(500) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  `question_stream_Id` bigint(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__question_stream` (`question_stream_Id`),
  CONSTRAINT `FK__question_stream` FOREIGN KEY (`question_stream_Id`) REFERENCES `question_stream` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.skills: ~12 rows (approximately)
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` (`id`, `skills_name`, `skills_desc`, `create_date`, `is_active`, `question_stream_Id`) VALUES
	(1, 'C', NULL, '2020-02-23 17:25:49', 1, 1),
	(2, 'C++', NULL, '2020-02-23 17:25:53', 1, 1),
	(3, 'Java', NULL, '2020-02-23 17:26:01', 1, 1),
	(4, 'PHP', NULL, '2020-02-23 17:26:10', 1, 1),
	(5, 'Dot Net', NULL, '2020-02-23 17:26:33', 1, 1),
	(6, 'HTML', NULL, '2020-02-23 17:27:46', 1, 1),
	(7, 'Engines', NULL, '2020-02-23 17:29:15', 1, 4),
	(8, 'Vehicle Aerodynamics', NULL, '2020-02-23 17:29:28', 1, 4),
	(9, 'Thermodynamics', NULL, '2020-02-23 17:29:43', 1, 4),
	(10, 'Fluid Mechanics', NULL, '2020-02-23 17:29:55', 1, 4),
	(11, 'Part Designing', NULL, '2020-02-23 17:30:18', 1, 4),
	(12, 'Machinery', NULL, '2020-02-23 17:30:29', 1, 4);
/*!40000 ALTER TABLE `skills` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.state
CREATE TABLE IF NOT EXISTS `state` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `is_active` tinyint(4) DEFAULT NULL,
  `country_id` bigint(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__country` (`country_id`),
  CONSTRAINT `FK__country` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.state: ~0 rows (approximately)
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
