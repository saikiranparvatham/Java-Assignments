import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestRectangle {
	Rectangle rectangleOne=new Rectangle(4,5);
	
	@Test
	public void testArea() {
		double testArea=rectangleOne.area();
		assertEquals(testArea,20,0.1);
	}

	@Test
	public void testPerimeter() {
		double testPerimeter=rectangleOne.perimeter();
		assertEquals(testPerimeter,18,0.1);
	}
}
