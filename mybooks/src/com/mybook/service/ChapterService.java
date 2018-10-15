package com.mybook.service;

import java.util.List;

import com.mybook.entity.Chapter;

public interface ChapterService {

	Chapter findByLogin(Chapter chapter);

	List findChapterList(Chapter chapter);

	List findAllCount(Chapter chapter);

	List findAllPageing(Chapter chapter, Integer totalRecord, Integer pageSize);

	Boolean save(Chapter chapter);

	Boolean delete(Chapter chapter);

}
