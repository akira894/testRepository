package com.labo.criteria.pattern;

public class Person {

	private String name;
	private Gender gender;
	private MaritalStatus maritalStatus;
	
	public Person(String name, Gender gender, MaritalStatus maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender.name() + ", maritalStatus=" + maritalStatus.name() + "]";
	}	
	
}
