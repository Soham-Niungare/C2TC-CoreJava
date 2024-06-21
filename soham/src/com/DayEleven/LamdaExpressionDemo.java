package com.DayEleven;

import java.util.ArrayList;

public class LamdaExpressionDemo {
	public static void main(String[] args) {
		Message m1 = (name)-> {
			System.out.println("Hello "+name);
		};
		m1.greet("Soham");
		
		Cube c = (a) -> {
			return a*a*a;
		};
		System.out.println(c.calculate(3));
		
	}
}
