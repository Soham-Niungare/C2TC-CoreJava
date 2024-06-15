package com.DayNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExecutor {
	public static void main(String[] args) {
		List <Student> students = new ArrayList<Student>();
		students.add(new Student("Soham", 37, "Vikhroli", 100));
		students.add(new Student("Priya", 25, "Bandra", 85));
		students.add(new Student("Rohan", 18, "Andheri", 90));
		students.add(new Student("Kavita", 22, "Goregaon", 78));
		students.add(new Student("Yash", 30, "Powai", 95));
		
		System.out.println("Studnet List: ");
		students.forEach(System.out::println);
		
		System.out.println("Sort by Name: ");
		Collections.sort(students, new StudentName());
		students.forEach(System.out::println);
		
		System.out.println("Sort by ID: ");
		Collections.sort(students, new StudentId());
		students.forEach(System.out::println);
		
		System.out.println("Sort by Address: ");
		Collections.sort(students, new StudentAddress());
		students.forEach(System.out::println);
		
		System.out.println("Sort by Marks: ");
		Collections.sort(students, new StudentMarks());
		students.forEach(System.out::println);
	}
}
