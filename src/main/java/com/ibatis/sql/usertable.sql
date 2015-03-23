/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50508
Source Host           : localhost:3306
Source Database       : scupg

Target Server Type    : MYSQL
Target Server Version : 50508
File Encoding         : 65001

Date: 2014-11-11 15:37:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
CREATE TABLE `usertable` (
  `account` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usertable
-- ----------------------------
INSERT INTO `usertable` VALUES ('zx642678268', '123456');
INSERT INTO `usertable` VALUES ('zx12345678', '12345678');
INSERT INTO `usertable` VALUES ('test12', 'password');
