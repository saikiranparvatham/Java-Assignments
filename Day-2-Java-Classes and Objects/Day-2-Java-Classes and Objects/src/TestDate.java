import static org.junit.Assert.*;

import org.junit.Test;


public class TestDate {
	Date date1=new Date(4,5,2017);
	
	@Test
	public void testSmallMethod() {
		Date date2=new Date(2,5,2017);
		boolean result=date1.isSmaller(date2);
		System.out.println(result);
		assertTrue(result);
	}
	
	@Test
	public void testSmallMethodNegative() {
		Date date2=new Date(25,5,2017);
		boolean result=date1.isSmaller(date2);
		assertFalse(result);
	}

	@Test
	public void testDiffMethod() {
		Date date2=new Date(2,6,2016);
		int[] result=date1.diff(date2);
		for(int i=0;i<3;i++)
		System.out.print(result[i]+" ");
		
	}
}
