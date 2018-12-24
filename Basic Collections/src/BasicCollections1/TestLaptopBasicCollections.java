package BasicCollections1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestLaptopBasicCollections {

	Laptop laptop1 = new Laptop ("Dell","Inspiron", "MS dos","pentium");
	
	Laptop laptop2 = new Laptop ("Lenovo","Yoga", "windows","i5");
	
	Laptop laptop3 = new Laptop ("Acer","Aspire", "Linux","i3");
	
	ArrayList<Laptop> laptopCollection = new ArrayList<Laptop>();
	
	
	@Before
	public void testInitialization() {
		laptopCollection.add(laptop1);
		
		laptopCollection.add(laptop2);
		
		laptopCollection.add(laptop3);
		
	}
	
	@Test
	public void testLaptopCollection1() {
		
		assertEquals(laptopCollection.get(0).company+" "+laptopCollection.get(0).model+" "+laptopCollection.get(0).operatingSystem+" "+laptopCollection.get(0).processor,"Dell Inspiron MS dos pentium");
	
	}
	
	
	
	@Test
	public void testLaptopCollection2() {
		
		assertEquals(laptopCollection.get(1).company+" "+laptopCollection.get(1).model+" "+laptopCollection.get(1).operatingSystem+" "+laptopCollection.get(1).processor,"Lenovo Yoga windows i5");
		
	}
	
	@Test
	public void testLaptopCollection3() {
		
		assertEquals(laptopCollection.get(2).company+" "+laptopCollection.get(2).model+" "+laptopCollection.get(2).operatingSystem+" "+laptopCollection.get(2).processor,"Acer Aspire Linux i3");
		
	}
}
