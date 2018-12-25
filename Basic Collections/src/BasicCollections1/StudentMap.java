/* 
Create a simple map to store all of our class students’ names and their favorite fruits. 
Try to get their favorite fruit by giving their name. Also, list all the names and their
 favorite fruits saperately.   */

package BasicCollections1;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentMap {

	static Map<String,String> students = new HashMap<>();		//Creating a Map of students with student names as
																// keys and fruits as values
	@BeforeClass
	public static void setUp() {
		
		students.put("Akash","Mango");
		students.put("Pavan","Orange");
		students.put("Harish","Banana");
		students.put("Nikhil","Apple");	
	}
	
	@Test
	public void testMapping()
	{
		assertEquals("Orange",students.get("Pavan"));
	}
	
	@Test
	public void testMapping2()
	{
		assertEquals("Banana",students.get("Harish"));
	}
	
	@Test
	public void testMappingValues()
	{
		Collection<String> fruits = students.values();
		 
		for (String variable : fruits) {						//Displays all the values of the keys
		    System.out.println(variable);
		}
	}
	
	@Test
	public void testMappingKeys()
	{
		for(String key :students.keySet())						//Displays all the keys of the values
		{
			System.out.println( key );
		}
	}
}
