package com.zhp.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.Dev_userDao;
import com.zhp.entity.Dev_user;
import com.zhp.service.Dev_userService;

@Service
public class Dev_userServiceImpl implements Dev_userService {
	
	@Autowired
	private Dev_userDao dev_userDao;

	public Boolean save(Dev_user dev_user) {
		// TODO Auto-generated method stub
		try {
			dev_userDao.save(dev_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(Dev_user dev_user) {
		// TODO Auto-generated method stub
		try {
			dev_userDao.update(dev_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(Dev_user dev_user) {
		// TODO Auto-generated method stub
		try {
			dev_userDao.delete(dev_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(Dev_user dev_user) {
		// TODO Auto-generated method stub
		return dev_userDao.findObject(dev_user);
	}

	public List findAllCount(Dev_user dev_user) {
		// TODO Auto-generated method stub
		return dev_userDao.findAllCount(dev_user);
	}

	public List findAllPageing(Dev_user dev_user, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return dev_userDao.findAllPageing(dev_user, totalRecord, pageSize);
	}

}
