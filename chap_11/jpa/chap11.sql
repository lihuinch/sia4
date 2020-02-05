/*
 Navicat Premium Data Transfer

 Source Server         : conn
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : hibernate-integration

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 05/02/2020 17:47:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for nba_player
-- ----------------------------
DROP TABLE IF EXISTS `nba_player`;
CREATE TABLE `nba_player`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `player_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for nba_team
-- ----------------------------
DROP TABLE IF EXISTS `nba_team`;
CREATE TABLE `nba_team`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `team_name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
