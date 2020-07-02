package com.killers;

public class Car extends Vehicle {
	Car(String typeOfVehicle) {
		super(typeOfVehicle);
		// TODO Auto-generated constructor stub

	}

	@Override
	public String vehicleGreetings() {
		// TODO Auto-generated method stub
		return "I'm a car and my type is: ".concat(getTypeOfVehicle());
	}

	private int numberOfDoors;
	private int numberOfWheels;
	private String brand;
	private String model;
	private int year;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
