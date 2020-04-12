package com.roger.work;

public class Passengerticket {

	public static void main(String[] args) {
		String userName = "Roger"; //乘机人
		String userId = "1234567";//身份证号码
		String flight = "B747";//航班号
		String date = "2020年4月10日";//出发时间
		String from = "上海虹桥国际机场";//出发的机场
		int BoardingGate = 11;//登机口信息
		int seatNumber = 18;//座位号信息
		
		System.out.println("姓名："+userName);
		System.out.println("身份证号："+userId);
		System.out.println("航班号："+flight);
		System.out.println("出发时间："+date);
		System.out.println("出发地："+from);
		System.out.println("登机口："+BoardingGate);
		System.out.println("座位号："+seatNumber);
	}

}
