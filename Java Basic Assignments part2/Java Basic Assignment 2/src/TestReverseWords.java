import static org.junit.Assert.*;

import org.junit.Test;


public class TestReverseWords{

	ReverseWords newSentence=new ReverseWords();
	
	@Test
	public void testCasePositive() {
		
		String result=newSentence.findReverse("This is computer");
		String expected="sihT si retupmoc";
		System.out.println(result);
		assertEquals(result,expected);
	}

	@Test
	public void testCaseNegative() {
		
		String result=newSentence.findReverse("This is computer");
		String expected="sihT is retupmoc";
		System.out.println(result);
		assertNotEquals(result,expected);
	}
}
