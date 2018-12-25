package com.Assignments.io;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestFileExistOrNot {

	FileExistOrNot newObject = new FileExistOrNot();     // creating the FileExistsOrNot object to use in the test cases
	@Test
	public void test() {
		boolean result = newObject.checkFile("C:/New folder/New Text Document.txt");  //calling the method to check whether the file exist or not by passing the path as argument
		assertEquals(result,true);
	}

}
