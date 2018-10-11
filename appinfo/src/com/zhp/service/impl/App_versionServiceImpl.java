package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.App_versionDao;
import com.zhp.entity.App_version;
import com.zhp.service.App_versionService;

@Service
public class App_versionServiceImpl implements App_versionService {
	
	@Autowired
	private App_versionDao app_versionDao;

	public Boolean save(App_version app_version) {
		// TODO Auto-generated method stub
		try {
			app_versionDao.save(app_version);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(App_version app_version) {
		// TODO Auto-generated method stub
		try {
			app_versionDao.update(app_version);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(App_version app_version) {
		// TODO Auto-generated method stub
		try {
			app_versionDao.delete(app_version);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(App_version app_version) {
		// TODO Auto-generated method stub
		return app_versionDao.findObject(app_version);
	}

	public List findAllCount(App_version app_version) {
		// TODO Auto-generated method stub
		return app_versionDao.findAllCount(app_version);
	}

	public List findAllPageing(App_version app_version, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return app_versionDao.findAllPageing(app_version, totalRecord, pageSize);
	}

}
