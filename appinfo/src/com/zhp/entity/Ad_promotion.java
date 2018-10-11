package com.zhp.entity;

import java.util.Date;

public class Ad_promotion {
/*	CREATE TABLE `ad_promotion` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	  `appId` BIGINT(30) DEFAULT NULL COMMENT 'appId（来源于：app_info表的主键id）',
	  `adPicPath` VARCHAR(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '广告图片存储路径',
	  `adPV` BIGINT(50) DEFAULT NULL COMMENT '广告点击量',
	  `carouselPosition` INT(30) DEFAULT NULL COMMENT '轮播位（1-n）',
	  `startTime` DATETIME DEFAULT NULL COMMENT '起效时间',
	  `endTime` DATETIME DEFAULT NULL COMMENT '失效时间',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于backend_user用户表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于backend_user用户表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  PRIMARY KEY (`id`)
	) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/
	
	private Integer id;  //主键id
	private Integer appId;  //appId（来源于：app_info表的主键id）
	private String adPicPath;  //广告图片存储路径
	private Integer adPV;  //广告点击量
	private Integer carouselPosition;  //轮播位（1-n）
	private Date startTime;  //起效时间
	private Date endTime;  //失效时间
	private Integer createdBy;  //创建者（来源于backend_user用户表的用户id）
	private Date creationDate;  //创建时间
	private Integer modifyBy;  //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;  //最新更新时间

}
