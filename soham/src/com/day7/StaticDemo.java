package com.day7;

public class StaticDemo {
	static int serialNo;
	int section;
	
	static 
	{
		System.out.println("I am a Static block.");
		serialNo = 1000;
	}
	
	public StaticDemo() {
		System.out.println("I am default constructor block");
		section++;
		serialNo++;
	}

	@Override
	public String toString() {
		return "StaticDemo [section= " + section +  ", serialNo- " + serialNo +"]";
		
	}
	
	
	
}
