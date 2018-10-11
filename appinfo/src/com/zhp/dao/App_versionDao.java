package com.zhp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhp.entity.App_version;
import com.zhp.entity.Data_dictionary;

public interface App_versionDao {
	
	Boolean save(App_version app_version);
	
	Boolean update(App_version app_version);
	
	Boolean delete(App_version app_version);
	
	List findObject(App_version app_version);
	
	List findAllCount(App_version app_version);
	//分页
//	List findAllPageing(App_version app_version, Integer totalRecord, Integer pageSize );
	List findAllPageing(@Param("app_version")App_version app_version, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
