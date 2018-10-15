package com.mybook.service;

import java.util.List;

import com.mybook.entity.Novel;

public interface NovelService {

	Novel findByLogin(Novel novel);

	List findNovelList(Novel novel);

	List findAllCount(Novel novel);

	List findAllPageing(Novel novel, Integer totalRecord, Integer pageSize);

	Boolean save(Novel novel);

	Boolean delete(Novel novel);

}
