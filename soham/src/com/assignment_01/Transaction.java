package com.assignment_01;

public class Transaction {
	private final double transactionFee;
	
	
	public Transaction(double transactionFee) {
		super();
		this.transactionFee = transactionFee;
	}

	public final void performDeposit(Account account, double amount) {
        double totalAmount = amount - transactionFee;
        account.deposit(amount);
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("Amount deposited after fee: " + totalAmount);
    }

	public final void performWithdrawal(Account account, double amount) {
	        double totalAmount = amount + transactionFee;
	        account.withdraw(amount);
	        System.out.println("Transaction fee: " + transactionFee);
	        System.out.println("Amount withdrawn including fee: " + totalAmount);
	}
	

	
}