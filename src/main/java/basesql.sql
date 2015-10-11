CREATE DATABASE IF NOT EXISTS db_blog CHARACTER SET UTF8;
USE db_blog;

#用户信息表
CREATE TABLE IF NOT EXISTS t_user(
user_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
user_name VARCHAR(30) NOT NULL UNIQUE COMMENT '用户名',
password VARCHAR(30) NOT NULL DEFAULT '' COMMENT '密码',
user_email VARCHAR(30) NOT NULL UNIQUE COMMENT '用户邮箱',
user_sex VARCHAR(30) NOT NULL COMMENT '用户性别',
create_time DATETIME NOT NULL COMMENT '用户创建时间',
user_type INT(2) NOT NULL DEFAULT '0' COMMENT '用户类型 0:普通用户 1:管理员',
user_state INT(2) NOT NULL DEFAULT '0' COMMENT '用户状态 0:正常 1:冻结',
credit INT(10) NOT NULL DEFAULT '100' COMMENT '用户积分',
last_logintime DATETIME DEFAULT NULL COMMENT '用户最后登入时间',
last_ip VARCHAR(20) DEFAULT NULL COMMENT '用户最后登入ip',
PRIMARY KEY (`user_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

#论坛板块表
CREATE TABLE IF NOT EXISTS t_board(
board_id int(10) NOT NULL AUTO_INCREMENT COMMENT '论坛板块id',
board_name VARCHAR(150) NOT NULL DEFAULT '' COMMENT '论坛板块名称',
board_desc VARCHAR(300) NOT NULL DEFAULT '' COMMENT '论坛板块描述',
board_num INT(10) NOT NULL DEFAULT '0' COMMENT '帖子数目',
PRIMARY KEY  (`board_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

#登录日志表
CREATE TABLE IF NOT EXISTS t_login_log(
login_log_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
user_name VARCHAR(30) NOT NULL UNIQUE COMMENT '用户名',
login_ip VARCHAR(30) NOT NULL DEFAULT '' COMMENT '登录IP',
login_datetime DATETIME NOT NULL COMMENT '登录时间',
PRIMARY KEY (`login_log_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- ALTER TABLE t_user add CONSTRAINT `FK_login_log_user_id` FOREIGN KEY (`user_name`) REFERENCES `t_login_log`(`user_name`);

-- #用户管理板块关联表
-- CREATE TABLE IF NOT EXISTS t_board_manager(
-- board_id INT(10) NOT NULL,
-- user_id INT(10) NOT NULL,
-- KEY `FK_user_board_user_id` (`user_id`),
-- KEY `FK_user_board_board_id` (`board_id`),
-- CONSTRAINT `FK_user_board_board_id` FOREIGN KEY (`board_id`) REFERENCES `t_board`(`board_id`),
-- CONSTRAINT `FK_user_board_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user`(`user_id`)
-- )ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;



#帖子表
CREATE TABLE IF NOT EXISTS t_post(
post_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
board_id INT(10) NOT NULL default '0' COMMENT '论坛板块ID',
topic_id INT(10) NOT NULL default '0' COMMENT '话题ID',
user_id INT(10) NOT NULL default '0' COMMENT '发表者ID',
post_type INT(2) NOT NULL default '2' COMMENT '帖子类型:1.主帖子 2:回复帖子',
post_title VARCHAR(50) NOT NULL COMMENT '帖子名称',
post_text  TEXT NOT NULL COMMENT '帖子内容',
create_time DATETIME NOT NULL COMMENT '创建时间',
PRIMARY KEY  (`post_id`),
) ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

#话题表
CREATE TABLE IF NOT EXISTS t_topic(
topic_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '话题ID',
board_id INT(10) NOT NULL COMMENT '板块ID',
topic_title VARCHAR(100) NOT NULL DEFAULT '' COMMENT '话题名称',
user_id INT(10) NOT NULL DEFAULT '0' COMMENT '发表用户ID',
create_time DATETIME NOT NULL COMMENT '话题创建时间',
last_post DATETIME NOT NULL COMMENT '最后回复时间',
topic_views INT(10) NOT NULL DEFAULT '1' COMMENT '帖子查看次数',
topic_replies INT(10) NOT NULL DEFAULT '0' COMMENT '帖子回复数',
digest INT(10) NOT NULL DEFAULT '0' COMMENT '是否是精华帖子',
PRIMARY KEY  (`topic_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;



