package kr.ac.ers.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SensorckVO {
	public String id;
	public String outconfirm;
	public Date outtime;
	public Date activetime;
}
