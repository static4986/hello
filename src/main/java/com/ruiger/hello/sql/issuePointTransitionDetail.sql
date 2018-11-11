/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : mysql

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 12/11/2018 01:35:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for issuePointTransitionDetail
-- ----------------------------
DROP TABLE IF EXISTS `issuePointTransitionDetail`;
CREATE TABLE `issuePointTransitionDetail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userUuid` varchar(32) DEFAULT NULL,
  `userPhone` varchar(32) DEFAULT NULL,
  `issuePointNum` varchar(32) DEFAULT NULL,
  `issueDepartment` varchar(32) DEFAULT NULL,
  `issueDate` datetime DEFAULT NULL,
  `issueSystem` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of issuePointTransitionDetail
-- ----------------------------
BEGIN;
INSERT INTO `issuePointTransitionDetail` VALUES (1, 'ldjfl2lj4n35', '13112345678', '30', '202', '2018-01-01 00:00:00', 'vass');
INSERT INTO `issuePointTransitionDetail` VALUES (2, 'jlakj3l54n63', '13112345678', '101', '202', '2018-02-03 00:00:00', 'vass');
INSERT INTO `issuePointTransitionDetail` VALUES (3, '0', '0', '0', '0', NULL, '0');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
