package kr.ac.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerStaffController {
	@RequestMapping("/manager/staff/main")
	public String staffMain() {
		return "/manager/staff/main";
	}
}
