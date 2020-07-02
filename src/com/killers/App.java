package com.killers;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Exotic");
		System.out.println(car.vehicleGreetings());
		PersonImp person = new PersonImp();
		person.setCellphone("44565679");
		person.setFirstName("Juan");
		person.setLastName("Pérez");
		System.out.println(person.getGreetings());
	}

}
