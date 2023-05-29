package kr.ac.ers.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmergencyVO {
	public int scode;  			//상황코드
	public String stype; 		//상태구분
	public Date occurtime; 		//발생시간
	public String confirmcheck; //확인여부
	public String reportcheck; 	//처리구분
	public String id; 			//회원등록번호
	public String wid;  		//응급아이디
}
