package com.geekcc.test2;

public class Car {
	private String brand;//品牌
	private String model;//车型
	private int price;//价格
	private int fuel;//油耗
	private int Mileage;//里程数
	private int tankvolume;//油箱容积
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public int getTankvolume() {
		return tankvolume;
	}
	public void setTankvolume(int tankvolume) {
		this.tankvolume = tankvolume;
	}
	public Car() {}
	public Car(String brand, String model, int price, int fuel, int Mileage, int tankvolume) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.fuel = fuel;
		this.Mileage = Mileage;
		this.tankvolume = tankvolume;
	}
	
}
