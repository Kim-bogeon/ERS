package kr.ac.ers.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ManagerVO {
	String manid;		 //아이디
	String name;		 //이름
	String birth;		 //생년월일
	String address; 	 //주소
	String phone; 		 //전화번호
	String pwd; 		 //패스워드
	String authority;	 //권한
	String depart; 		 //부서
	String status;		 //승인여부
	String email; 		 //이메일
	
}
