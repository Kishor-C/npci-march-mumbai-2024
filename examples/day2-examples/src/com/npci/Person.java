package com.npci;

public class Person {
	private String name;
	private String gender;
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	// Getters & Setters -> Right Click -> Source -> Generate Setters & Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	// display method that prints name & gender
	public void display() {
		System.out.println("---- Person Details ------");
		System.out.println("Name = "+name+", Gender = "+gender);
	}
}
