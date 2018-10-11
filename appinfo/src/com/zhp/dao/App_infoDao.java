package com.zhp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhp.entity.App_info;
import com.zhp.entity.App_version;

public interface App_infoDao {
	
	Boolean save(App_info app_info);
	
	Boolean update(App_info app_info);
	
	Boolean delete(App_info app_info);
	
	List findObject(App_info app_info);
	
	List findAllCount(App_info app_info);
	//分页
//	List findAllPageing(App_info app_info, Integer totalRecord, Integer pageSize );
	List findAllPageing(@Param("app_info")App_info app_info, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
