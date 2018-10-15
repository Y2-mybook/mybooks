package com.mybook.entity;

import java.util.Date;

public class Writer {  //作家表
	
/*	CREATE TABLE `writer` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
	  `writerName` varchar(255) NOT NULL COMMENT '作家名称',
	  `writerCard` varchar(255) NOT NULL COMMENT '登录账号',
	  `writerPassword` varchar(255) NOT NULL COMMENT '密码',
	  `sex` int(11) NOT NULL COMMENT '性别',
	  `level` int(5) NOT NULL COMMENT '级别',
	  `name` varchar(255) NOT NULL COMMENT '真实姓名',
	  `introduce` varchar(255) DEFAULT NULL COMMENT '介绍',
	  `balance` int(11) NOT NULL COMMENT '账户余额',
	  `paymentAmount` int(11) NOT NULL COMMENT '支付总额',
	  `writingDays` int(11) NOT NULL COMMENT '写作天数',
	  `followTheNewRecord` int(11) DEFAULT NULL COMMENT '更新记录',
	  `creationDate` datetime DEFAULT NULL COMMENT '创建时间',
	  `state` varchar(11) NOT NULL COMMENT '状态',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='作家信息表';*/
	
	private int id;
	private String writerName;
	private String writerCard;
	private String writerPassword;
	private int sex;
	private int level;
	private String name;
	private String introduce;
	private int balance;
	private int paymentAmount;
	private int writingDays;
	private int followTheNewRecord;
	private Date creationDate;
	private String state;
	
	public Writer() {
		super();
	}
	
	public Writer(int id, String writerName, String writerCard, String writerPassword, int sex, int level, String name,
			String introduce, int balance, int paymentAmount, int writingDays, int followTheNewRecord,
			Date creationDate, String state) {
		super();
		this.id = id;
		this.writerName = writerName;
		this.writerCard = writerCard;
		this.writerPassword = writerPassword;
		this.sex = sex;
		this.level = level;
		this.name = name;
		this.introduce = introduce;
		this.balance = balance;
		this.paymentAmount = paymentAmount;
		this.writingDays = writingDays;
		this.followTheNewRecord = followTheNewRecord;
		this.creationDate = creationDate;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Writer [id=" + id + ", writerName=" + writerName + ", writerCard=" + writerCard + ", writerPassword="
				+ writerPassword + ", sex=" + sex + ", level=" + level + ", name=" + name + ", introduce=" + introduce
				+ ", balance=" + balance + ", paymentAmount=" + paymentAmount + ", writingDays=" + writingDays
				+ ", followTheNewRecord=" + followTheNewRecord + ", creationDate=" + creationDate + ", state=" + state
				+ "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getWriterCard() {
		return writerCard;
	}
	public void setWriterCard(String writerCard) {
		this.writerCard = writerCard;
	}
	public String getWriterPassword() {
		return writerPassword;
	}
	public void setWriterPassword(String writerPassword) {
		this.writerPassword = writerPassword;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public int getWritingDays() {
		return writingDays;
	}
	public void setWritingDays(int writingDays) {
		this.writingDays = writingDays;
	}
	public int getFollowTheNewRecord() {
		return followTheNewRecord;
	}
	public void setFollowTheNewRecord(int followTheNewRecord) {
		this.followTheNewRecord = followTheNewRecord;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
