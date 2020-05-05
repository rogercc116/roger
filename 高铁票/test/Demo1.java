package com.geekcc.test;

public class Demo1 {

	private String startingstation;//起点站
	private String Terminus;//终点站
	private String trainnumber;//列车车次
	private String seatType;//座位类型
	public String getStartingstation() {
		return startingstation;
	}
	public void setStartingstation(String startingstation) {
		this.startingstation = startingstation;
	}
	public String getTerminus() {
		return Terminus;
	}
	public void setTerminus(String terminus) {
		Terminus = terminus;
	}
	public String getTrainnumber() {
		return trainnumber;
	}
	public void setTrainnumber(String trainnumber) {
		this.trainnumber = trainnumber;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	//构造方法
	public Demo1() {
	}
	public void Train(String startingstation, String Terminus) {
		this.startingstation = startingstation;
		this.Terminus = Terminus;
	}
	public Demo1(String startingstation, String Terminus, String trainnumber) {
		this.startingstation = startingstation;
		this.Terminus = Terminus;
		this.trainnumber = trainnumber;
	}
	public Demo1(String startingstation, String Terminus, String trainnumber, String seatType) {
		super();
		this.startingstation = startingstation;
		this.Terminus = Terminus;
		this.trainnumber = trainnumber;
		this.seatType = seatType;
	}

}
