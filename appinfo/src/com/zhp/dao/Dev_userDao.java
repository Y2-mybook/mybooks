package com.zhp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhp.entity.Dev_user;


public interface Dev_userDao {
	Boolean save(Dev_user dev_user);
	
	Boolean update(Dev_user dev_user);
	
	Boolean delete(Dev_user dev_user);
	
	List findObject(Dev_user dev_user);
	
	List findAllCount(Dev_user dev_user);
	//分页
//	List findAllPageing(Dev_user dev_user, Integer totalRecord, Integer pageSize );
	List findAllPageing(@Param("dev_user")Dev_user dev_user, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );

}
