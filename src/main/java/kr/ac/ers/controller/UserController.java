package kr.ac.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/user/main")
	public String ShowMain() {
		return "/user/main";
	}
}
