package kr.ac.ers.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import kr.ac.ers.dto.ManagerVO;

@Mapper
public interface ManagerMapper {

	ManagerVO getManagerByLoginId(@Param("id") String id);

	ManagerVO selectManagerById(@Param("id") String id);
	
	void insertManager(ManagerVO manager);

	int overlappedID(ManagerVO manager);
		
}
