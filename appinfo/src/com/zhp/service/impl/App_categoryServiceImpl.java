package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.App_categoryDao;
import com.zhp.entity.App_category;
import com.zhp.service.App_categoryService;

@Service
public class App_categoryServiceImpl implements App_categoryService {
	
	@Autowired
	private App_categoryDao app_categoryDao;

	public Boolean save(App_category app_category) {
		// TODO Auto-generated method stub
		try {
			app_categoryDao.save(app_category);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(App_category app_category) {
		// TODO Auto-generated method stub
		try {
			app_categoryDao.update(app_category);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(App_category app_category) {
		// TODO Auto-generated method stub
		try {
			app_categoryDao.delete(app_category);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(App_category app_category) {
		// TODO Auto-generated method stub
		return app_categoryDao.findObject(app_category);
	}

	public List findAllCount(App_category app_category) {
		// TODO Auto-generated method stub
		return app_categoryDao.findAllCount(app_category);
	}

	public List findAllPageing(App_category app_category, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return app_categoryDao.findAllPageing(app_category, totalRecord, pageSize);
	}

}
