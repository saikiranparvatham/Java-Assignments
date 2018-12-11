import static org.junit.Assert.*;

import org.junit.Test;


public class testForPalindrome {

	@Test
	public void test() {
		PalindromeList newPalindrome=new PalindromeList();
		boolean result=newPalindrome.findPalindrome(12321);
		assertTrue(result);
	}
	

}
