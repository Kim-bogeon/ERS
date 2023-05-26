package kr.ac.ers.service;

import org.springframework.stereotype.Service;

import kr.ac.ers.repository.EmergencyMapper;

@Service
public class EmergencyService {
	private EmergencyMapper emergencyMapper;
	
	
	public EmergencyService(EmergencyMapper emergencyMapper) {
		this.emergencyMapper=emergencyMapper;
	}
	
	
	public void occurEmergency(String stype, String id) {
		int scode = emergencyMapper.emergency_seq();
		
		emergencyMapper.insertEmergency(scode, stype, id);
		
	}
	
}
