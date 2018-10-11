package com.zhp.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UtilSqlSession {
	private static String config = "mybatis.xml";
	private static SqlSessionFactory factory = null;
	private static ThreadLocal<SqlSession> sessions = new ThreadLocal<SqlSession>();  //Map,v
	
	static{
		//读取配置文件，并转换成流的格式
		//解析配置配置，并获得sessionfactory
		try {
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(config));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private UtilSqlSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	static class  Singleton{
		private static UtilSqlSession mutil = new UtilSqlSession();
	}
	
	public static UtilSqlSession getInstance(){
		return Singleton.mutil;
	}
	
	//开启
	public static SqlSession getOpenSession(){
		SqlSession session = sessions.get();
		if(session == null){
			session = factory.openSession(false);//true:自动提交事务，false:手动提交事务
			sessions.set(session);
		}
		return session;
	}
	
	//关闭
	public static void getCloseSession(){
		sessions.remove();
	}


}
