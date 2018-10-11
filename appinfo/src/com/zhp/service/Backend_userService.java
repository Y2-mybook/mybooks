package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.Backend_user;

@Service
public interface Backend_userService {
	
	Boolean save(Backend_user backend_user);
	
	Boolean update(Backend_user backend_user);
	
	Boolean delete(Backend_user backend_user);
	
	List findObject(Backend_user backend_user);
	
	List findAllCount(Backend_user backend_user);
	//分页
	List findAllPageing(Backend_user backend_user, Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("backend_user")Backend_user backend_user, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
