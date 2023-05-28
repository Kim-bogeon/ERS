package kr.ac.ers.service;

import org.springframework.stereotype.Service;

import kr.ac.ers.repository.SensorckMapper;

@Service
public class SensorckService {
	private SensorckMapper sensorckMapper;
	
	public SensorckService(SensorckMapper sensorckMapper) {
		this.sensorckMapper=sensorckMapper;
	}
	
	public void insertOutSensor(String id, String outconfirm, String outtime) {
		sensorckMapper.insertOutSensor(id, outconfirm, outtime);
	}
	
	public void insertActiveTime(String  id, String activetime) {
		sensorckMapper.insertActiveTime(id, activetime);
	}
	
}
