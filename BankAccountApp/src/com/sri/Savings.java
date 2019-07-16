package com.sri;

public class Savings extends Account {
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	public void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println(" Savings Account Features: ");
		System.out.println(" Safety Deposit Box ID: " + safetyDepositBoxId
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

}
