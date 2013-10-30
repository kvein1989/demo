/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2013-10-30 14:17:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `sex` varchar(2) COLLATE gbk_bin DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `card_no` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `department` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `major` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `grade` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `education` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  `photo` varchar(255) COLLATE gbk_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COLLATE=gbk_bin;

-- ----------------------------
-- Records of student
-- ----------------------------
