package kr.ac.ers.controller;

import org.springframework.stereotype.Controller;

import kr.ac.ers.service.EmergencyService;

@Controller
public class EmergencyController {
	private EmergencyService emergencyService;
	
	public EmergencyController(EmergencyService emergencyService) {
		this.emergencyService = emergencyService;
	}
	
	
}
