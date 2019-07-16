package com.sri;

public class Checking extends Account{
	private int debitCardNumber;
	private int debitCardPin;
	
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;	
	}
	
	public void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(" Checking Account Features:");
		System.out.println(" Debit Card Number: " + debitCardNumber
				+ "\n Debit Card Pin: " + debitCardPin);
	}

}
