# Host: localhost  (Version 5.6.42-log)
# Date: 2022-09-13 17:44:17
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "countries"
#

DROP TABLE IF EXISTS `countries`;
CREATE TABLE `countries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `code` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "countries"
#


#
# Structure for table "states"
#

DROP TABLE IF EXISTS `states`;
CREATE TABLE `states` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `code` varchar(25) DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `state_country_id_fk` (`country_id`),
  CONSTRAINT `state_country_id_fk` FOREIGN KEY (`country_id`) REFERENCES `countries` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "states"
#


#
# Structure for table "districts"
#

DROP TABLE IF EXISTS `districts`;
CREATE TABLE `districts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `code` varchar(25) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `state_district_id_fk` (`state_id`),
  CONSTRAINT `state_district_id_fk` FOREIGN KEY (`state_id`) REFERENCES `states` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "districts"
#


#
# Structure for table "areas"
#

DROP TABLE IF EXISTS `areas`;
CREATE TABLE `areas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `code` varchar(25) DEFAULT NULL,
  `pincode` int(11) DEFAULT NULL,
  `district_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `area_district_id_fk` (`district_id`),
  CONSTRAINT `area_district_id_fk` FOREIGN KEY (`district_id`) REFERENCES `districts` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "areas"
#


#
# Structure for table "area_alias"
#

DROP TABLE IF EXISTS `area_alias`;
CREATE TABLE `area_alias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) DEFAULT NULL,
  `area_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `area_alias_area_fk` (`area_id`),
  CONSTRAINT `area_alias_area_fk` FOREIGN KEY (`area_id`) REFERENCES `areas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "area_alias"
#

