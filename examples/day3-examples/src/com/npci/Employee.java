package com.npci;

public class Employee {
	private int id;
	private String name;
	// generate constructor, setters, getters, toString
	// Right click -> source -> generate constructor, toString, getters & setters
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
}
