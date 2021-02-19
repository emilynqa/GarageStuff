package com.qa.garage;

public class Car extends Vehicle {

	private int goFasterStripes;

	public Car(int id, String make, String colour, int wheels, String engine, int goFasterStripes) {
		super(id, make, colour, wheels, engine);
		this.setGoFasterStripes(goFasterStripes);

	}

	public int getGoFasterStripes() {
		return goFasterStripes;
	}

	public void setGoFasterStripes(int goFasterStripes) {
		this.goFasterStripes = goFasterStripes;
	}

	@Override
	public String getBill() {
		int bill = getGoFasterStripes() * 10;
		return ". The car bill is £" + bill;

	}

}
