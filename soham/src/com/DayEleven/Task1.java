package com.DayEleven;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		for (int number : a) {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        }
	}
}
