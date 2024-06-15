package com.DayNine;

import java.util.Collection;

public class Employee implements Comparable<Employee>{
	private String name;
	private int eid;
	private int salary;
	public Employee(String name, int eid, int salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.eid,o.eid);
	}
	
	
	
	
	
}
