package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.App_info;

@Service
public interface App_infoService {
	
	Boolean save(App_info app_info);
	
	Boolean update(App_info app_info);
	
	Boolean delete(App_info app_info);
	
	List findObject(App_info app_info);
	
	List findAllCount(App_info app_info);
	//分页
	List findAllPageing(App_info app_info, Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("app_info")App_info app_info, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
