package com.mybook.entity;

import java.util.Date;

public class Bookshelf {  //书架信息表
	
/*	CREATE TABLE `bookshelf` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
	  `novelId` int(11) NOT NULL COMMENT '小说编号',
	  `joinDate` datetime DEFAULT NULL COMMENT '加入时间',
	  `bookId` int(11) DEFAULT NULL COMMENT '关联书籍表',
	  `chapterId` int(11) DEFAULT NULL COMMENT '章节编号',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='书架信息表';*/
	
	private int id;
	private int novelId;
	private Date joinDate;
	private int bookId;
	private int chapterId;
	
	public Bookshelf() {
		super();
	}

	public Bookshelf(int id, int novelId, Date joinDate, int bookId, int chapterId) {
		super();
		this.id = id;
		this.novelId = novelId;
		this.joinDate = joinDate;
		this.bookId = bookId;
		this.chapterId = chapterId;
	}

	@Override
	public String toString() {
		return "Bookshelf [id=" + id + ", novelId=" + novelId + ", joinDate=" + joinDate + ", bookId=" + bookId
				+ ", chapterId=" + chapterId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNovelId() {
		return novelId;
	}

	public void setNovelId(int novelId) {
		this.novelId = novelId;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	
	
	

}
