package com.zhp.entity;

import java.util.Date;

public class Backend_user {  //后台用户
/*	CREATE TABLE `backend_user` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	  `userCode` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户编码',
	  `userName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
	  `userType` BIGINT(30) DEFAULT NULL COMMENT '用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于backend_user用户表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于backend_user用户表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  `userPassword` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
	  PRIMARY KEY (`id`)
	) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/
	
	private Integer id;           //主键id
	private String userCode;  	  //用户编码
	private String userName;  	  //用户名称
	private Integer userType;     //用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
	private Integer createdBy;    //创建者（来源于backend_user用户表的用户id）
	private Date creationDate;    //创建时间
	private Integer modifyBy; 	  //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;  	  //最新更新时间
	private String userPassword;  //用户密码	
	
}