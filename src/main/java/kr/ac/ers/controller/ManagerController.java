package kr.ac.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.ers.dto.ManagerVO;
import kr.ac.ers.service.ManagerService;

@Controller
public class ManagerController {
	private ManagerService managerService;
	
	public ManagerController(ManagerService managerService) {
		this.managerService = managerService;
		
	}
	
	@RequestMapping("/ers/home/administration")
	public String show_administrationmain() {
		return "/manager/home/administration";
	}
	
	@RequestMapping("/ers/home/center")
	public String show_centermain() {
		return "/manager/home/center";
	}
	
	@RequestMapping("/ers/home/area")
	public String show_areamain() {
		return "/manager/home/area";
	}
	

	@RequestMapping("/ers/manager/join")
	public String show_join() {
		return "/manager/common/join";
	}
	
	
	@RequestMapping("/ers/manager/login")
	public String showlogin(String error) {
		return "/manager/common/login";
	}
	
	@PostMapping("/ers/manager/doLogin")
	public String execute(HttpServletRequest request, HttpServletResponse response,String id, String pwd, HttpSession session) throws Exception {
		String url = "";

		int result = managerService.login(id, pwd);
		switch (result) {
		case 0: //로그인 성공
			ManagerVO loginManager = managerService.getManager(id);
			String depart =loginManager.getDepart().substring(0, 2);
			
			
			if (depart.equals("행정")) {
				url="redirect:/ers/home/administration";
				
			}else if(depart.equals("중앙")) {
				url="redirect:/ers/home/center";
	
			}else {
				url="redirect:/ers/home/area";
			}
			
			session.setAttribute("loginManager", loginManager);
			session.setMaxInactiveInterval(60 * 6);
			
			break;
			
		case 1: //아이디 불일치
			url="redirect:/ers/manager/login?error=1";
			break;
		case 2: //패스워드 불일치
			url="redirect:/ers/manager/login?error=2";
			break;
		}

		return url;
	}
	
	
	@RequestMapping("/ers/manager/findid")
	public String showfind_id() {
		
		
		return "/manager/common/find_id";
	}
	
	@RequestMapping("/ers/manager/dofindid")
	public String find_id(String name, String phone, String email, String code) {
		
		
		return "/manager/common/find_id";
	}
	
	@RequestMapping("/ers/manager/findpw")
	public String find_pw() {
		return "/manager/common/find_pw";
	}

	@RequestMapping("/ers/manager/confirmid")
	public String confirm_id() {
		return "/manager/common/confirm_id";
	}
	
	@RequestMapping("/ers/manager/resetpw")
	public String reset_pw() {
		return "/manager/common/reset_pw";
	}
}