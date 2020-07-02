package com.killers;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonImp implements Person {
	
	@NotNull
	@Size(min=2, message="* Required")
	private String firstName;
	
	@NotNull
	@Size(min=2, message="* Required")
	private String lastName;
	private String email;
	private String cellphone;
	private String size;
	private String password;
	private String gender;
	private String languages;
	private String preferredConsole;
	
	@Override
	public String getGreetings() {
		// TODO Auto-generated method stub
		return "Welcome, my Name is: ".concat(firstName).concat(" ").concat(lastName)
				.concat(" and I'm Welcome that you are here");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLanguages() {
		return languages;
	}
	
	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getPreferredConsole() {
		return preferredConsole;
	}

	public void setPreferredConsole(String preferredConsole) {
		this.preferredConsole = preferredConsole;
	}
}
