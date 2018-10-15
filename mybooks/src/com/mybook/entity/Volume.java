package com.mybook.entity;

public class Volume {  //分卷表
	
/*	CREATE TABLE `volume` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '卷编号',
	  `volumeName` varchar(255) NOT NULL COMMENT '分卷名称',
	  `postage` varchar(11) NOT NULL COMMENT '收费状态',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='分卷表';*/
	
	private int id;
	private String volumeName;
	private String postage;
	
	public Volume() {
		super();
	}
	
	public Volume(int id, String volumeName, String postage) {
		super();
		this.id = id;
		this.volumeName = volumeName;
		this.postage = postage;
	}
	
	@Override
	public String toString() {
		return "Volume [id=" + id + ", volumeName=" + volumeName + ", postage=" + postage + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVolumeName() {
		return volumeName;
	}
	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
	}
	public String getPostage() {
		return postage;
	}
	public void setPostage(String postage) {
		this.postage = postage;
	}
	

}
