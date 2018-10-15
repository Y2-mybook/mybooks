package com.mybook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybook.dao.NovelDao;
import com.mybook.entity.Novel;
import com.mybook.service.NovelService;

public class NovelSereviceImpl implements NovelService {
	

	@Autowired
	private NovelDao novelDao;
	
	//登录
	@Override
	public Novel findByLogin(Novel novel) {  
		// TODO Auto-generated method stub
		return novelDao.findByLogin(novel);
	}
	
	//查询所有
	@Override
	public List findNovelList(Novel novel) {
		// TODO Auto-generated method stub
		return novelDao.findNovelList(novel);
	}
	
	//查询总条数
	@Override
	public List findAllCount(Novel novel) {
		// TODO Auto-generated method stub
		return novelDao.findAllCount(novel);
	}
	
	//分页查询
	@Override
	public List findAllPageing(Novel novel, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return novelDao.findAllPageing(novel, totalRecord, pageSize);
	}
	
	//添加
	@Override
	public Boolean save(Novel novel) {  
		// TODO Auto-generated method stub
		try {
			novelDao.save(novel);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//删除
	@Override
	public Boolean delete(Novel novel) {  
		// TODO Auto-generated method stub
		try {
			novelDao.delete(novel);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}


}
