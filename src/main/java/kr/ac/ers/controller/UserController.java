package kr.ac.ers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import kr.ac.ers.dto.MemberVO;
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
		emergencyService.occurEmergency(user.getId(), stype);
		
	}
	
	@RequestMapping("/ers/user/OutSensor")
	@ResponseBody
	public void OutSensor(HttpSession session, String  id, String outconfirm, @DateTimeFormat(pattern = "yyyy-MM-dd") String outtime) {
		String url ="redirect:/ers/manager/datail?id="+id;
		MemberVO user  = (MemberVO)session.getAttribute("user"); 
		System.out.println(outconfirm);
		System.out.println(outtime);
		sensorckService.insertOutSensor(user.getId(), outconfirm, outtime);
		

	}
	
	@RequestMapping("/ers/user/ActiveTime")
	@ResponseBody
	public void ActiveTime(HttpSession session, String  id, String activetime) {
		
		MemberVO user  = (MemberVO)session.getAttribute("user"); 
		System.out.println(activetime);
		sensorckService.insertActiveTime(user.getId(), activetime);
		
	}
}
