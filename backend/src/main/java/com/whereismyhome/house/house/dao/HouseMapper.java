package com.whereismyhome.house.house.dao;

import java.util.List;
import java.util.Map;

import com.whereismyhome.house.house.VO.DetailResultVO;
import com.whereismyhome.house.house.VO.SearchResultVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HouseMapper {

	List<SearchResultVO> selectHousesByDongCode(Long dongCode);
	List<DetailResultVO> selectDealsByAptCode(Map<String, Long> params);
}
