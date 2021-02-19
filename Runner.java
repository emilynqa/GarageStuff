package com.qa.garage;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car(1, "Tesla", "Black", 4, "Electric", 5);
		Car car2 = new Car(2, "Delorean", "Grey", 4, "Petrol", 44);
		Motorbike motorbike1 = new Motorbike(3, "Harley", "Black", 2, "Petrol", "Flux capacitor");
		Motorbike motorbike2 = new Motorbike(4, "Honda", "Red", 2, "Electric", "Sidecar");
		Bus bus1 = new Bus(5, "Magic", "Yellow", 6, "Diesel", 70);
		Bus bus2 = new Bus(6, "Extra Magic", "Blue", 8, "Petrol", 88);

		Garage garage = new Garage();

		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(motorbike1);
		garage.addVehicle(motorbike2);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);

		garage.printVehicles();

		garage.printVehicleBill();

	}

}

//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, 
//depending on the type of Vehicle it is (this does not need to be complex).

//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle 
//(which calculates the bill) and to empty the Garage.

//Garage should have a method to remove multiple Vehicles by their type.