package com.assignment_01;

public abstract class Account {
	abstract void deposit(double amount);
	
	abstract void withdraw(double amount);
	
	abstract double getBalance();
	
	void display() {
		System.out.println("Your Balance is : " + getBalance());
		System.out.println();
	}
}

class CheckingAccount extends Account{
	private double balance;

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Checking Account Section: ");
		balance += amount;
		System.out.println(amount + " deposited into checking account.");
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Checking Account Section: ");
		if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from checking account.");
        } else {
            System.out.println("Insufficient amount.");
        }
		
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	
}

class SavingsAccount extends Account{
	private double balance;

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Saving Account Section: ");
		balance += amount;
        System.out.println(amount + " deposited into savings account.");
		
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Saving Account Section: ");
		if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account.");
        } else {
            System.out.println("Insufficient amount.");
        }

		
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	
}