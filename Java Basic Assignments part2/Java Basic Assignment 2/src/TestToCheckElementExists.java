import static org.junit.Assert.*;

import org.junit.Test;


public class TestToCheckElementExists {
	MultiDimensionalArray newobject=new MultiDimensionalArray();
	@Test
	public void testElementExists() {
		boolean exists=newobject.searchElement(5);
		assertTrue(exists);
	}
	@Test
	public void testElementNotExists() {
		boolean exists=newobject.searchElement(3);
		assertFalse(exists);
	}
}
