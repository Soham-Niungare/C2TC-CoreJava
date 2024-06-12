package com.DayEight;

public class ExceptionDemo {

	public static void main(String[] args) {
		int arr[];
		arr = new int[] {10,20,30,40};
		
		try {
			System.out.println(arr[7]);
		}
		catch(Exception a) {
			System.out.println(a.getMessage());
			System.err.println(a.getMessage());
		}
		
		finally {
			System.out.println("i will Execute");
		}
	}
}
