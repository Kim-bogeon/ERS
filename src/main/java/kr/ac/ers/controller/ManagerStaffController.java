package kr.ac.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerStaffController {
	@RequestMapping("/manager/staff/main")
	public String staffMain() {
		return "/manager/staff/main";
	}
	
	@GetMapping("/manager/staff/detail")
	public String staffDetail() {
		return "manager/staff/detail2";
	}
	
	@GetMapping("/manager/staff/regist")
	public String staffRegist() {
		return "manager/staff/regist2";
	}
}
