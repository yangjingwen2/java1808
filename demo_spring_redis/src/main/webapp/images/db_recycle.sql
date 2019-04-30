/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50024
Source Host           : localhost:3306
Source Database       : db_recycle

Target Server Type    : MYSQL
Target Server Version : 50024
File Encoding         : 65001

Date: 2019-04-26 17:34:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_express`
-- ----------------------------
DROP TABLE IF EXISTS `tb_express`;
CREATE TABLE `tb_express` (
  `exp_id` int(11) NOT NULL auto_increment,
  `exp_name` varchar(60) default NULL,
  `exp_num` varchar(60) default NULL,
  `exp_order_num` varchar(60) default NULL,
  PRIMARY KEY  (`exp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_express
-- ----------------------------
INSERT INTO `tb_express` VALUES ('1', '', '123123', '15562412090704');
INSERT INTO `tb_express` VALUES ('2', '', '12313123', '15562581418235');
INSERT INTO `tb_express` VALUES ('3', '', '', '15562606724703');
INSERT INTO `tb_express` VALUES ('4', '', '12313123', '15562616475591');
INSERT INTO `tb_express` VALUES ('5', '', '12313123', '15562671870302');
INSERT INTO `tb_express` VALUES ('6', '', '12313123', '15562678735699');
INSERT INTO `tb_express` VALUES ('7', '', '12313123', '15562692505376');
INSERT INTO `tb_express` VALUES ('8', '', '12313123', '15562711764943');

