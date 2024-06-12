package com.DayThree;

public class Address {
	private String street;
	private String landmark;
	private String city;
	private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String landmark, String city, int pincode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
