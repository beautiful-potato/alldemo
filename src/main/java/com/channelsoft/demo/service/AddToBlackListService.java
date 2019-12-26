package com.channelsoft.demo.service;



import java.util.List;

public interface AddToBlackListService {
	List<String> queryRepeatTelephone(String startDate, String endDate);
}
