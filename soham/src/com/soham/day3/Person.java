package com.soham.day3;

public class Person {
	private String name;
	// This is called dependency injection
	private Address address;
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
