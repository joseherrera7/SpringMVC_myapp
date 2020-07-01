package com.killers;

public abstract class Vehicle {
	Vehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	private String typeOfVehicle;

	public abstract String vehicleGreetings();
}
