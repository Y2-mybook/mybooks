package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.App_version;

@Service
public interface App_versionService {
	
	Boolean save(App_version app_version);
	
	Boolean update(App_version app_version);
	
	Boolean delete(App_version app_version);
	
	List findObject(App_version app_version);
	
	List findAllCount(App_version app_version);
	//分页
	List findAllPageing(App_version app_version, Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("app_version")App_version app_version, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
