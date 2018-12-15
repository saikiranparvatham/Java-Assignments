import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestDistance {
	static Distance distance1=new Distance();
	static Distance distance2=new Distance();
	Distance distance3=new Distance();
	
	@BeforeClass
	public static void testSet() {
		distance1.set(41, 25.5f);
	}
	

	@BeforeClass
	public static void testSet2() {
		distance2.set(22, 24f);
	}
	
	@Test
	public void testadd()  {
		float result=distance3.addDistance(distance1,distance2);
		assertEquals(result,805.5,0.1);
	}
	
	
}