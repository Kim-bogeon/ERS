package kr.ac.ers.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ManagerVO {
	public String manid;		 //아이디
	public String name;		 //이름
	public String birth;		 //생년월일
	public String address; 	 //주소
	public String phone; 		 //전화번호
	public String pwd; 		 //패스워드
	public String authority;	 //권한
	public String depart; 		 //부서
	public String status;		 //승인여부
	public String email; 		 //이메일
	
}
