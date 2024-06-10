package com.day7;

public abstract class shape // we cannot create objects
{ 
	float area;
	String shapeName;
	
	abstract void calculateArea();  // abstract method (No Body)
	
	void display() // concrete method 
	{
		System.out.println("Area of this "+ shapeName +" is: " + area);
	}
}
