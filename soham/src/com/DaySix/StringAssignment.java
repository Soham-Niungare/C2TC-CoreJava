package com.DaySix;

public class StringAssignment {
	public static void main(String[] args) {
		String a = new String("Soham");
		String b = "Niungare";
		String c = "";
		String d = " ";
		String name = a.concat(" " + b);
		System.out.println(name);

//		Returns the character at the specified index (position)
		System.out.println(name.charAt(0));// char

//		Returns the Unicode of the character at the specified index
		System.out.println(name.codePointAt(0));// int

//		Returns the Unicode of the character before the specified index
		System.out.println(name.codePointBefore(1));

//		Returns the length of a specified string
		System.out.println(name.length());// int

//		Returns the number of Unicode values found in a string.
		System.out.println(name.codePointCount(6, 13));

//		Returns a new character sequence that is a subsequence of this sequence
		System.out.println(name.substring(6, 13));// String

//		Checks whether a string contains a sequence of characters
		System.out.println(name.contains(a));// boolean

//		Returns the hash code of a string
		System.out.println(name.hashCode());// int

//		Returns the position of the first found occurrence of specified characters in a string
		System.out.println(name.indexOf(b));

//		Returns the canonical representation for the string object
		System.out.println(name.intern());

//		Checks whether a string is empty or not
		System.out.println(name.isEmpty());

//		
		System.out.println(c.isBlank());

		System.out.println(d +" is blank " + d.isBlank());

		System.out.println(d.isBlank());

		System.out.println();

	}

}
