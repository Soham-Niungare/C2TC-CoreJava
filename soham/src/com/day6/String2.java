package com.day6;

public class String2 {

	public static void main(String[] args) {
//		String s = "Soham ";
//		s = s.concat("Niungare ");
//		s=s+"Esha ";//Operator Overloading
//		s+="The Great";
//		System.out.println(s);
		String a = "Arya";
		int b = 10, c = 20, d = 30;
		System.out.println(a + b + c + d);
		System.out.println(b + c + d + a);
		System.out.println(b + c + a + d);
		System.out.println(b + a + c + d);
		char[] x = a.toCharArray();
		String y = new String(x);
	}

}