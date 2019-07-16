package com.sri;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
	
	public static void main(String[] args) throws Exception {
		
		String fileName = "C:\\Users\\laksh\\eclipse-workspace\\BankAccountApp\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(fileName);
		List<Account> accounts = new LinkedList<>();
		
		for(String[] newAccountHolder: newAccountHolders) {
			String name = newAccountHolder[0];
			String ssn = newAccountHolder[1];
			String accountType = newAccountHolder[2];
			double initDeposit = Double.parseDouble(newAccountHolder[3]);
			
			if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));
			}
		}
		
		for(Account acc: accounts) {
			System.out.println("\n********************");
			acc.showInfo();
		}
		
	}
}
