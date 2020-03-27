CREATE DATABASE wells;

create table tb_news (
    id bigint primary key not null auto_increment,
    user_id int not null comment '用户',
    title varchar(100) not null default '' comment '标题',
    click int default 0 comment '点击数',
    content text comment '正文',
    status tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '有效状态',
    ctime timestamp NULL DEFAULT current_timestamp COMMENT '创建时间',
    mtime timestamp NULL DEFAULT current_timestamp ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table tb_comment (
    id bigint primary key not null auto_increment,
    news_id bigint not null comment '新闻ID',
    user_id int not null comment '用户',
    content text comment '评论正文',
    status tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '有效状态',
    ctime timestamp NULL DEFAULT current_timestamp COMMENT '创建时间',
    mtime timestamp NULL DEFAULT current_timestamp ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT ' 自增ID',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `age` int(11) DEFAULT '12' COMMENT '年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '有效状态',
  `ctime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;