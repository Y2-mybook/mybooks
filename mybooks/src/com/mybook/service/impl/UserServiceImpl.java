package com.mybook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybook.dao.UserDao;
import com.mybook.entity.User;
import com.mybook.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	//登录
	@Override
	public User findByLogin(User user) {  
		// TODO Auto-generated method stub
		return userDao.findByLogin(user);
	}
	
	//查询所有
	@Override
	public List findUserList(User user) {
		// TODO Auto-generated method stub
		return userDao.findUserList(user);
	}
	
	//查询总条数
	@Override
	public List findAllCount(User user) {
		// TODO Auto-generated method stub
		return userDao.findAllCount(user);
	}
	
	//分页查询
	@Override
	public List findAllPageing(User user, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return userDao.findAllPageing(user, totalRecord, pageSize);
	}
	
	//添加
	@Override
	public Boolean save(User user) {  
		// TODO Auto-generated method stub
		try {
			userDao.save(user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//删除
	@Override
	public Boolean delete(User user) {  
		// TODO Auto-generated method stub
		try {
			userDao.delete(user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
