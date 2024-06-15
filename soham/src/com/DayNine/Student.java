package com.DayNine;

public class Student {
	String name;
	String address;
	int id;
	float marks;
	

	public Student(String name, int id, String address, float marks) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + ", marks=" + marks + "]";
	}
}
