import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {

		Triangle triangle1 = new Triangle(4,5,6);
		Triangle triangle2 = new Triangle(4,3,5);
		
	@Test
	public void testEquilateral1() {
		boolean testResult=triangle1.isEquilateral();
		assertFalse(testResult);
	}
	
	@Test
	public void testRight1() {
		boolean testResult=triangle1.isRight();
		assertFalse(testResult);
	}
	
	@Test
	public void testScalene1() {
		boolean testResult=triangle1.isScalene();
		assertTrue(testResult);
	}
	
	@Test
	public void testIsosceles1() {
		boolean testResult=triangle1.isIsosceles();
		assertFalse(testResult);
	}
	
	@Test
	public void testEquilateral2() {
		boolean testResult=triangle2.isEquilateral();
		assertFalse(testResult);
	}
	
	@Test
	public void testRight2() {
		boolean testResult=triangle2.isRight();
		assertTrue(testResult);
	}
	
	@Test
	public void testScalene2() {
		boolean testResult=triangle2.isScalene();
		assertTrue(testResult);
	}
	
	@Test
	public void testIsosceles2() {
		boolean testResult=triangle2.isIsosceles();
		assertFalse(testResult);
	}
}
