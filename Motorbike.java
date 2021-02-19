package com.qa.garage;

public class Motorbike extends Vehicle {

	private String coolMods;

	public Motorbike(int id, String make, String colour, int wheels, String engine, String coolMods) {
		super(id, make, colour, wheels, engine);
		this.setCoolMods(coolMods);

	}

	public String getCoolMods() {
		return coolMods;
	}

	public void setCoolMods(String coolMods) {
		this.coolMods = coolMods;
	}

	@Override
	public String getBill() {
		if (getEngine() == "Electric") {
			return ". You've got an electric engine, your bill is nothing!";
		}

		else if (getEngine() == "Diesel") {
			return ". Diesel engine eh? Heck you, and your hatred for the environment, your bill is £9,000!";
		}

		else if (getEngine() == "Petrol") {
			return ". Eh, it could be worse, your bill is £400";
		} else {
			return ". Yo you've got a whack engine there mate, try again?";
		}

	}
}
