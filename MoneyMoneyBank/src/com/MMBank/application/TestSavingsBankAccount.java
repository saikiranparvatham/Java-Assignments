package com.MMBank.application;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestSavingsBankAccount {
	
	MMSavingAccount newObject = new MMSavingAccount(10002,"Ramesh kumar", 3000,true);
	MMCurrentAccount customer2 = new MMCurrentAccount(10003,"Suresh Yadav",200, 400);
	
	@Test
	public void test1() {
		
		newObject.withDraw(500);
		assertEquals(2500,newObject.getAccountBalance(),0.01);
	}
		

	@Test
	public void test2() {
		
		boolean result = newObject.withDraw(15000);
		assertFalse(result);
	}
	
	@Test
	public void test3() {
		
		boolean result = newObject.withDraw(100);
		assertTrue(result);
	}
	
	@Test
	public void test4()
	{
		boolean result = customer2.withDraw(2000);
		assertFalse(result);
	}
	
	@Test
	public void test5()
	{
		boolean result = customer2.withDraw(100);
		assertTrue(result);
	}
	
	
	}
