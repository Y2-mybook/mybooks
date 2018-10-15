package com.mybook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybook.entity.User;

public interface UserDao {
	
	Boolean save(User user);
	Boolean update(User user);
	Boolean delete(User user);
	//登录
	User findByLogin(User user);
	//查询
	List findByObject(User user);
	//查询所有
	List findUserList(User user);
	//查询总条数
	List findAllCount(User user);
	//分页
	List findAllPageing(@Param("user")User user, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );

}
