package com.zhp.entity;

import java.util.Date;

public class App_category {
/*	CREATE TABLE `app_category` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	  `categoryCode` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分类编码',
	  `categoryName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分类名称',
	  `parentId` BIGINT(30) DEFAULT NULL COMMENT '父级节点id',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于backend_user用户表的用户id）',
	  `creationTime` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于backend_user用户表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  PRIMARY KEY (`id`)
	) ENGINE=MYISAM AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/
	
	private Integer id;           //主键ID
	private String categoryCode;  //分类编码
	private String categoryName;  //分类名称
	private Integer parentId;  	  //父级节点id
	private Integer createdBy;    //创建者（来源于backend_user用户表的用户id）
	private Date creationTime;    //创建时间
	private Integer modifyBy;  	  //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;  	  //最新更新时间
	
	
}
