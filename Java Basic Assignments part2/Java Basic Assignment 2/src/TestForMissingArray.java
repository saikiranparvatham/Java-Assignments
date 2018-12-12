import static org.junit.Assert.*;

import org.junit.Test;


public class TestForMissingArray {

	FindMissingNumber newObject=new FindMissingNumber();
	@Test
	public void testCondition1() {
		int[] arrayOfNumbers={3,0,1};
		int missingNumber=newObject.findNumber(arrayOfNumbers);
		assertEquals(missingNumber,2);
	}

	@Test
	public void testCondition2() {
		int[] arrayOfNumbers={9,6,4,2,3,5,7,0,1};
		int missingNumber=newObject.findNumber(arrayOfNumbers);
		assertEquals(missingNumber,8);
	}
}
