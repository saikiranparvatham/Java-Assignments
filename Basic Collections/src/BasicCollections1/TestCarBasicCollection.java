package BasicCollections1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
	
public class TestCarBasicCollection {
		static HashSet<Car> carSet = new HashSet<Car>();			//creating a hashset of car objects
		
		static Car car1 = new Car("Fiat","palio",2001,70000);
		
		static Car car2 = new Car("Maruti","Omni",1998,35000);
		
		static Car car3 = new Car("Hyundai","Accent",2000,120000);
		
		static Car car4 = new Car("Maruti","Omni",2002,75000);
		
		static Car car5 = new Car("Maruti","Omni",2002,75000);
		
		
		
		
	@BeforeClass
	public static void setUp() {
	
		carSet.add(car1);											//adding the objects to the set
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		carSet.add(car5);
	}
	
	@Test
	public void testEqualityByOverRidingEqualsMethod()		
	{
		
	    Iterator<Car> i=carSet.iterator();  
	    while(i.hasNext())  										//displaying all the car objects
        {  
        System.out.println(i.next().toString());  
        }   
	    
	    assertFalse(car2.equals(car4));	
	}
		
	
}
