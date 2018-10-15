package com.mybook.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mybook.entity.User;
import com.mybook.service.UserService;
import com.mybook.service.WriterService;

public class UserController {
	
	private UserService userService;
	private WriterService writerService;
	
	private List<User> listuser = new ArrayList<User>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	

}
