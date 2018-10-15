package com.mybook.entity;

import java.util.Date;

public class User {  //用户表
	
/*	CREATE TABLE `user` (
	  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
	  `userName` varchar(255) NOT NULL COMMENT '用户名',
	  `userCard` varchar(255) NOT NULL COMMENT '登录账号',
	  `userPassword` varchar(255) NOT NULL COMMENT '密码',
	  `isController` int(4) NOT NULL COMMENT '是否是管理员',
	  `sex` int(11) NOT NULL COMMENT '性别',
	  `level` int(5) NOT NULL COMMENT '级别',
	  `name` varchar(255) NOT NULL COMMENT '真实姓名',
	  `introduce` varchar(255) DEFAULT NULL COMMENT '介绍',
	  `balance` int(11) NOT NULL COMMENT '账户余额',
	  `paymentAmount` int(11) NOT NULL COMMENT '支付总额',
	  `readDays` int(11) NOT NULL COMMENT '阅读天数',
	  `creationDate` datetime DEFAULT NULL COMMENT '创建时间',
	  `state` varchar(11) DEFAULT NULL COMMENT '状态',
	  `monthly ticket` int(11) DEFAULT NULL COMMENT '月票',
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';*/
	
	private int id;
	private String userName;
	private String userCard;
	private String userPassword;
	private int isController;
	private int sex;
	private int level;
	private String name;
	private String introduce;
	private int balance;
	private int paymentAmount;
	private int readDays;
	private Date creationDate;
	private String state;
	private int monthly;
	
	public User() {
		super();
	}

	public User(int id, String userName, String userCard, String userPassword, int isController, int sex, int level,
			String name, String introduce, int balance, int paymentAmount, int readDays, Date creationDate,
			String state, int monthly) {
		super();
		this.id = id;
		this.userName = userName;
		this.userCard = userCard;
		this.userPassword = userPassword;
		this.isController = isController;
		this.sex = sex;
		this.level = level;
		this.name = name;
		this.introduce = introduce;
		this.balance = balance;
		this.paymentAmount = paymentAmount;
		this.readDays = readDays;
		this.creationDate = creationDate;
		this.state = state;
		this.monthly = monthly;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userCard=" + userCard + ", userPassword=" + userPassword
				+ ", isController=" + isController + ", sex=" + sex + ", level=" + level + ", name=" + name
				+ ", introduce=" + introduce + ", balance=" + balance + ", paymentAmount=" + paymentAmount
				+ ", readDays=" + readDays + ", creationDate=" + creationDate + ", state=" + state + ", monthly="
				+ monthly + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCard() {
		return userCard;
	}

	public void setUserCard(String userCard) {
		this.userCard = userCard;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getIsController() {
		return isController;
	}

	public void setIsController(int isController) {
		this.isController = isController;
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

	public int getReadDays() {
		return readDays;
	}

	public void setReadDays(int readDays) {
		this.readDays = readDays;
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

	public int getMonthly() {
		return monthly;
	}

	public void setMonthly(int monthly) {
		this.monthly = monthly;
	}
	

}
