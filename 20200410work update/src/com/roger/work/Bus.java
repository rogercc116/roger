package com.roger.work;
/**
 *  公交车具体信息
 * @author Roger
 * @date   2020年4月12日
 */
public class Bus {

	public static void main(String[] args) {
		String passEnger = "Roger"; //乘客姓名
		String licensePlate = "苏E0023";//车辆车牌号码
		double money = 3.5;//票价
		String from = "昆山汽车站";//出发地
		double time = 1.5;//路途所用时间单位 h
		String busName="111路";//车辆名称
		System.out.println(passEnger+"乘坐"+busName+"从"+from+"车牌是"+licensePlate+"花了"+money+"元"+",用时"+time+"H");
	}

}
