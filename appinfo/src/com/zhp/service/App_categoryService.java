package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.App_category;

@Service
public interface App_categoryService {
	
	Boolean save(App_category app_category);
	
	Boolean update(App_category app_category);
	
	Boolean delete(App_category app_category);
	
	List findObject(App_category app_category);
	
	List findAllCount(App_category app_category);
	//分页
	List findAllPageing(App_category app_category, Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("app_category")App_category app_category, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );



}
