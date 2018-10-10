package com.smbms.service.impl;

import static org.junit.Assert.*;

import java.sql.Timestamp;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smbms.entity.SmbmsRole;
import com.smbms.service.SmbmsRoleService;

public class TestSmbmsRole {

	@Test
	public void updateRole() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext*.xml");
		SmbmsRoleService roleService = (SmbmsRoleService) app.getBean("smbmsRoleServiceImpl");
		SmbmsRole role = new SmbmsRole();
		role.setId(2);
		role.setModifyBy(1l);
		role.setModifyDate(new Timestamp(System.currentTimeMillis()));
		int result = roleService.updateRole(role);
		if(result>0){
			System.out.println("修改成功");
		}
	}
	
	/*
	 * 删除角色
	 */
	/*@Test
	public void deleteRole() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext*.xml");
		SmbmsRoleService roleService = (SmbmsRoleService) app.getBean("smbmsRoleServiceImpl");
		SmbmsRole role = new SmbmsRole();
		role.setId(7);
		int result = roleService.deleteRole(role);
		if(result>=1){
			System.out.println("删除成功");
		}
	}*/

}
