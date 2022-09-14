
CREATE DATABASE `split_bill`;
USE `split_bill`;

CREATE TABLE `user_group` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_at` date DEFAULT NULL,
  `group_data` varchar(255) DEFAULT NULL,
  `update_at` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `group_expense` (
  `id` int NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `is_admin` varchar(255) DEFAULT NULL,
  `metadata` varchar(255) DEFAULT NULL,
  `mobile_no` int DEFAULT NULL,
  `update_at` date DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_group_id_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaafuik48s8d0kffohf5x5c68c` (`user_group_id_id`),
  CONSTRAINT `FKaafuik48s8d0kffohf5x5c68c` FOREIGN KEY (`user_group_id_id`) REFERENCES `user_group` (`id`)
) ;

CREATE TABLE `expense_txn_history` (
  `id` int NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `created_at` date DEFAULT NULL,
  `desciption` varchar(255) DEFAULT NULL,
  `mobile_no` int DEFAULT NULL,
  `txn` varchar(255) DEFAULT NULL,
  `updated_by_mob_no` int DEFAULT NULL,
  `group_expense_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKm9539jvjw3ir8yytyl4picfw1` (`group_expense_id`),
  CONSTRAINT `FKm9539jvjw3ir8yytyl4picfw1` FOREIGN KEY (`group_expense_id`) REFERENCES `group_expense` (`id`)
) ;
