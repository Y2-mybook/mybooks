package com.mybook.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mybook.entity.Novel;
import com.mybook.service.NovelService;

public class NovelController {
	
	private NovelService novelService;
	
	//按月票降序查询
	@RequestMapping(value="login", method={RequestMethod.POST, RequestMethod.GET})
	public String login(Novel novel, Integer pageIndex, Model model, HttpSession session) { 
		List<Novel> list3 = new ArrayList<Novel>();
		Novel novel2 = novelService.findByLogin(novel);
		if(novel2 != null) {
			session.setAttribute("novelSession", novel2);
		}
		return "jsp/novellist";
	}

}
