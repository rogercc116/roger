package com.geekcc.test2;

public class CarDaoImpl implements RemainingOil {

	public int getRemianOil(Car car) {
		int remainOil = car.getTankvolume();
		double kilomRe =(car.getMileage()/100)*car.getFuel();
	    remainOil=(int)(remainOil- kilomRe);
		return remainOil;
}
}
