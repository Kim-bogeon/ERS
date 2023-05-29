package kr.ac.ers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import kr.ac.ers.dto.MemberVO;
import kr.ac.ers.dto.SensorckVO;
import kr.ac.ers.service.EmergencyService;
import kr.ac.ers.service.MemberService;
import kr.ac.ers.service.SensorckService;

@Controller
public class UserController {
	@Autowired
	private EmergencyService emergencyService;
	@Autowired
	private MemberService memberService;
	@Autowired
	private SensorckService sensorckService;
	
	@RequestMapping("/ers/user/main")
	public String ShowMain(HttpSession session) {
		
		MemberVO user = memberService.getMember(1);
				session.setAttribute("user", user);
		
		return "/user/main";
	}
	
	@RequestMapping("/ers/user/occurEmergency")
	@ResponseBody
	public void occurEmergency(HttpSession session, String  id, String stype) {
		
		MemberVO user  = (MemberVO)session.getAttribute("user"); 
		System.out.println(stype);
		System.out.println(user.getId());
		emergencyService.occurEmergency(stype,user.getId());
	}
	
	
	@RequestMapping("/ers/user/getChangeOutConfirm")
	@ResponseBody
	public SensorckVO getChangeOutConfirm(HttpSession session, String id) {
		MemberVO user = memberService.getMember(1);
		session.setAttribute("user", user);
		user  = (MemberVO)session.getAttribute("user");
		id = user.getId();
		return sensorckService.modifyMemberstasus(id);
		
	}
}
