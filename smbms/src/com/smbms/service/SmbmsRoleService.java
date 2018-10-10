package com.smbms.service;


import java.util.List;

import com.smbms.entity.SmbmsRole;

public interface SmbmsRoleService {
	int deleteRole(SmbmsRole role);
	int updateRole(SmbmsRole role);
	List<SmbmsRole> findRoleList();
}
