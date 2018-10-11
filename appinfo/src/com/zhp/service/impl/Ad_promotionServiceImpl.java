package com.zhp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhp.dao.Ad_promotionDao;
import com.zhp.entity.Ad_promotion;
import com.zhp.service.Ad_promotionService;

@Service
public class Ad_promotionServiceImpl implements Ad_promotionService {
	
	@Autowired
	private Ad_promotionDao ad_promotionDao;

	public Boolean save(Ad_promotion ad_promotion) {
		// TODO Auto-generated method stub
		try {
			ad_promotionDao.save(ad_promotion);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(Ad_promotion ad_promotion) {
		// TODO Auto-generated method stub
		try {
			ad_promotionDao.update(ad_promotion);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean delete(Ad_promotion ad_promotion) {
		// TODO Auto-generated method stub
		try {
			ad_promotionDao.delete(ad_promotion);
			return true;
		} catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List findObject(Ad_promotion ad_promotion) {
		// TODO Auto-generated method stub
		return ad_promotionDao.findObject(ad_promotion);
	}

	public List findAllCount(Ad_promotion ad_promotion) {
		// TODO Auto-generated method stub
		return ad_promotionDao.findAllCount(ad_promotion);
	}

	public List findAllPageing(Ad_promotion ad_promotion, Integer totalRecord, Integer pageSize) {
		// TODO Auto-generated method stub
		return ad_promotionDao.findAllPageing(ad_promotion, totalRecord, pageSize);
	}

}
