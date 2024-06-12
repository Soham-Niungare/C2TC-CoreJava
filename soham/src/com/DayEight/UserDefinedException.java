package com.DayEight;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] args) throws CantVote {
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.println("Enter Your Name: ");
		age = scanner.nextInt();
		scanner.close();
		if(age < 18) {
			throw new CantVote("You are under age.");
		}
		else {
			System.out.println("You can vote");
		}
	}
}
class CantVote extends FileNotFoundException{
	public CantVote(String a) {
		super(a);
	}
}