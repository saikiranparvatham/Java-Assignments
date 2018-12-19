import static org.junit.Assert.*;

import java.time.Month;

import org.junit.Test;


public class TestPerson {
	Person person1 = new Person("Ram", 5, 6, 1980);
	Person person2 = new Person("Shyam", 2, 3, 1987);
	
	@Test
	public void testDisplay() {
	String result=person1.display();
	assertEquals(result,"Name:Ram Date of Birth:1980-06-05 Age:38years 462Months 14076Days");
	}
	
	@Test
	public void testDisplay2() {
	String result=person2.display();
	assertEquals(result,"Name:Shyam Date of Birth:1987-03-02 Age:31years 381Months 11615Days");
	}

	@Test
	public void testOlderOne()
	{
		String result = person1.olderOne(person2);
		assertEquals(result,"Ram is older than Shyam by 6 years 80 months 2461 days");

	}
}
