package com.day7;

public abstract class shape // we cannot create objects
{ 
	float area;
	
	abstract void calculateArea();  // abstract method (No Body)
	
	void display() // concrete method 
	{
		System.out.println("Area of this Shape is: " + area);
	}
}
