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
board_postnum INT(10) NOT NULL DEFAULT '0' COMMENT '帖子数目',
PRIMARY KEY  (`board_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

#登录日志表
CREATE TABLE IF NOT EXISTS t_login_log(
login_log_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
user_name VARCHAR(30) NOT NULL  COMMENT '用户名',
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
post_boardid INT(10) NOT NULL default '0' COMMENT '论坛板块ID',
post_username INT(10) NOT NULL default '0' COMMENT '发表者名称',
post_title VARCHAR(50) NOT NULL COMMENT '帖子名称',
post_text  TEXT NOT NULL COMMENT '帖子内容',
post_goodcount INT(10) NOT NULL DEFAULT '0' COMMENT '点赞',
post_badcount INT(10) NOT NULL DEFAULT  '0' COMMENT '踩数',
post_viewcount INT(10) NOT NULL DEFAULT '0' COMMENT '游览次数',
post_replycount INT(10) NOT NULL DEFAULT '0' COMMENT '回帖数目',
post_status INT(2) NOT NULL default '0' COMMENT '帖子状态:0:正常 1:锁定',
post_createtime DATETIME NOT NULL COMMENT '创建时间',
post_updatetime DATETIME  COMMENT '更新时间',
PRIMARY KEY  (`post_id`)
) ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;


#回复表
CREATE TABLE IF NOT EXISTS t_reply(
reply_id INT(10) NOT NULL AUTO_INCREMENT COMMENT '回复ID',
reply_postid INT(10) NOT NULL COMMENT '所回复帖子的ID',
reply_username VARCHAR(30) NOT NULL COMMENT '回帖者姓名',
reply_content TEXT NOT NULL DEFAULT '' COMMENT '回复内容',
reply_goodcount INT(10) NOT NULL DEFAULT '0' COMMENT '点赞',
reply_badcount INT(10) NOT NULL DEFAULT  '0' COMMENT '踩数',
reply_createtime DATETIME NOT NULL COMMENT '回复时间',
PRIMARY KEY  (`reply_id`)
)ENGINE=InnoDB  DEFAULT CHARSET utf8 COLLATE utf8_general_ci;


