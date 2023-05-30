package kr.ac.ers.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MachineVO{
	public int mnum;
	public String mstatus;
	public Date regdate;
	public Date assend;
	public Date changedate;
	public String changestatus;
	public String mcode;
	public int cunm;
	public String id;
	public String lnum;
}
