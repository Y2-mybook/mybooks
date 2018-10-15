package com.mybook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybook.dao.ChapterDao;
import com.mybook.entity.Chapter;
import com.mybook.service.ChapterService;

public class ChapterServiceImpl implements ChapterService {
	
	@Autowired
	private ChapterDao chapterDao;
	
	//登录
	@Override
	public Chapter findByLogin(Chapter chapter) {  
		// TODO Auto-generated method stub
		return chapterDao.findByLogin(chapter);
	}
	
	//查询所有
	@Override
	public List findChapterList(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterDao.findChapterList(chapter);
	}
	
	//查询总条数
	@Override
	public List findAllCount(Chapter chapter) {
		// TODO Auto-generated method stub
		return chapterDao.findAllCount(chapter);
	}
	
	//分页查询
	@Override
	public List findAllPageing(Chapter chapter, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return chapterDao.findAllPageing(chapter, totalRecord, pageSize);
	}
	
	//添加
	@Override
	public Boolean save(Chapter chapter) {  
		// TODO Auto-generated method stub
		try {
			chapterDao.save(chapter);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	//删除
	@Override
	public Boolean delete(Chapter chapter) {  
		// TODO Auto-generated method stub
		try {
			chapterDao.delete(chapter);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

}
