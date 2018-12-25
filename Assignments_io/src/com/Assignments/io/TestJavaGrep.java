package com.Assignments.io;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestJavaGrep {
	JavaGrep newObject = new JavaGrep();
	
	@Test
	public void testPatternMatch() throws Exception {
		
		List<String> result = newObject.patternMatch("C:/New folder/New Text Document.txt",".*line2.*");
		List<String> expected = new ArrayList<>();
		expected.add("this is line2 at line number 2");
		
		assertEquals(expected,result);
	}
	
}
