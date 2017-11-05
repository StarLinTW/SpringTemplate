package com.bean;

public class PlaneFlight {
	private String start;
	private String end;
	private String num;
	
	public PlaneFlight(String start, String end, String num) {
		super();
		this.start = start;
		this.end = end;
		this.num = num;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
}
