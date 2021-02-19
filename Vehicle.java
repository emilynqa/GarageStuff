package com.qa.garage;

public abstract class Vehicle {

	private int id;
	private String make;
	private String colour;
	private int wheels;
	private String engine;

	public abstract String getBill();

	public Vehicle(int id, String make, String colour, int wheels, String engine) {
		super();
		this.id = id;
		this.make = make;
		this.colour = colour;
		this.wheels = wheels;
		this.engine = engine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void print() {
		System.out.println("Vehicle ID: " + this.getId() + ". Make: " + this.getMake() + ". Colour: " + this.getColour()
				+ ". Number of Wheels: " + this.getWheels() + ". Type of Engine: " + this.getEngine() + this.getBill());
	}

	public void printBill() {
		System.out.println("Vehicle ID: " + this.getId() + this.getBill());
	}

}
