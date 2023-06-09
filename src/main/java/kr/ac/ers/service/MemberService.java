package kr.ac.ers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.ers.dto.MemberVO;
import kr.ac.ers.repository.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	public MemberVO getMember(int id) {
		return memberMapper.selectMember(id);
	}
	
	
}
