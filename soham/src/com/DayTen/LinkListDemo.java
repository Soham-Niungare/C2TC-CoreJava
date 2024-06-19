package com.DayTen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		for(int i = 0; i < 3; i++) {
			list.add(i);
			list.add(i, i+1);
		}
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Object [] arr = list.toArray();
		System.out.println(list);
		
		System.out.println(Arrays.toString(arr));
		
		int arr1[][] = {{1,2,3,4},{2,5}}; 
		System.out.println(Arrays.deepToString(arr1));
		
		for (Object object : arr) {
			System.out.print(object + ", ");
		}
	}
}
