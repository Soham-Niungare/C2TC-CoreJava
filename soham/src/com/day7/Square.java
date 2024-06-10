package com.day7;

public class Square extends shape{

	float side;
	static String name = "Square";

	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area = side*side;
		super.shapeName = name;
	}
	
}
