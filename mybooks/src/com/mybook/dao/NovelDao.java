package com.mybook.dao;

import java.util.List;

import com.mybook.entity.Novel;

public interface NovelDao {

	List findAllCount(Novel novel);

	List findAllPageing(Novel novel, Integer totalRecord, Integer pageSize);

	void save(Novel novel);

	void delete(Novel novel);

	List findNovelList(Novel novel);

	Novel findByLogin(Novel novel);
	
}
