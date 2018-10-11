package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.App_infoDao;
import com.zhp.entity.App_info;
import com.zhp.service.App_infoService;

@Service
public class App_infoServiceImpl implements App_infoService {
	
	@Autowired
	private App_infoDao app_infoDao;

	public Boolean save(App_info app_info) {
		// TODO Auto-generated method stub
		try {
			app_infoDao.save(app_info);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(App_info app_info) {
		// TODO Auto-generated method stub
		try {
			app_infoDao.update(app_info);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(App_info app_info) {
		// TODO Auto-generated method stub
		try {
			app_infoDao.delete(app_info);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(App_info app_info) {
		// TODO Auto-generated method stub
		return app_infoDao.findObject(app_info);
	}

	public List findAllCount(App_info app_info) {
		// TODO Auto-generated method stub
		return app_infoDao.findAllCount(app_info);
	}

	public List findAllPageing(App_info app_info, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return app_infoDao.findAllPageing(app_info, totalRecord, pageSize);
	}

}
