package BasicCollections1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestLaptopBasicCollections {

	Laptop laptop1 = new Laptop ("Dell","Inspiron", "MS dos","pentium");		
	
	Laptop laptop2 = new Laptop ("Lenovo","Yoga", "windows","i5");
	
	Laptop laptop3 = new Laptop ("Acer","Aspire", "Linux","i3");
	
	Laptop laptop4 = new Laptop("Lenovo","Yoga","MS Dos","i3");
	
	HashSet<Laptop> laptopCollection = new HashSet<Laptop>();
	
	
	@Before
	public void testInitialization() {
		laptopCollection.add(laptop1);
		
		laptopCollection.add(laptop2);
		
		laptopCollection.add(laptop3);
		
		laptopCollection.add(laptop4);
	}
	
	@Test
	public void testLaptopCollectionDuplicates() {
		
		Iterator<Laptop> i=laptopCollection.iterator();  
		 while(i.hasNext())  
         {  
         System.out.println(i.next().getCompany());  
         }  
	
	}
	
	
	@Test
	public void testLaptopCollectionEqualMethodOnBrandAndModel() {
		
		assertTrue(laptop2.equals(laptop4));
		
	}
	
	
}
