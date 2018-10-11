package com.zhp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhp.entity.Ad_promotion;
import com.zhp.entity.App_category;

public interface Ad_promotionDao {
	
	Boolean save(Ad_promotion ad_promotion);
	
	Boolean update(Ad_promotion ad_promotion);
	
	Boolean delete(Ad_promotion ad_promotion);
	
	List findObject(Ad_promotion ad_promotion);
	
	List findAllCount(Ad_promotion ad_promotion);
	//分页
//	List findAllPageing(Ad_promotion ad_promotion, Integer totalRecord,Integer pageSize );
	List findAllPageing(@Param("ad_promotion")Ad_promotion ad_promotion, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );

}
