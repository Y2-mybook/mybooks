package com.mybook.entity;

import java.util.Date;

public class Chapter {  //章节表
	
/*	CREATE TABLE `chapter` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '章节编号',
	  `noveId` int(11) NOT NULL,
	  `volumeId` int(11) NOT NULL COMMENT '卷编号',
	  `chapterName` varchar(255) NOT NULL COMMENT '章节名称',
	  `chapterInfo` text NOT NULL COMMENT '章节内容',
	  `numberOfWords` int(11) NOT NULL COMMENT '字数',
	  `chargeState` int(11) NOT NULL COMMENT '单章价',
	  `writeDate` date NOT NULL COMMENT '书写日期',
	  `state` varchar(11) NOT NULL COMMENT '状态',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=594 DEFAULT CHARSET=utf8 COMMENT='章节表';*/

	private int id;
	private int noveId;
	private int volumeId;
	private String chapterName;
	private String chapterInfo;
	private int numberOfWords;
	private int chargeState;
	private Date writeDate;
	private String state;
	
	public Chapter() {
		super();
	}

	public Chapter(int id, int noveId, int volumeId, String chapterName, String chapterInfo, int numberOfWords,
			int chargeState, Date writeDate, String state) {
		super();
		this.id = id;
		this.noveId = noveId;
		this.volumeId = volumeId;
		this.chapterName = chapterName;
		this.chapterInfo = chapterInfo;
		this.numberOfWords = numberOfWords;
		this.chargeState = chargeState;
		this.writeDate = writeDate;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Chapter [id=" + id + ", noveId=" + noveId + ", volumeId=" + volumeId + ", chapterName=" + chapterName
				+ ", chapterInfo=" + chapterInfo + ", numberOfWords=" + numberOfWords + ", chargeState=" + chargeState
				+ ", writeDate=" + writeDate + ", state=" + state + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoveId() {
		return noveId;
	}

	public void setNoveId(int noveId) {
		this.noveId = noveId;
	}

	public int getVolumeId() {
		return volumeId;
	}

	public void setVolumeId(int volumeId) {
		this.volumeId = volumeId;
	}

	public String getChapterName() {
		return chapterName;
	}

	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}

	public String getChapterInfo() {
		return chapterInfo;
	}

	public void setChapterInfo(String chapterInfo) {
		this.chapterInfo = chapterInfo;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public void setNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	public int getChargeState() {
		return chargeState;
	}

	public void setChargeState(int chargeState) {
		this.chargeState = chargeState;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
