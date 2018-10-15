package com.mybook.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mybook.entity.Chapter;

public interface ChapterDao {
	
	Boolean save(Chapter chapter);
	Boolean update(Chapter chapter);
	Boolean delete(Chapter chapter);
	//登录
	Chapter findByLogin(Chapter chapter);
	//查询
	List findByObject(Chapter chapter);
	//查询所有
	List findChapterList(Chapter chapter);
	//查询总条数
	List findAllCount(Chapter chapter);
	//分页
	List findAllPageing(@Param("chapter")Chapter chapter, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );

}
