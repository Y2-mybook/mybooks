package com.mybook.entity;

public class Level {  //级别表
	
/*	CREATE TABLE `level` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
	  `levelName` varchar(50) NOT NULL COMMENT '级别名称',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='级别表';*/
	
	private int id;
	private String levelNamel;
	
	public Level() {
		super();
	}

	public Level(int id, String levelNamel) {
		super();
		this.id = id;
		this.levelNamel = levelNamel;
	}

	@Override
	public String toString() {
		return "Level [id=" + id + ", levelNamel=" + levelNamel + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevelNamel() {
		return levelNamel;
	}

	public void setLevelNamel(String levelNamel) {
		this.levelNamel = levelNamel;
	}
	
	

}
