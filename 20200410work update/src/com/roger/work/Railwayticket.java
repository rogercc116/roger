package com.roger.work;
/**
 * 火车票具体信息
 * @author Roger
 * @date   2020年4月12日
 */
public class Railwayticket {

	public static void main(String[] args) {
		
		String userName = "Roger"; //姓名
		int userId = 123456789;//身份证号
		String trainNumber = "Z326";//车次
		String date = "2020/4/10";//出发日期
		String from = "昆山";//出发地点
		String seat = "6车18号";//座位号
		
		System.out.println("姓名："+userName);
		System.out.println("身份证号："+userId);
		System.out.println("车次："+trainNumber);
		System.out.println("出发时间："+date);
		System.out.println("出发地："+from);
		System.out.println("座位号："+seat);
	}

}
