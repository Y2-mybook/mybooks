package com.mybook.entity;

import java.util.Date;

public class Novel {  //小说基本信息表
	
/*	CREATE TABLE `novel` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '小说编号',
	  `novelName` varchar(255) NOT NULL COMMENT '书名',
	  `briefIntroduction` text NOT NULL COMMENT '简介',
	  `writerId` int(11) NOT NULL COMMENT '作者编号',
	  `classifyLevelId1` int(11) DEFAULT NULL COMMENT '一级分类',
	  `classifyLevelId2` int(11) DEFAULT NULL COMMENT '二级分类',
	  `writeState` varchar(11) NOT NULL COMMENT '书写状态',
	  `writeDate` date NOT NULL COMMENT '书写日期',
	  `score` decimal(3,1) NOT NULL COMMENT '评分',
	  `monthlyTicket` int(11) NOT NULL COMMENT '月票',
	  `recommendCount` int(11) NOT NULL COMMENT '推荐票',
	  `commentaryCount` int(11) NOT NULL COMMENT '评论条数',
	  `img` varchar(255) DEFAULT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='小说基本信息表';*/
	
	private int id;
	private String novelName;
	private String briefIntroduction;
	private int writerId;
	private int classifyLevelId1;
	private int classifyLevelId2;
	private String writeState;
	private Date writeDate;
	private float score;
	private int monthlyTicket;
	private int recommendCount;
	private int commentaryCount;
	private String img;
	
	public Novel() {
		super();
	}

	public Novel(int id, String novelName, String briefIntroduction, int writerId, int classifyLevelId1,
			int classifyLevelId2, String writeState, Date writeDate, float score, int monthlyTicket, int recommendCount,
			int commentaryCount, String img) {
		super();
		this.id = id;
		this.novelName = novelName;
		this.briefIntroduction = briefIntroduction;
		this.writerId = writerId;
		this.classifyLevelId1 = classifyLevelId1;
		this.classifyLevelId2 = classifyLevelId2;
		this.writeState = writeState;
		this.writeDate = writeDate;
		this.score = score;
		this.monthlyTicket = monthlyTicket;
		this.recommendCount = recommendCount;
		this.commentaryCount = commentaryCount;
		this.img = img;
	}

	@Override
	public String toString() {
		return "Novel [id=" + id + ", novelName=" + novelName + ", briefIntroduction=" + briefIntroduction
				+ ", writerId=" + writerId + ", classifyLevelId1=" + classifyLevelId1 + ", classifyLevelId2="
				+ classifyLevelId2 + ", writeState=" + writeState + ", writeDate=" + writeDate + ", score=" + score
				+ ", monthlyTicket=" + monthlyTicket + ", recommendCount=" + recommendCount + ", commentaryCount="
				+ commentaryCount + ", img=" + img + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNovelName() {
		return novelName;
	}

	public void setNovelName(String novelName) {
		this.novelName = novelName;
	}

	public String getBriefIntroduction() {
		return briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public int getClassifyLevelId1() {
		return classifyLevelId1;
	}

	public void setClassifyLevelId1(int classifyLevelId1) {
		this.classifyLevelId1 = classifyLevelId1;
	}

	public int getClassifyLevelId2() {
		return classifyLevelId2;
	}

	public void setClassifyLevelId2(int classifyLevelId2) {
		this.classifyLevelId2 = classifyLevelId2;
	}

	public String getWriteState() {
		return writeState;
	}

	public void setWriteState(String writeState) {
		this.writeState = writeState;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public int getMonthlyTicket() {
		return monthlyTicket;
	}

	public void setMonthlyTicket(int monthlyTicket) {
		this.monthlyTicket = monthlyTicket;
	}

	public int getRecommendCount() {
		return recommendCount;
	}

	public void setRecommendCount(int recommendCount) {
		this.recommendCount = recommendCount;
	}

	public int getCommentaryCount() {
		return commentaryCount;
	}

	public void setCommentaryCount(int commentaryCount) {
		this.commentaryCount = commentaryCount;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	

}
