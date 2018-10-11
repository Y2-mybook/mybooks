package com.zhp.entity;

import java.util.Date;

public class App_version {
/*	CREATE TABLE `app_version` (
	  `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	  `appId` BIGINT(30) DEFAULT NULL COMMENT 'appId（来源于：app_info表的主键id）',
	  `versionNo` VARCHAR(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '版本号',
	  `versionInfo` VARCHAR(2000) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '版本介绍',
	  `publishStatus` BIGINT(30) DEFAULT NULL COMMENT '发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）',
	  `downloadLink` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '下载链接',
	  `versionSize` DECIMAL(20,2) DEFAULT NULL COMMENT '版本大小（单位：M）',
	  `createdBy` BIGINT(30) DEFAULT NULL COMMENT '创建者（来源于dev_user开发者信息表的用户id）',
	  `creationDate` DATETIME DEFAULT NULL COMMENT '创建时间',
	  `modifyBy` BIGINT(30) DEFAULT NULL COMMENT '更新者（来源于dev_user开发者信息表的用户id）',
	  `modifyDate` DATETIME DEFAULT NULL COMMENT '最新更新时间',
	  `apkLocPath` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'apk文件的服务器存储路径',
	  `apkFileName` VARCHAR(500) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '上传的apk文件名称',
	  PRIMARY KEY (`id`)
	) ENGINE=INNODB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;*/

	private Integer id;  			//主键id
	private Integer appId;  		//appId（来源于：app_info表的主键id）
	private String versionNo;       //版本号
	private String versionInfo;     //版本介绍
	private Integer publishStatus;  //发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
	private String downloadLink;    //下载链接
	private Double versionSize;    //版本大小（单位：M）
//	private Decimal versionSize;    //版本大小（单位：M）
	private Integer createdBy;  	//创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate;  	//创建时间
	private Integer modifyBy;  		//更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;  		//最新更新时间
	private String apkLocPath;  	//apk文件的服务器存储路径
	private String apkFileName;  	//上传的apk文件名称
	
	private App_info app_info;
}
