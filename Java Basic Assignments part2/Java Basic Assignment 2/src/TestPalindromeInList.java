import static org.junit.Assert.*;



import org.junit.Test;


public class TestPalindromeInList {
	PalindromeInList newObject=new PalindromeInList();
	String[] input={"abc","bgfhhj","ftghdtg","fghf","aba"};
	
	@Test
	public void testPositive() {
		String result=newObject.findPalindrome(input);
		assertEquals(result,"baa");
	}
	
	@Test
	public void testNegative() {
		String result=newObject.findPalindrome(input);
		assertNotEquals(result,"aba");
	}

}
