package com;
import java.util.Random;

public class MoneyMoneyBank {
	
	public long accountNumber;
	public String accountHolderName;
	static Random rand = new Random();
	static int randomNumber = rand.nextInt(9000000) + 1000000;
	
	public double accountBalance;
	
	public MoneyMoneyBank( String accountHolderName,double initialBalance) {
		super();
		this.accountNumber = ++randomNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = initialBalance;
	}
	
	public static int getNextAccountNumber()
	{
		
		return randomNumber+1;
		
	}
	
	public void display()
	{
		System.out.print(this.accountNumber+"\n"+this.accountHolderName+"\n"+this.accountBalance);
	}
	
	public boolean withdraw(double amount)
	{
		if(this.accountBalance >= amount)
		{
			this.accountBalance=this.accountBalance-amount;
			return true;
		}
		else
		return false;
	}
	
	public boolean deposit(double amount)
	{
		this.accountBalance=this.accountBalance+amount;
		return true;
	}
	
}
