import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestMoneyMoneyBank {
	
	
	MoneyMoneyBank customer1 = new MoneyMoneyBank("Ramesh kumar",300);

	@Test
	public void testDeposit()
	{
		
		boolean result=customer1.deposit(25000);
		assertTrue(result);
	}
	@Test
	public void testDetails() {
		customer1.display();
	}
	
	@Test
	public void testWithdraw()
	{
		boolean result=customer1.withdraw(50);
		assertTrue(result);
	}
	
}