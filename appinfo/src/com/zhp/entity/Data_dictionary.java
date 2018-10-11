package com.zhp.entity;

import java.util.Date;

public class Data_dictionary {
/*	CREATE TABLE `data_dictionary` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
	  `typeCode` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型编码',
	  `typeName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型名称',
	  `valueId` BIGINT(30) DEFAULT NULL COMMENT '类型值ID',
	  `valueName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类型值Name',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于backend_user用户表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于backend_user用户表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  PRIMARY KEY (`id`)
	) ENGINE=MYISAM AUTO_INCREMENT=110 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/
	
	private Integer id;  //主键ID
	private String typeCode;  // 类型编码
	private String typeName;  //类型名称
	private Integer valueId;  //类型值ID
	private String valueName;  //类型值Name
	private Integer createdBy;  //创建者（来源于backend_user用户表的用户id）
	private Date creationDate;  //创建时间
	private Integer modifyBy;  //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;  //最新更新时间

}