-- ----------------------------
-- Table structure for `tb_merchant`
-- ----------------------------
DROP TABLE IF EXISTS `tb_merchant`;
CREATE TABLE `tb_merchant` (
  `mer_id` int(11) NOT NULL,
  `id` int(11) default NULL,
  `mer_money` int(11) default NULL,
  PRIMARY KEY  (`mer_id`),
  KEY `FK_Relationship_7` (`id`),
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`id`) REFERENCES `tb_shopping` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_merchant
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `order_id` int(11) NOT NULL auto_increment,
  `user_id` int(11) default NULL,
  `order_phone` varchar(60) default NULL,
  `order_num` varchar(50) default NULL,
  `order_price` int(11) default NULL,
  `pay_id` int(11) default NULL,
  `link_name` varchar(20) default NULL,
  `mobile` varchar(20) default NULL,
  `province` varchar(20) default NULL,
  `city` varchar(20) default NULL,
  `district` varchar(100) default NULL,
  `school_id` varchar(100) default NULL,
  `address` varchar(255) default NULL,
  `stime` varchar(60) default NULL,
  `etime` varchar(60) default NULL,
  `express_true` varchar(100) default NULL,
  `member_bank` varchar(100) default NULL,
  `bankname` varchar(20) default NULL,
  `realname` varchar(100) default NULL,
  `card_sn` varchar(100) default NULL,
  `loco` varchar(100) default NULL,
  `pwd` varchar(100) default NULL,
  `alipay_realname` varchar(100) default NULL,
  `alipay_username` varchar(100) default NULL,
  `mianjiaoMethod_2` varchar(100) default NULL,
  `ditie_xian` varchar(100) default NULL,
  `ditie_zhan` varchar(100) default NULL,
  `shop_id` int(11) default NULL,
  PRIMARY KEY  (`order_id`),
  KEY `FK_Relationship_4` (`user_id`),
  CONSTRAINT `FK_Relationship_4` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `tb_order` VALUES ('2', '12', null, '15561916625178', '0', '0', '123', '123', '', '', '', '', '123', '', '', '', '', '', '123', '123', '', '', '123', '123', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('3', '12', null, '15561921923563', '0', '0', '', '', '', '', '', '', '', '', '', '', '', '', 'hahah', '123', '', '', '123', '123', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('4', '12', null, '15561925661613', '0', '0', '12', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('5', '12', null, '15561927488281', '0', '0', '12', '12', '', '', '', '', '12', '', '', '', '', '', '12', '12', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('6', '12', null, '15561928648393', '13510', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('7', '12', null, '15562396973425', '13510', '0', '123', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('8', '12', null, '15562403922523', '0', '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0');
INSERT INTO `tb_order` VALUES ('9', '12', null, '15562412090704', '13510', '0', '123', '', '', '', '', '', '', '', '', '', '', '', '123', '', '', '', '', '123', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('10', '12', null, '15562421937839', '13510', '0', '123', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('11', '12', null, '15562581418235', '3430', '0', '123', '123', '', '', '', '', '北苑', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('12', '12', null, '15562606724703', '3850', '0', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('13', '12', null, '15562616475591', '6860', '0', '123', '123', '', '', '', '', '北苑', '', '', '', '', '', '', '', '', '', '123', '123', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('14', '12', null, '15562671870302', '6580', '0', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('15', '12', null, '15562678735699', '3430', '0', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('16', '12', null, '15562692505376', '3500', '0', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');
INSERT INTO `tb_order` VALUES ('17', '12', null, '15562711764943', '7280', '0', '123', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0');

-- ----------------------------
-- Table structure for `tb_pay_type`
-- ----------------------------
DROP TABLE IF EXISTS `tb_pay_type`;
CREATE TABLE `tb_pay_type` (
  `pay_id` int(11) NOT NULL auto_increment,
  `pay_name` varchar(20) default NULL,
  PRIMARY KEY  (`pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_pay_type
-- ----------------------------
INSERT INTO `tb_pay_type` VALUES ('1', '银行卡');
INSERT INTO `tb_pay_type` VALUES ('2', '支付宝');
INSERT INTO `tb_pay_type` VALUES ('3', '微信');

-- ----------------------------
-- Table structure for `tb_phone`
-- ----------------------------
DROP TABLE IF EXISTS `tb_phone`;
CREATE TABLE `tb_phone` (
  `phone_id` int(11) NOT NULL auto_increment,
  `phone_name` varchar(20) default NULL,
  `phone_parent` int(11) default NULL,
  `phone_price` int(11) default NULL,
  `phone_pic` varchar(254) default NULL,
  `phone_md5_pic` varchar(40) default NULL,
  PRIMARY KEY  (`phone_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_phone
-- ----------------------------
INSERT INTO `tb_phone` VALUES ('1', 'iPhone', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('2', '魅族', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('3', '诺基亚', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('4', 'LG', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('5', '三星', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('6', '华为', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('7', '小米', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('8', 'HTC', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('9', '联想', '0', null, null, null);
INSERT INTO `tb_phone` VALUES ('10', 'iphone 7', '1', '7000', 'iphone7.jpg', null);
INSERT INTO `tb_phone` VALUES ('11', 'iPhone 7 plus', '1', '7500', 'iphone7_plus.jpg', null);
INSERT INTO `tb_phone` VALUES ('12', '小米手机5', '7', '2000', 'xiaomi5.jpg', null);
INSERT INTO `tb_phone` VALUES ('13', 'MIX4s', '7', '1800', 'xiaomi4s.jpg', null);

-- ----------------------------
-- Table structure for `tb_shopping`
-- ----------------------------
DROP TABLE IF EXISTS `tb_shopping`;
CREATE TABLE `tb_shopping` (
  `id` int(11) NOT NULL auto_increment,
  `shop_phone_pic` varchar(100) default NULL,
  `shop_wreck_type` varchar(255) default NULL,
  `shop_wreck_price` int(11) default NULL,
  `shop_phone_id` int(11) default NULL,
  `shop_user_id` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_shopping
-- ----------------------------
INSERT INTO `tb_shopping` VALUES ('1', '7000', '水货有锁外国发行机型，需用卡贴解锁后正常通话,保修一个月以内或过保,其他型号,256G,金色,开机不正常开机不正常出现死机/重启/不开机,指纹功能不正常,蓝牙/wifi功能不正常蓝牙/wifi出现信号弱/不稳定/无法连接,6-7新机身有磕碰/破裂/掉漆及屏幕与机身分离的情况,触摸失灵局部失灵或整屏失灵,显示屏损坏屏幕显示不全/不显示,主板维修机身/主板进行拆卸维修,包装盒,', '59', '10', '1');
INSERT INTO `tb_shopping` VALUES ('2', '7000', '水货有锁外国发行机型，需用卡贴解锁后正常通话,保修一个月以内或过保,其他型号,256G,金色,开机不正常开机不正常出现死机/重启/不开机,指纹功能不正常,蓝牙/wifi功能不正常蓝牙/wifi出现信号弱/不稳定/无法连接,6-7新机身有磕碰/破裂/掉漆及屏幕与机身分离的情况,触摸失灵局部失灵或整屏失灵,显示屏损坏屏幕显示不全/不显示,主板维修机身/主板进行拆卸维修,包装盒,', '59', '10', '2');
INSERT INTO `tb_shopping` VALUES ('3', '7000', '水货有锁外国发行机型，需用卡贴解锁后正常通话,保修一个月以内或过保,其他型号,256G,金色,开机不正常开机不正常出现死机/重启/不开机,指纹功能不正常,蓝牙/wifi功能不正常蓝牙/wifi出现信号弱/不稳定/无法连接,6-7新机身有磕碰/破裂/掉漆及屏幕与机身分离的情况,触摸失灵局部失灵或整屏失灵,显示屏损坏屏幕显示不全/不显示,主板维修机身/主板进行拆卸维修,包装盒,', '59', '10', '1');
INSERT INTO `tb_shopping` VALUES ('4', '7000', '水货有锁外国发行机型，需用卡贴解锁后正常通话,保修一个月以内或过保,其他型号,256G,金色,开机不正常开机不正常出现死机/重启/不开机,指纹功能不正常,蓝牙/wifi功能不正常蓝牙/wifi出现信号弱/不稳定/无法连接,6-7新机身有磕碰/破裂/掉漆及屏幕与机身分离的情况,触摸失灵局部失灵或整屏失灵,显示屏损坏屏幕显示不全/不显示,主板维修机身/主板进行拆卸维修,包装盒,', '59', '10', null);
INSERT INTO `tb_shopping` VALUES ('5', '7000', '香港行货,保修一个月以内或过保,其他型号,128G,金色,开机不正常,手机进水或受潮,指纹功能不正常,8-9新,触摸失灵,显示屏损坏,主板维修,耳机,', '54', '10', null);
INSERT INTO `tb_shopping` VALUES ('6', '7000', '水货无锁,保修一个月以内或过保,其他型号,256G,金色,开机不正常,指纹功能不正常,蓝牙/wifi功能不正常,6-7新,触摸失灵,显示屏损坏,主板维修,包装盒,', '0', '10', null);
INSERT INTO `tb_shopping` VALUES ('7', '7000', '水货无锁,保修一个月以内或过保,其他型号,256G,金色,开机不正常,手机进水或受潮,指纹功能不正常,8-9新,碎角及破裂,显示异常,屏幕维修,耳机,', '0', '10', null);

-- ----------------------------
-- Table structure for `tb_type`
-- ----------------------------
DROP TABLE IF EXISTS `tb_type`;
CREATE TABLE `tb_type` (
  `type_id` int(11) NOT NULL auto_increment,
  `type_name` varchar(20) default NULL,
  `type_particulars` varchar(254) default NULL,
  `type_types` int(11) default NULL,
  `type_parent` int(11) default NULL,
  PRIMARY KEY  (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_type
-- ----------------------------
INSERT INTO `tb_type` VALUES ('1', '版本', null, '1', '0');
INSERT INTO `tb_type` VALUES ('2', '保修期', null, '1', '0');
INSERT INTO `tb_type` VALUES ('3', '型号', null, '1', '0');
INSERT INTO `tb_type` VALUES ('4', '机身内存', null, '1', '0');
INSERT INTO `tb_type` VALUES ('5', '颜色', null, '1', '0');
INSERT INTO `tb_type` VALUES ('6', '开机情况', null, '1', '0');
INSERT INTO `tb_type` VALUES ('7', '功能情况', '', '2', '0');
INSERT INTO `tb_type` VALUES ('8', '外观情况', null, '3', '0');
INSERT INTO `tb_type` VALUES ('9', '触摸屏情况', null, '3', '0');
INSERT INTO `tb_type` VALUES ('10', '显示屏情况', null, '3', '0');
INSERT INTO `tb_type` VALUES ('11', '维修情况', null, '3', '0');
INSERT INTO `tb_type` VALUES ('12', '配件', null, '3', '0');
INSERT INTO `tb_type` VALUES ('13', '大陆行货', '内地购买，有“进网许可证”标签', '1', '1');
INSERT INTO `tb_type` VALUES ('14', '香港行货', '香港购买，全球联保', '1', '1');
INSERT INTO `tb_type` VALUES ('15', '水货无锁', '非大陆行港行，其他地区', '1', '1');
INSERT INTO `tb_type` VALUES ('16', '水货有锁', '外国发行机型，需用卡贴解锁后正常通话', '1', '1');
INSERT INTO `tb_type` VALUES ('17', '保修一个月以上', null, '1', '2');
INSERT INTO `tb_type` VALUES ('18', '保修一个月以内或过保', null, '1', '2');
INSERT INTO `tb_type` VALUES ('19', 'A1780', '', '1', '3');
INSERT INTO `tb_type` VALUES ('20', 'A1660', null, '1', '3');
INSERT INTO `tb_type` VALUES ('21', '其他型号', null, '1', '3');
INSERT INTO `tb_type` VALUES ('22', '32G', null, '1', '4');
INSERT INTO `tb_type` VALUES ('23', '128G', null, '1', '4');
INSERT INTO `tb_type` VALUES ('24', '256G', null, '1', '4');
INSERT INTO `tb_type` VALUES ('25', '红色', null, '1', '5');
INSERT INTO `tb_type` VALUES ('26', '粉色', null, '1', '5');
INSERT INTO `tb_type` VALUES ('27', '金色', null, '1', '5');
INSERT INTO `tb_type` VALUES ('28', '白色', null, '1', '5');
INSERT INTO `tb_type` VALUES ('29', '黑色', null, '1', '5');
INSERT INTO `tb_type` VALUES ('30', '亮黑', null, '1', '5');
INSERT INTO `tb_type` VALUES ('31', '开机正常', '开机正常，无死机重启现象', '1', '6');
INSERT INTO `tb_type` VALUES ('32', '开机不正常', '开机不正常出现死机/重启/不开机', '1', '6');
INSERT INTO `tb_type` VALUES ('33', '有换机', '系统型号N开头（针对在保机器，两次以上按保修在保）', '2', '7');
INSERT INTO `tb_type` VALUES ('34', '手机进水或受潮', '机身防水标发红/机身受潮/机板发霉', '2', '7');
INSERT INTO `tb_type` VALUES ('35', '按键接口及卡槽不正常', null, '2', '7');
INSERT INTO `tb_type` VALUES ('36', '指纹功能不正常', null, '2', '7');
INSERT INTO `tb_type` VALUES ('37', '蓝牙/wifi功能不正常', '蓝牙/wifi出现信号弱/不稳定/无法连接', '2', '7');
INSERT INTO `tb_type` VALUES ('38', '照相及感光功能不正常', null, '2', '7');
INSERT INTO `tb_type` VALUES ('39', '通话功能不正常', '信号时有时无/无信号/通话无声/杂音', '2', '7');
INSERT INTO `tb_type` VALUES ('40', 'iCloud账号不能解除', null, '2', '7');
INSERT INTO `tb_type` VALUES ('41', '机身有变形', null, '2', '7');
INSERT INTO `tb_type` VALUES ('42', '全新机', '原封未拆/未使用（需提供身份证及购机发票，无法提供按95新算）', '3', '8');
INSERT INTO `tb_type` VALUES ('43', '98新', '外观完好无磕碰/掉漆/划痕', '3', '8');
INSERT INTO `tb_type` VALUES ('44', '8-9新', '机身有明显划痕', '3', '8');
INSERT INTO `tb_type` VALUES ('45', '6-7新', '机身有磕碰/破裂/掉漆及屏幕与机身分离的情况', '3', '8');
INSERT INTO `tb_type` VALUES ('46', '完好无破损', '触摸屏完好，无破损失灵现象', '3', '9');
INSERT INTO `tb_type` VALUES ('47', '屏幕划痕/爆胶', null, '3', '9');
INSERT INTO `tb_type` VALUES ('48', '碎角及破裂', '触摸屏出现碎角/破裂', '3', '9');
INSERT INTO `tb_type` VALUES ('49', '触摸失灵', '局部失灵或整屏失灵', '3', '9');
INSERT INTO `tb_type` VALUES ('50', '显示屏完好', null, '3', '10');
INSERT INTO `tb_type` VALUES ('51', '显示有瑕疵', '显示屏在纯色（如白色/蓝色）背景下有色差，亮度不够', '3', '10');
INSERT INTO `tb_type` VALUES ('52', '显示异常', '显示屏出现花屏/错乱/漏液/断线/严重发黄压伤/模糊等', '3', '10');
INSERT INTO `tb_type` VALUES ('53', '显示屏损坏', '屏幕显示不全/不显示', '3', '10');
INSERT INTO `tb_type` VALUES ('54', '无拆修', '手机完好了无拆修', '3', '11');
INSERT INTO `tb_type` VALUES ('55', '有拆无修', '', '3', '11');
INSERT INTO `tb_type` VALUES ('56', '屏幕维修', '更换过手机屏幕', '3', '11');
INSERT INTO `tb_type` VALUES ('57', '主板维修', '机身/主板进行拆卸维修', '3', '11');
INSERT INTO `tb_type` VALUES ('58', '充电器', null, '3', '12');
INSERT INTO `tb_type` VALUES ('59', '数据线', null, '3', '12');
INSERT INTO `tb_type` VALUES ('60', '耳机', null, '3', '12');
INSERT INTO `tb_type` VALUES ('61', '包装盒', null, '3', '12');
INSERT INTO `tb_type` VALUES ('62', '保修卡', null, '3', '12');

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(31) default NULL,
  `user_phone` varchar(20) default NULL,
  `user_password` varchar(50) default NULL,
  `user_add` varchar(254) default NULL,
  `user_add1` varchar(254) default NULL,
  `user_add2` varchar(254) default NULL,
  `user_bank` varchar(60) default NULL,
  `user_wx` varchar(60) default NULL,
  `user_freez` int(11) default NULL,
  `user_money` int(11) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', '卡卡西', '12345678912', '3f46cf0b8e4aecdecf617fd86a2d89d3', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('2', null, 'z123456', '7e9fbb70588c9e96a68ced70c3f28111', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('3', null, 'z1234566', '0dfe9dedd79563579a85041d94b1d9fd', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('4', null, 'z1234567', 'fe8dda410bb09643f90920ad93347158', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('5', null, null, '24d794dfc756320ffadb905d526299bc', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('6', null, null, '24d794dfc756320ffadb905d526299bc', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('7', null, 'z1234568', 'd701e27cdcb5c32bf9b393c3e9a34ca2', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('8', null, null, '24d794dfc756320ffadb905d526299bc', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('9', null, null, '24d794dfc756320ffadb905d526299bc', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('10', null, 'z1234569', 'b932a56d3aaaf9517a9b94eedd6c7d3e', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('11', null, 'z1234577', 'bb9e7d16c5db51eb7d58d98b705361ca', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('12', null, 'z12345678', 'a8a06831c02f72c7e7b0746398b3bd84', null, null, null, null, null, '10', '20');
INSERT INTO `tb_user` VALUES ('13', null, 'z12345699', '2daa791e343573441de98dbc7e997ec3', null, null, null, null, null, null, null);
INSERT INTO `tb_user` VALUES ('14', null, 'z123456999', 'f25677e17c9db63d69701524f2abda4e', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `tb_wreck`
-- ----------------------------
DROP TABLE IF EXISTS `tb_wreck`;
CREATE TABLE `tb_wreck` (
  `wreck_id` int(11) NOT NULL auto_increment,
  `type_id` int(11) default NULL,
  `phone_id` int(11) default NULL,
  `wreck_money` int(11) default NULL,
  PRIMARY KEY  (`wreck_id`),
  KEY `FK_Relationship_2` (`type_id`),
  KEY `FK_Relationship_3` (`phone_id`),
  CONSTRAINT `FK_Relationship_2` FOREIGN KEY (`type_id`) REFERENCES `tb_type` (`type_id`),
  CONSTRAINT `FK_Relationship_3` FOREIGN KEY (`phone_id`) REFERENCES `tb_phone` (`phone_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_wreck
-- ----------------------------
INSERT INTO `tb_wreck` VALUES ('1', '13', '10', '2');
INSERT INTO `tb_wreck` VALUES ('2', '14', '10', '3');
INSERT INTO `tb_wreck` VALUES ('3', '15', '10', '4');
INSERT INTO `tb_wreck` VALUES ('4', '16', '10', '5');
INSERT INTO `tb_wreck` VALUES ('5', '17', '10', '2');
INSERT INTO `tb_wreck` VALUES ('6', '18', '10', '3');
INSERT INTO `tb_wreck` VALUES ('7', '19', '10', '4');
INSERT INTO `tb_wreck` VALUES ('8', '20', '10', '5');
INSERT INTO `tb_wreck` VALUES ('9', '21', '10', '6');
INSERT INTO `tb_wreck` VALUES ('10', '22', '10', '7');
INSERT INTO `tb_wreck` VALUES ('11', '23', '10', '2');
INSERT INTO `tb_wreck` VALUES ('12', '24', '10', '3');
INSERT INTO `tb_wreck` VALUES ('13', '25', '10', '4');
INSERT INTO `tb_wreck` VALUES ('14', '26', '10', '5');
INSERT INTO `tb_wreck` VALUES ('15', '27', '10', '6');
INSERT INTO `tb_wreck` VALUES ('16', '28', '10', '2');
INSERT INTO `tb_wreck` VALUES ('17', '29', '10', '3');
INSERT INTO `tb_wreck` VALUES ('18', '30', '10', '4');
INSERT INTO `tb_wreck` VALUES ('19', '31', '10', '5');
INSERT INTO `tb_wreck` VALUES ('20', '32', '10', '4');
INSERT INTO `tb_wreck` VALUES ('21', '33', '10', '2');
INSERT INTO `tb_wreck` VALUES ('22', '34', '10', '4');
INSERT INTO `tb_wreck` VALUES ('23', '25', '10', '2');
INSERT INTO `tb_wreck` VALUES ('24', '36', '10', '3');
INSERT INTO `tb_wreck` VALUES ('25', '37', '10', '4');
INSERT INTO `tb_wreck` VALUES ('26', '38', '10', '3');
INSERT INTO `tb_wreck` VALUES ('27', '39', '10', '5');
INSERT INTO `tb_wreck` VALUES ('28', '40', '10', '4');
INSERT INTO `tb_wreck` VALUES ('29', '41', '10', '1');
INSERT INTO `tb_wreck` VALUES ('30', '42', '10', '2');
INSERT INTO `tb_wreck` VALUES ('31', '43', '10', '3');
INSERT INTO `tb_wreck` VALUES ('32', '44', '10', '4');
INSERT INTO `tb_wreck` VALUES ('33', '45', '10', '5');
INSERT INTO `tb_wreck` VALUES ('34', '46', '10', '1');
INSERT INTO `tb_wreck` VALUES ('35', '47', '10', '2');
INSERT INTO `tb_wreck` VALUES ('36', '48', '10', '3');
INSERT INTO `tb_wreck` VALUES ('37', '49', '10', '4');
INSERT INTO `tb_wreck` VALUES ('38', '50', '10', '3');
INSERT INTO `tb_wreck` VALUES ('39', '51', '10', '4');
INSERT INTO `tb_wreck` VALUES ('40', '52', '10', '3');
INSERT INTO `tb_wreck` VALUES ('41', '53', '10', '6');
INSERT INTO `tb_wreck` VALUES ('42', '54', '10', '3');
INSERT INTO `tb_wreck` VALUES ('43', '55', '10', '4');
INSERT INTO `tb_wreck` VALUES ('44', '56', '10', '2');
INSERT INTO `tb_wreck` VALUES ('45', '57', '10', '6');
INSERT INTO `tb_wreck` VALUES ('46', '58', '10', '3');
INSERT INTO `tb_wreck` VALUES ('47', '59', '10', '4');
INSERT INTO `tb_wreck` VALUES ('48', '60', '10', '3');
INSERT INTO `tb_wreck` VALUES ('49', '61', '10', '4');
INSERT INTO `tb_wreck` VALUES ('50', '62', '10', '3');
