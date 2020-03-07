# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.15
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2020-03-07 17:51:05
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for makeyourcareers
CREATE DATABASE IF NOT EXISTS `makeyourcareers` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `makeyourcareers`;


# Dumping structure for table makeyourcareers.question_stream
CREATE TABLE IF NOT EXISTS `question_stream` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `questionStreamName` varchar(500) NOT NULL,
  `questionStreamDesc` varchar(500) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  `questionTypeId` bigint(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__question_type` (`questionTypeId`),
  CONSTRAINT `FK__question_type` FOREIGN KEY (`questionTypeId`) REFERENCES `question_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.question_stream: ~11 rows (approximately)
/*!40000 ALTER TABLE `question_stream` DISABLE KEYS */;
INSERT INTO `question_stream` (`id`, `questionStreamName`, `questionStreamDesc`, `createDate`, `isActive`, `questionTypeId`) VALUES
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
  `questionTypeName` varchar(500) NOT NULL,
  `questionTypeDesc` varchar(500) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.question_type: ~2 rows (approximately)
/*!40000 ALTER TABLE `question_type` DISABLE KEYS */;
INSERT INTO `question_type` (`id`, `questionTypeName`, `questionTypeDesc`, `createDate`, `isActive`) VALUES
	(1, 'Technical', NULL, '2020-02-23 17:04:24', 1),
	(2, 'Non-Technical', NULL, '2020-02-23 17:05:00', 1);
/*!40000 ALTER TABLE `question_type` ENABLE KEYS */;


# Dumping structure for table makeyourcareers.skills
CREATE TABLE IF NOT EXISTS `skills` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `skillsName` varchar(500) NOT NULL,
  `skillsDesc` varchar(500) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `isActive` tinyint(4) DEFAULT NULL,
  `questionStreamId` bigint(100) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__question_stream` (`questionStreamId`),
  CONSTRAINT `FK__question_stream` FOREIGN KEY (`questionStreamId`) REFERENCES `question_stream` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

# Dumping data for table makeyourcareers.skills: ~12 rows (approximately)
/*!40000 ALTER TABLE `skills` DISABLE KEYS */;
INSERT INTO `skills` (`id`, `skillsName`, `skillsDesc`, `createDate`, `isActive`, `questionStreamId`) VALUES
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
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
