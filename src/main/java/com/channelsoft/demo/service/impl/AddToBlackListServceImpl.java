package com.channelsoft.demo.service.impl;


import com.channelsoft.demo.dao.AddToBlackListMapper;
import com.channelsoft.demo.service.AddToBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddToBlackListServceImpl implements AddToBlackListService {
	@Autowired
	private AddToBlackListMapper addToBlackListMapper;

	@Override
	public List<String> queryRepeatTelephone(String startDate, String endDate) {
		// TODO Auto-generated method stub
	List<String>	list=addToBlackListMapper.queryRepeatTelephone(startDate, endDate);
		return list;
	}


}
