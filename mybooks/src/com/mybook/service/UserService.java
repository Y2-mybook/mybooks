package com.mybook.service;

import java.util.List;

import com.mybook.entity.User;

public interface UserService {

	User findByLogin(User user);

	List findUserList(User user);

	java.util.List findAllCount(User user);

	List findAllPageing(User user, Integer totalRecord, Integer pageSize);

	Boolean save(User user);

	Boolean delete(User user);

}
