-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.3.7-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for pizza
CREATE DATABASE IF NOT EXISTS `pizza` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pizza`;

-- Dumping structure for table pizza.cart_lines
CREATE TABLE IF NOT EXISTS `cart_lines` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `subSum` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cart_lines_menu` (`product`),
  CONSTRAINT `FK_cart_lines_menu` FOREIGN KEY (`product`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table pizza.cart_lines: ~6 rows (approximately)
/*!40000 ALTER TABLE `cart_lines` DISABLE KEYS */;
INSERT INTO `cart_lines` (`id`, `product`, `quantity`, `subSum`) VALUES
	(1, 1, 1, 2),
	(2, 3, 1, 2);
/*!40000 ALTER TABLE `cart_lines` ENABLE KEYS */;

-- Dumping structure for table pizza.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table pizza.hibernate_sequence: 2 rows
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(3),
	(3);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table pizza.menu
CREATE TABLE IF NOT EXISTS `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 NOT NULL,
  `price` double NOT NULL,
  `picturePath` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=cp1251 COLLATE=cp1251_bulgarian_ci;

-- Dumping data for table pizza.menu: ~16 rows (approximately)
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` (`id`, `name`, `description`, `price`, `picturePath`) VALUES
	(1, 'Маргарита', 'Доматен cart_linesсос, Extra Моцарела', 8.5, NULL),
	(2, 'Медитеранео', 'Доматен сос, Моцарела, Краве сирене, Черни маслини, Пресни домати, Пресни зелени чушки ', 9.3, NULL),
	(3, 'Алфредо', 'Сметана, Моцарела, Пиле, Бейби Спанак', 9.6, NULL),
	(4, 'Чикината', 'Доматен сос, Моцарела, Ементал, Пеперони, Пиле, Пресни домати', 10.9, NULL),
	(5, 'Специална', 'Доматен сос, Моцарела, Пушена шунка, Пушен бекон, Пресни зелени чушки, Пресни гъби, Лук ', 10.7, NULL),
	(6, 'Чик–Чи–Рик', 'Доматен сос, Моцарела, Топено сирене, Пиле, Царевица', 11, NULL),
	(7, 'Карбонара', 'Сметана, Моцарела, Пушен бекон, Пресни гъби', 9.9, NULL),
	(8, 'Пеперони', 'Доматен сос, Extra Моцарела, Extra Пеперони', 10.9, NULL),
	(9, 'Барбекю пиле', 'Барбекю сос, Моцарела, Пиле, Пушен бекон', 10.6, NULL),
	(10, 'Барбекю класик', 'Барбекю сос, Моцарела, Пушен бекон, Пикантно телешко', 10.6, NULL),
	(11, 'Ню Йорк', 'Доматен сос, Extra Чедар сирене, Моцарела, Пушен бекон, Пресни гъби', 10.9, NULL),
	(12, 'Шунка класик', 'Доматен сос, Моцарела, Пушена шунка, Пресни зелени чушки, Пресни гъби', 9.3, NULL),
	(13, 'Италианска', 'Доматен сос, Босилек, Пармезан, Моцарела, Пресни домати, Песто сос', 9.9, NULL),
	(14, 'Хавай', 'Доматен сос, Моцарела, Пушена шунка, Ананас', 10.3, NULL),
	(15, 'Формаджи', 'Доматен сос, Чедар сирене, Моцарела, Краве сирене, Пармезан', 9.5, NULL),
	(16, 'Туна', 'Доматен сос, Моцарела, Риба тон, Пресни домати, Лук', 9.9, NULL);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;

-- Dumping structure for table pizza.persistent_logins
CREATE TABLE IF NOT EXISTS `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table pizza.persistent_logins: ~0 rows (approximately)
/*!40000 ALTER TABLE `persistent_logins` DISABLE KEYS */;
/*!40000 ALTER TABLE `persistent_logins` ENABLE KEYS */;

-- Dumping structure for table pizza.role
CREATE TABLE IF NOT EXISTS `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table pizza.role: ~0 rows (approximately)
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`role_id`, `role`) VALUES
	(1, 'ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

-- Dumping structure for table pizza.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `active` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dumping data for table pizza.user: ~2 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `firstname`, `lastname`, `email`, `password`, `active`) VALUES
	(1, 'Martin', 'Ivanov', 'martineskoooo@gmail.com', '$2a$10$0qpJoOocIN6UJMZJ9RW0QuZj823EHIRm/JWd/X80klTOP5uh7uL.u', 1),
	(2, 'Gosho', 'petkov', 'gosho@mitko.ivan', '$2a$10$PWe9SMzdP5PMM9WxC.tsN.AZSt/jCprAlS8esiWowwTl1J0LdesQC', 1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table pizza.user_role
CREATE TABLE IF NOT EXISTS `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `user_role_key` (`role_id`),
  CONSTRAINT `role_userrole` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`),
  CONSTRAINT `user_userrole` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table pizza.user_role: ~2 rows (approximately)
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
	(1, 1),
	(2, 1);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
