import static org.junit.Assert.*;

import org.junit.Test;


public class TestForPalindrome {
	PalindromeList newPalindrome=new PalindromeList();
	@Test
	public void testCasePositive() {
		
		boolean result=newPalindrome.findPalindrome(12321);
		assertTrue(result);
	}
	@Test
	public void testCaseNegative() {
		
		boolean result=newPalindrome.findPalindrome(123456);
		assertFalse(result);
	}
	
	@Test
	public void testCasePositive2() {
		
		boolean result=newPalindrome.findPalindrome(121);
		assertTrue(result);
	}

	@Test
	public void testCaseNegative2() {
		
		boolean result=newPalindrome.findPalindrome(10);
		assertFalse(result);
	}
}
