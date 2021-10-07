package org.egitim.entity;

import java.time.LocalDate;


import org.springframework.stereotype.Component;

@Component
public class Cast {

	private String name;
	private String lastName;
	private LocalDate birthdate;
	
	public Cast() {}
	
	
	public Cast(String name, String lastName, LocalDate birthdate) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	

}
