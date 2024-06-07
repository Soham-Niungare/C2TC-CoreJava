package com.day7;

public class Square extends shape{

	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area = side*side;
		
	}
	
}
