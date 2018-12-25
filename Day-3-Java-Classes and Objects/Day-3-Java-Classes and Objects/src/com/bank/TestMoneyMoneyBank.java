package com.bank;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;

public class TestMoneyMoneyBank {
	
	
	static MoneyMoneyBank customer1 = new MoneyMoneyBank("Ramesh kumar",300);

	@Test
	public void testDeposit()
	{
		
		boolean result=customer1.deposit(25000);
		assertTrue(result);
	}
	
	@AfterClass
	public static void testDetails() {
		customer1.display();
	}
	
	@Test
	public void testWithdraw()
	{
		boolean result=customer1.withdraw(50);
		assertTrue(result);
	}
	
	@Test
	public void testNextAccountNumber()
	{
		int result = MoneyMoneyBank.getNextAccountNumber();
		System.out.println(result);
	}

}
