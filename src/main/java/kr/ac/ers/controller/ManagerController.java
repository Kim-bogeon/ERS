package kr.ac.ers.controller;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.ac.ers.dto.ManagerVO;
import kr.ac.ers.service.ManagerService;
import kr.ac.ers.utils.MailContentSend;

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
	
	@RequestMapping("/ers/manager/dojoin")
	public String show_dojoin(ManagerVO manager) {
		
		managerService.join(manager);
		
		return "redirect:/ers/manager/login";
	}
	
	@ResponseBody
	@RequestMapping("/ers/manager/idCheck")
	public int idCheck(ManagerVO manager){
		int result = managerService.overlappedID(manager); // 중복확인한 값을 int로 받음
		return result;
	}
	
	@ResponseBody
	@RequestMapping("/ers/manager/sendMail")
	public String sendMail(String email, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("이메일 인증 요청이 들어옴!");
		System.out.println("이메일 인증 이메일 : " + email);
		
		 int number = new Random().nextInt(1000000) + 100000;
	      if(number >= 1000000) number -= 100000;
	      
	      
	      String mailSet_Server="smtp.naver.com"; // 보내는 메일 server
	      String mailSet_ID="posoii@naver.com";        // 보내는 메일 ID
	      String mailSet_PW="rlfls001109";        // 보내는 메일 비밀번호
	      
	      String mailFromName ="ERS";            // 보내는 사람 이름
	      String mailFromAddress ="<posoii@naver.com>"; // 보내는 메일 주소
	      
	      String mailTo   = request.getParameter("email");           // 받는  메일 주소
	      String mailTitle ="응급안전안심서비스에서 회원가입 확인";   // 메일 제목
	      String content = "인증번호는 " + number + "입니다 하트♥"; // 메일내용
	      
	      String mailFrom="";
	      try {
	          mailFrom =new String(mailFromName.getBytes("utf-8"), "8859_1")+mailFromAddress;
	      } catch (UnsupportedEncodingException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      MailContentSend ms = new MailContentSend();
	      ms.setMail(mailSet_Server, mailSet_ID, mailSet_PW);
	      try { 
	         ms.sendMail(mailFrom,mailTo, mailTitle, content);
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }

	      
	      return Integer.toString(number);

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