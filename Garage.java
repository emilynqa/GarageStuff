package com.qa.garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garageList = new ArrayList<>();

	public Garage() {
		super();
		this.garageList = new ArrayList<Vehicle>();
	}

	public void addVehicle(Vehicle vehicle) {
		this.garageList.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.garageList.remove(vehicle);
	}

	public ArrayList<Vehicle> getGarageList() {
		return garageList;
	}

	public void setGarageList(ArrayList<Vehicle> garageList) {
		this.garageList = garageList;
	}

	public void printVehicles() {
		for (Vehicle vehicle : garageList) {
			vehicle.print();
		}
	}

	public void printVehicleBill() {
		for (Vehicle vehicle : garageList) {
			vehicle.printBill();
		}
	}

}
