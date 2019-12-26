package com.channelsoft.demo.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 调用添加黑名单mapper文件
 * @author z'f'h
 *  @date 2019年11月19日13:35:31
 *     查询每日导入名单中重复电话号码
 */
@Mapper
public interface AddToBlackListMapper {

	@Select("SELECT telno1 FROM znkf_zdwh "
			+ "WHERE insert_date > #{startDate} "
			+ "AND insert_date < #{endDate}"
			+ " AND call_start_time IS NULL "
			+ "AND ywlxdm NOT IN('JNTG','FHKS')"
			+ " AND rwbh NOT LIKE 'TE%'"
			+ " GROUP BY telno1 "
			+ "HAVING  COUNT( telno1)>1")
	List<String> queryRepeatTelephone(@Param("startDate") String startDate, @Param("endDate") String endDate);


	
}
