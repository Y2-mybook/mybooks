package com.mybook.entity;

import java.util.Date;

public class Commentary {  //评论基本信息表

/*	CREATE TABLE `commentary` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
	  `novel` int(11) NOT NULL COMMENT '小说编号',
	  `chapter` int(11) NOT NULL COMMENT '章节编号',
	  `userId` int(11) NOT NULL COMMENT '用户编号',
	  `commentaryInfo` text NOT NULL COMMENT '评论内容',
	  `commentaryDate` date NOT NULL COMMENT '评论日期',
	  `state` varchar(11) DEFAULT NULL COMMENT '状态',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='评论基本信息表';*/
	
	private int id;
	private int novel;
	private int chapter;
	private int userId;
	private String commentaryInfo;
	private Date commentaryDate;
	private String state;
	
	public Commentary() {
		super();
	}

	public Commentary(int id, int novel, int chapter, int userId, String commentaryInfo, Date commentaryDate,
			String state) {
		super();
		this.id = id;
		this.novel = novel;
		this.chapter = chapter;
		this.userId = userId;
		this.commentaryInfo = commentaryInfo;
		this.commentaryDate = commentaryDate;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Commentary [id=" + id + ", novel=" + novel + ", chapter=" + chapter + ", userId=" + userId
				+ ", commentaryInfo=" + commentaryInfo + ", commentaryDate=" + commentaryDate + ", state=" + state
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNovel() {
		return novel;
	}

	public void setNovel(int novel) {
		this.novel = novel;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCommentaryInfo() {
		return commentaryInfo;
	}

	public void setCommentaryInfo(String commentaryInfo) {
		this.commentaryInfo = commentaryInfo;
	}

	public Date getCommentaryDate() {
		return commentaryDate;
	}

	public void setCommentaryDate(Date commentaryDate) {
		this.commentaryDate = commentaryDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
