package com.killers;

public class PersonImp implements Person {
	private String firstName;
	private String lastName;
	private String address;
	private String cellphone;
	private String size;
	private int id;

	@Override
	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Welcome, my Name is: ".concat(firstName).concat(" ").concat(lastName)
				.concat(" and I'm Welcome that you are here");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
