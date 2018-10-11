package com.zhp.entity;

import java.util.Date;

public class App_info {
/*	CREATE TABLE `app_info` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	  `softwareName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '软件名称',
	  `APKName` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'APK名称（唯一）',
	  `supportROM` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '支持ROM',
	  `interfaceLanguage` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '界面语言',
	  `softwareSize` DECIMAL(20,2) DEFAULT NULL COMMENT '软件大小（单位：M）',
	  `updateDate` DATE DEFAULT NULL COMMENT '更新日期',
	  `devId` BIGINT(30) DEFAULT NULL COMMENT '开发者id（来源于：dev_user表的开发者id）',
	  `appInfo` VARCHAR(5000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '应用简介',
	  `status` BIGINT(30) DEFAULT NULL COMMENT '状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）',
	  `onSaleDate` DATETIME DEFAULT NULL COMMENT '上架时间',
	  `offSaleDate` DATETIME DEFAULT NULL COMMENT '下架时间',
	  `flatformId` BIGINT(30) DEFAULT NULL COMMENT '所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）',
	  `categoryLevel3` BIGINT(30) DEFAULT NULL COMMENT '所属三级分类（来源于：data_dictionary）',
	  `downloads` BIGINT(30) DEFAULT NULL COMMENT '下载量（单位：次）',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于dev_user开发者信息表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于dev_user开发者信息表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  `categoryLevel1` BIGINT(30) DEFAULT NULL COMMENT '所属一级分类（来源于：data_dictionary）',
	  `categoryLevel2` BIGINT(30) DEFAULT NULL COMMENT '所属二级分类（来源于：data_dictionary）',
	  `logoPicPath` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'LOGO图片url路径',
	  `logoLocPath` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'LOGO图片的服务器存储路径',
	  `versionId` BIGINT(30) DEFAULT NULL COMMENT '最新的版本id',
	  PRIMARY KEY (`id`)
	) ENGINE=INNODB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/

	private Integer id;  				//主键id
	private String softwareName;  		//软件名称
	private String APKName;  			//APK名称（唯一）
	private String supportROM;  		//支持ROM
	private String interfaceLanguage;   //界面语言
	private Double softwareSize;  		//软件大小（单位：M）
	private Date updateDate;  			//跟新日期
	private Integer devId;  			//开发者id（来源于：dev_user表的开发者id）
	private String appInfo;  			//应用简介
	private Integer status;  			//状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
	private Date onSaleDate;  			//上架时间
	private Date offSaleDate;  			//下架时间
	private Integer flatformId;  		//所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
	private Integer categoryLevel3;  	//所属三级分类（来源于：data_dictionary）
	private Integer downloads;  		//下载量（单位：次）
	private Integer createdBy;  		//创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate;  		//创建时间
	private Integer modifyBy;  			//更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;  			//最新更新时间
	private Integer categoryLevel1;  	//所属一级分类（来源于：data_dictionary）
	private Integer categoryLevel2;  	//所属二级分类（来源于：data_dictionary）
	private String logoPicPath;  		//LOGO图片url路径
	private String logoLocPath;  		//LOGO图片的服务器存储路径
	private Integer versionId;  		//最新的版本id
	
}
