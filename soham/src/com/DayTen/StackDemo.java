package com.DayTen;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		//push
		for(int i = 0; i < 5; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		//peek 
		System.out.println(stack.peek());
		
		//pop
		for(int i = 0; i < 5; i++) {
			System.out.println(stack.pop());
		}
		
	}
	
}
