package com.zhp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhp.entity.Data_dictionary;

@Service
public interface Data_dictionaryService {
	Boolean save(Data_dictionary data_dictionary);
	
	Boolean update(Data_dictionary data_dictionary);
	
	Boolean delete(Data_dictionary data_dictionary);
	
	List findObject(Data_dictionary data_dictionary);
	
	List findAllCount(Data_dictionary data_dictionary);
	//分页
	List findAllPageing(Data_dictionary data_dictionary,Integer totalRecord, Integer pageSize );
//	List findAllPageing(@Param("data_dictionary")Data_dictionary data_dictionary, @Param("totalRecord")Integer totalRecord, @Param("pageSize")Integer pageSize );


}
