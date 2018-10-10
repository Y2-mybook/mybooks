package com.smbms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smbms.entity.SmbmsRole;
import com.smbms.service.SmbmsRoleService;

@Controller
@RequestMapping(value="role")
public class SmbmsRoleController {
	@Autowired
	private SmbmsRoleService smbmsRoleService;
	
	 @ResponseBody
	@RequestMapping(value="getRoleList",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	public List<SmbmsRole> getRoleList(){
		List<SmbmsRole> roleList = smbmsRoleService.findRoleList();
		return roleList;
	}
}
