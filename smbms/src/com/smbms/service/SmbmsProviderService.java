package com.smbms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smbms.entity.SmbmsProvider;

public interface SmbmsProviderService {
	int saveProvider(SmbmsProvider provider);
	int deleteProvider(SmbmsProvider provider);
	int updateProvider(SmbmsProvider provider);
	List<SmbmsProvider> findProviderList(@Param("provider") SmbmsProvider provider,@Param("firstResult") int firstResult,@Param("maxResults") int maxResults);
	SmbmsProvider findProvider(SmbmsProvider provider);
	int proTotalCount(SmbmsProvider provider);
}
