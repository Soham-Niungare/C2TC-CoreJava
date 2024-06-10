package com.day7;

public class Circle extends shape{
	
	static float pi = 3.14f;
	static String name = "Circle";
	float r;
	
	public Circle(float r) {
		super();
		this.r = r;
	}
	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area = pi * (r * r);
		super.shapeName = name;
	}
	
	
}
