package com.zhp.entity;

import java.util.Date;

public class Dev_user {
/*	CREATE TABLE `dev_user` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	  `devCode` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开发者帐号',
	  `devName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开发者名称',
	  `devPassword` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开发者密码',
	  `devEmail` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开发者电子邮箱',
	  `devInfo` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '开发者简介',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于backend_user用户表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于backend_user用户表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  PRIMARY KEY (`id`)
	) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/
	
	private Integer id;          //主键id
	private String devCode;      //开发者帐号
	private String devName;      //开发者名称
	private String devPassword;  //开发者密码
	private String devEmail;     //开发者电子邮箱
	private String devInfo;  	 //开发者简介
	private Integer createdBy;   //创建者（来源于backend_user用户表的用户id）
	private Date creationDate;   //创建时间
	private Integer modifyBy;    //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;     //最新更新时间

	private Backend_user backend_user;
}
