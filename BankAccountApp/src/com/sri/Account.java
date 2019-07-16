package com.sri;

public abstract class Account implements IRate{
	private String name;
	protected String accountNumber;
	private String ssn;
	private double balance;
	protected double rate;
	private static int index = 10000;
	
public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		this.accountNumber = setAccountNumber();
		index++;
		setRate();
	}	

public abstract void setRate();

public String setAccountNumber() {
	String lastTwoSSN = ssn.substring(ssn.length() - 2);
	int uniqueID = index;
	int randomNumber = (int) (Math.random() * Math.pow(10, 3));
	accountNumber = lastTwoSSN + uniqueID + randomNumber;
	return accountNumber;
	}

public void deposit(double amount) throws Exception {
	if(amount >= 0) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
	}
	else {
		throw new Exception ("\nCannot perform the action!\nPlease enter valid amount");
	}
}

public void withdraw(double amount) throws Exception {
	if(amount >= 0) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
	}
	else {
		throw new Exception ("\nCannot perform the action!\nPlease enter valid amount");
	}
}

public void transfer(double amount, String toWhere) {
	balance = balance - amount;
	System.out.println("Transfering $" + amount + " to " + toWhere);
}

public void printBalance() {
	System.out.println("Balance in the account " + accountNumber + " is: " + balance);
}

public void showInfo() {
	System.out.println("NAME: " + name 
			+ "\nSSN: " + ssn 
			+ "\nBALANCE: " + balance
			+ "\nACCOUNT NUMBER: " + accountNumber
			+ "\nRATE: " + rate + "%"
			);
	}
}
