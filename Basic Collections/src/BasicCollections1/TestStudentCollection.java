package BasicCollections1;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudentCollection {

	  // Creating object of class linked list 
    static LinkedList<String> students  = new LinkedList<String>(); 			//Creating linked list of students


	@BeforeClass
	public static void setUp() { 
		
		students.add("Akash"); 
		students.add("Venkat"); 
		students.add("Harish"); 
		students.add("Pavan");  
	}
	
	@Test
	public void testInsertionOrder()
	{	
		System.out.println("Insertion Order: "+students);					//Displaying the elements in the order they were inserted
	}
	
	@Test
	public void testNaturalOrder()
	{
		Collections.sort(students);											//Displaying the elements in alphanumeric order
		System.out.println("Natural Order: "+students);
	}
	
	
}


