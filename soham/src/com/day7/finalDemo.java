package com.day7;

public class finalDemo {
	public static void main(String[] args) {
		final float pi = 3.14f;
		System.out.println(pi);
		Child obj = new Child();
		obj.marry();
		obj.property();
	}
	
}
// if final keyword is used inheritance throws error
/*final */class Parent {
	void property() {
		System.out.println("Sea Side Bungloo");
	}
	void marry() {
		System.out.println("Shri Lata");
	}
}

class Child extends Parent {
	void marry() {
		System.out.println("alia");
	}
	
}
