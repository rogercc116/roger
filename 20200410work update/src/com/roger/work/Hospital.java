package com.roger.work;
/**
 * 医院具体信息
 * @author Roger
 * @date   2020年4月12日
 */
public class Hospital {

	public static void main(String[] args) {
		String hospitalName = "昆山第一人民医院"; //医院名称
		String departMent = "外科";//科室
		double money = 300;//花费金额
		String inTime = "2020年4月11日";//就诊时间
		System.out.println("医院名称："+hospitalName);
		System.out.println("科室："+departMent);
		System.out.println("花费金额："+money+"元");
		System.out.println("就诊时间："+inTime);
	}

}
