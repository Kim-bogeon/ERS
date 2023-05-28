package kr.ac.ers.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SensorckMapper {
	void insertOutSensor(@Param("id") String  id, @Param("outconfirm")String outconfirm, @Param("outtime")String outtime);
	
	void insertActiveTime (@Param("id") String  id, @Param("activetime")String activetime);

}
