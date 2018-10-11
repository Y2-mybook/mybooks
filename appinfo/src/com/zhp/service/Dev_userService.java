package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.Dev_user;

@Service
public interface Dev_userService {
	Boolean save(Dev_user dev_user);
	
	Boolean update(Dev_user dev_user);
	
	Boolean delete(Dev_user dev_user);
	
	List findObject(Dev_user dev_user);
	
	List findAllCount(Dev_user dev_user);
	//分页
	List findAllPageing(Dev_user dev_user, Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("dev_user")Dev_user dev_user, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
