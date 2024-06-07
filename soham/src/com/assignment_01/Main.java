package com.assignment_01;

public class Main {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
		
		Transaction t = new Transaction(50);
		
		t.performDeposit(sa, 1000);
		sa.display();
		
		t.performDeposit(ca, 5000);
		ca.display();
		
		System.out.println("No. of Accounts: " + Bank.totalAccounts);
	}
}
