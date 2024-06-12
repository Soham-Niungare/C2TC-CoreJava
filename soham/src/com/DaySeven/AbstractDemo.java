package com.DaySeven;

public class AbstractDemo {
	public static void main(String[] args) {
		Square s = new Square(10);
		s.calculateArea();
		s.display();
		
		Circle c = new Circle(5);
		c.calculateArea();
		c.display();
	}
}
