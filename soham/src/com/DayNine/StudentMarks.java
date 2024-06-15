package com.DayNine;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Float.compare(o1.getMarks(), o2.getMarks());
	}
	
}
