package com.mybook.entity;

public class Classify {  //分类表
	
/*	CREATE TABLE `classify` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
	  `categoryName` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '分类名称',
	  `parentId` bigint(30) DEFAULT NULL COMMENT '一级分类',
	  `pindaoId` bigint(8) DEFAULT NULL COMMENT '频道id',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COMMENT='分类表';*/

	private int id;
	private String categoryName;
	private int parentId;
	private int pindaoId;
	
	public Classify() {
		super();
	}

	public Classify(int id, String categoryName, int parentId, int pindaoId) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.parentId = parentId;
		this.pindaoId = pindaoId;
	}

	@Override
	public String toString() {
		return "Classify [id=" + id + ", categoryName=" + categoryName + ", parentId=" + parentId + ", pindaoId="
				+ pindaoId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getPindaoId() {
		return pindaoId;
	}

	public void setPindaoId(int pindaoId) {
		this.pindaoId = pindaoId;
	}
	
}
