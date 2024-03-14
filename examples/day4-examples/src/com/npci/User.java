package com.npci;

import java.time.LocalDate;
import java.util.Objects;

public class User implements Comparable<User>{
	// id, name, dob
	private int id;
	private String name;
	private LocalDate dob;
	// generate constructors, toString, setters, getters
	public User(int id, String name, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id; // compares 2 objects id and returns boolean
	}
	@Override
	public int compareTo(User o) {
		return Integer.compare(id, o.getId());
	}
	// Integer.compare(2, 2): 0
	// Integer.compare(5, 4): +ve
	// Integer.compare(5, 6): -ve
	
}
