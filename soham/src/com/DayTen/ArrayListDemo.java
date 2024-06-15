package com.DayTen;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
//		method 1:
		ArrayList al = new ArrayList();
//		method 2:
//		List l = new ArrayList();
			
		System.out.println(al.size());
		al.add("Soham");
		al.add(123456);
		al.add(21);
		al.add("Vikhroli");
		
		System.out.println(al);
		
		al.add(2, "Sleeping");
		
		System.out.println(al);
		
		System.out.println(al.isEmpty());;
		
//		Generics --> to provide type safety to collections object
		
		ArrayList <String> heroName = new ArrayList <String>();
		heroName.add("BatMan");
		heroName.add("SuperMan");
//		heroName.add(123);
	}
}
