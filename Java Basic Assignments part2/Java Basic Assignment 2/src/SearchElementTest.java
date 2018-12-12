import static org.junit.Assert.*;

import org.junit.Test;


public class SearchElementTest {
	SearchElement newObject=new SearchElement();
	
	@Test
	public void testCasePositive() {
		int[] inputElements={5,4,5,4,6};
		
		boolean exists=newObject.searchPair(inputElements,2);
		assertTrue(exists);
	}
	
	@Test
	public void testCaseNegative() {
		int[] inputElements={5,4,9,3,6};
		
		boolean exists=newObject.searchPair(inputElements,2);
		assertFalse(exists);
	}

}
