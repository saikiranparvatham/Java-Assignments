package com.MMBank.application;

public abstract interface BankFactory {
	
	public SavingAccount getNewSavingAcc(int AccountNumber,String accountHolderName,double accountBalance,boolean isSalaried);
	
	public CurrentAccount getNewCurrentAccount(int accountNumber, String accountHolderName, double accountBalance,double creditLimit);
}