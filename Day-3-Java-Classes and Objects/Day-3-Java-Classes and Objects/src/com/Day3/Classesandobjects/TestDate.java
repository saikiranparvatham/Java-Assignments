package com.Day3.Classesandobjects;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestDate {
	Date date1 = new Date(21,5,1998);
	Date date2 = new Date(16,9,2011);
	@Test
	public void testToString() {
		String result = date1.toStRing();
		assertEquals(result,"21/05/1998");
	}
	
	@Test
	public void testIsSmaller()
	{
		boolean result = date1.isSmaller(date2);
		assertEquals(result,true);
	}
	
	@Test
	public void testDiff()
	{
		int[] result=date1.diff(date2);
		int expected[]={26,3,13};
		assertArrayEquals(result,expected);
	}

}