package kr.ac.ers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.ers.repository.EmergencyMapper;

@Service
public class EmergencyService {
	@Autowired
	private EmergencyMapper emergencyMapper;
	
	
	public void occurEmergency(String stype, String id) {
		int scode = emergencyMapper.emergency_seq();
		
		emergencyMapper.insertEmergency(scode, stype, id);
		
	}
	
}
