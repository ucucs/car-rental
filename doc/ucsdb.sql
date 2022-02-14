/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : ucsdb

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 14/02/2022 07:18:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for car_brand
-- ----------------------------
DROP TABLE IF EXISTS `car_brand`;
CREATE TABLE `car_brand` (
  `brand_id` int NOT NULL AUTO_INCREMENT COMMENT '车辆品牌ID',
  `brand_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆品牌名称',
  PRIMARY KEY (`brand_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='汽车品牌';

-- ----------------------------
-- Records of car_brand
-- ----------------------------
BEGIN;
INSERT INTO `car_brand` (`brand_id`, `brand_name`) VALUES (1, 'Toyota');
INSERT INTO `car_brand` (`brand_id`, `brand_name`) VALUES (2, 'Bmw');
COMMIT;

-- ----------------------------
-- Table structure for car_model
-- ----------------------------
DROP TABLE IF EXISTS `car_model`;
CREATE TABLE `car_model` (
  `car_id` int NOT NULL AUTO_INCREMENT COMMENT '车辆ID',
  `car_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆名称',
  `brand_id` int NOT NULL COMMENT '车辆品牌ID',
  `type_id` int NOT NULL COMMENT '车辆类型ID',
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆图片',
  `price` decimal(10,2) NOT NULL COMMENT '车辆价格',
  `onlined` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否上线 0未上线 1已上线',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除 0未删除 1已删除',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆模型';

-- ----------------------------
-- Records of car_model
-- ----------------------------
BEGIN;
INSERT INTO `car_model` (`car_id`, `car_name`, `brand_id`, `type_id`, `picture`, `price`, `onlined`, `deleted`) VALUES (1, 'Toyota Camry', 1, 3, '', 100.00, 1, 0);
INSERT INTO `car_model` (`car_id`, `car_name`, `brand_id`, `type_id`, `picture`, `price`, `onlined`, `deleted`) VALUES (2, 'BMW 650', 2, 4, '', 200.00, 1, 0);
COMMIT;

-- ----------------------------
-- Table structure for car_model_detail
-- ----------------------------
DROP TABLE IF EXISTS `car_model_detail`;
CREATE TABLE `car_model_detail` (
  `car_id` int NOT NULL COMMENT '车辆ID',
  `product_year` varchar(20) NOT NULL COMMENT '生产年份',
  `level` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆等级',
  `seat` int NOT NULL COMMENT '座位数',
  `door` int NOT NULL COMMENT '车门数',
  `gps` tinyint(1) NOT NULL COMMENT '是否配置gps 0未配置 1配置',
  `fuel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '耗油量T',
  `describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '详细描述',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆模型详情';

-- ----------------------------
-- Records of car_model_detail
-- ----------------------------
BEGIN;
INSERT INTO `car_model_detail` (`car_id`, `product_year`, `level`, `seat`, `door`, `gps`, `fuel`, `describe`) VALUES (1, '2021', 'automatic gorgeous', 4, 2, 1, '2.0T', 'The vehicle belongs to the family entry model, which is very suitable for family travel');
INSERT INTO `car_model_detail` (`car_id`, `product_year`, `level`, `seat`, `door`, `gps`, `fuel`, `describe`) VALUES (2, '2022.01', 'pure electric', 6, 4, 0, '3.8T', 'No gasoline smell, pure electric drive, enjoy quiet, unlimited power');
COMMIT;

-- ----------------------------
-- Table structure for car_order
-- ----------------------------
DROP TABLE IF EXISTS `car_order`;
CREATE TABLE `car_order` (
  `order_id` int NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `user_id` int NOT NULL COMMENT '用户ID',
  `stock_id` int NOT NULL COMMENT '库存车ID',
  `rent_price` decimal(10,2) NOT NULL COMMENT '租用费用',
  `deposit` decimal(10,2) NOT NULL COMMENT '订金费用',
  `total_price` decimal(10,2) NOT NULL COMMENT '总费用',
  `rental_from` timestamp NOT NULL COMMENT '租用开始日期',
  `rental_to` timestamp NOT NULL COMMENT '租用结束日期',
  `order_status` tinyint NOT NULL COMMENT '订单状态 0待出库 1租用中 2已完成',
  `pay_status` tinyint(1) NOT NULL COMMENT '支付状态 0未支付 1已支付',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆订单表';

-- ----------------------------
-- Records of car_order
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for car_stock
-- ----------------------------
DROP TABLE IF EXISTS `car_stock`;
CREATE TABLE `car_stock` (
  `stock_id` int NOT NULL AUTO_INCREMENT COMMENT '库存ID',
  `car_id` int NOT NULL COMMENT '车辆ID',
  `car_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车牌号',
  `color` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆颜色',
  `picture` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '车辆图片',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆库存';

-- ----------------------------
-- Records of car_stock
-- ----------------------------
BEGIN;
INSERT INTO `car_stock` (`stock_id`, `car_id`, `car_number`, `color`, `picture`, `create_time`, `update_time`) VALUES (1, 1, '粤A12345', 'red', '', '2022-02-13 23:34:06', '2022-02-13 23:34:09');
INSERT INTO `car_stock` (`stock_id`, `car_id`, `car_number`, `color`, `picture`, `create_time`, `update_time`) VALUES (2, 2, '京A88888', 'white', '', '2022-02-13 23:34:53', '2022-02-13 23:34:56');
INSERT INTO `car_stock` (`stock_id`, `car_id`, `car_number`, `color`, `picture`, `create_time`, `update_time`) VALUES (3, 1, '深B53345', 'gray', '', '2022-02-13 23:34:06', '2022-02-13 23:34:09');
INSERT INTO `car_stock` (`stock_id`, `car_id`, `car_number`, `color`, `picture`, `create_time`, `update_time`) VALUES (4, 2, '苏E63328', 'black', '', '2022-02-13 23:34:53', '2022-02-13 23:34:56');
COMMIT;

-- ----------------------------
-- Table structure for car_stock_rental
-- ----------------------------
DROP TABLE IF EXISTS `car_stock_rental`;
CREATE TABLE `car_stock_rental` (
  `stock_id` int NOT NULL COMMENT '库存ID',
  `rent_price` decimal(10,2) NOT NULL COMMENT '租用金额',
  `deposit` decimal(10,2) NOT NULL COMMENT '订金金额',
  `rental_status` int NOT NULL COMMENT '租用状态 0未租用 1已租用',
  `available_from` date NOT NULL COMMENT '可用日期',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='库存车辆租用信息';

-- ----------------------------
-- Records of car_stock_rental
-- ----------------------------
BEGIN;
INSERT INTO `car_stock_rental` (`stock_id`, `rent_price`, `deposit`, `rental_status`, `available_from`, `create_time`, `update_time`) VALUES (1, 12.34, 10.00, 0, '2022-02-13', '2022-02-13 23:39:53', '2022-02-13 23:39:55');
INSERT INTO `car_stock_rental` (`stock_id`, `rent_price`, `deposit`, `rental_status`, `available_from`, `create_time`, `update_time`) VALUES (2, 20.88, 20.00, 0, '2022-02-14', '2022-02-13 23:55:08', '2022-02-13 23:55:10');
INSERT INTO `car_stock_rental` (`stock_id`, `rent_price`, `deposit`, `rental_status`, `available_from`, `create_time`, `update_time`) VALUES (3, 25.33, 18.00, 0, '2022-02-15', '2022-02-13 23:39:53', '2022-02-13 23:39:55');
INSERT INTO `car_stock_rental` (`stock_id`, `rent_price`, `deposit`, `rental_status`, `available_from`, `create_time`, `update_time`) VALUES (4, 30.77, 25.00, 0, '2022-02-16', '2022-02-13 23:55:08', '2022-02-13 23:55:10');
COMMIT;

-- ----------------------------
-- Table structure for car_type
-- ----------------------------
DROP TABLE IF EXISTS `car_type`;
CREATE TABLE `car_type` (
  `type_id` int NOT NULL AUTO_INCREMENT COMMENT '车辆类型ID',
  `type_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '车辆类型名称',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='车辆类型';

-- ----------------------------
-- Records of car_type
-- ----------------------------
BEGIN;
INSERT INTO `car_type` (`type_id`, `type_name`) VALUES (1, 'Economical');
INSERT INTO `car_type` (`type_id`, `type_name`) VALUES (2, 'Business');
INSERT INTO `car_type` (`type_id`, `type_name`) VALUES (3, 'SUV');
INSERT INTO `car_type` (`type_id`, `type_name`) VALUES (4, 'Electric');
COMMIT;

-- ----------------------------
-- Table structure for car_user
-- ----------------------------
DROP TABLE IF EXISTS `car_user`;
CREATE TABLE `car_user` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '邮箱',
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '手机',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '头像',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='租用用户表';

-- ----------------------------
-- Records of car_user
-- ----------------------------
BEGIN;
INSERT INTO `car_user` (`user_id`, `user_name`, `email`, `phone`, `password`, `icon`, `create_time`, `update_time`) VALUES (1, 'ucucs', 'ucucs@icloud.com', '18011221234', 'EncryptPwd', '', '2022-02-14 06:37:20', '2022-02-14 06:37:23');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
