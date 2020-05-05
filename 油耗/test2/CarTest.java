package com.geekcc.test2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("大众", "帕萨特", 200000, 8, 400,60);//品牌,车型,价格,油耗,里程数,油箱容积
		RemainingOil c1 = new CarDaoImpl();
		System.out.println("价值"+car.getPrice()+"的"+car.getBrand()+car.getModel()+"加满油的情况下行驶了"+car.getMileage()+"公里,剩余油量为:"+c1.getRemianOil(car)+"升");
	
	}

}
