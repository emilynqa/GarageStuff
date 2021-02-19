package com.qa.garage;

public class Bus extends Vehicle {

	private int passengers;

	public Bus(int id, String make, String colour, int wheels, String engine, int passengers) {
		super(id, make, colour, wheels, engine);
		this.setPassengers(passengers);

	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public String getBill() {
		int bill = getPassengers() * 12;
		return ". Your bus bill is £" + bill;

	}

}
