package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.Data_dictionaryDao;
import com.zhp.entity.Data_dictionary;
import com.zhp.service.Data_dictionaryService;

@Service
public class Data_dictionaryServiceImpl implements Data_dictionaryService {
	
	@Autowired
	private Data_dictionaryDao data_dictionaryDao;

	public Boolean save(Data_dictionary data_dictionary) {
		// TODO Auto-generated method stub
		try {
			data_dictionaryDao.save(data_dictionary);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(Data_dictionary data_dictionary) {
		// TODO Auto-generated method stub
		try {
			data_dictionaryDao.update(data_dictionary);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(Data_dictionary data_dictionary) {
		// TODO Auto-generated method stub
		try {
			data_dictionaryDao.delete(data_dictionary);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(Data_dictionary data_dictionary) {
		// TODO Auto-generated method stub
		return data_dictionaryDao.findObject(data_dictionary);
	}

	public List findAllCount(Data_dictionary data_dictionary) {
		// TODO Auto-generated method stub
		return data_dictionaryDao.findAllCount(data_dictionary);
	}

	public List findAllPageing(Data_dictionary data_dictionary, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return data_dictionaryDao.findAllPageing(data_dictionary, totalRecord, pageSize);
	}

}
