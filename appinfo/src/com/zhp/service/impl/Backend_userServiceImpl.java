package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.Backend_userDao;
import com.zhp.entity.Backend_user;
import com.zhp.service.Backend_userService;

@Service
public class Backend_userServiceImpl implements Backend_userService {
	
	@Autowired
	private Backend_userDao backend_userDao;

	public Boolean save(Backend_user backend_user) {
		// TODO Auto-generated method stub
		try {
			backend_userDao.save(backend_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(Backend_user backend_user) {
		// TODO Auto-generated method stub
		try {
			backend_userDao.update(backend_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(Backend_user backend_user) {
		// TODO Auto-generated method stub
		try {
			backend_userDao.delete(backend_user);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(Backend_user backend_user) {
		// TODO Auto-generated method stub
		return backend_userDao.findObject(backend_user);
	}

	public List findAllCount(Backend_user backend_user) {
		// TODO Auto-generated method stub
		return backend_userDao.findAllCount(backend_user);
	}

	public List findAllPageing(Backend_user backend_user, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return backend_userDao.findAllPageing(backend_user, totalRecord, pageSize);
	}

}
