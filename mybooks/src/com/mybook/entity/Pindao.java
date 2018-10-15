package com.mybook.entity;

public class Pindao {  //频道表
	
/*	CREATE TABLE `pindao` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '频道编号',
	  `pindaoName` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '频道名称',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='频道表';*/
	
	private int id;
	private String pindaoName;
	
	public Pindao() {
		super();
	}

	public Pindao(int id, String pindaoName) {
		super();
		this.id = id;
		this.pindaoName = pindaoName;
	}

	@Override
	public String toString() {
		return "Pindao [id=" + id + ", pindaoName=" + pindaoName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPindaoName() {
		return pindaoName;
	}

	public void setPindaoName(String pindaoName) {
		this.pindaoName = pindaoName;
	}
	

}
