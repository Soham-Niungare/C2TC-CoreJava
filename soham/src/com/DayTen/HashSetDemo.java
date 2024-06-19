package com.DayTen;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet <ArrayList> hash = new HashSet<ArrayList>();
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList list3 = new ArrayList();
		
		list1.add(1);
//		list1.add(2); 	
		list1.add("Soham");
		
		list2.add(1);
		list2.add(2);
		list2.add("Soham");
		
		list3.add(1);
		list3.add(2);
		list3.add("soham");
		
		hash.add(list1);
		hash.add(list2);
		hash.add(list3);
		
		System.out.println(hash.size());
		
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("India");
        h.add("South Africa");
        h.add("Australia");
        h.add("USA");

        // Adding duplicate elements
        System.out.println(h);
	}
}
