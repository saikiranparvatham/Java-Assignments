import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class ComplexTest {
	Complex variable1=new Complex(4,5);
	Complex variable2=new Complex(2,3);
	
	@Test
	public void testAdd() {
			Complex result=Complex.add(variable1, variable2);
			System.out.println(result.real+" "+result.imag+"i");
			Complex comparator=new Complex(6,8);
			assertEquals(result,comparator);
	}
	
	@Test
	public void testAddNegative() {
			Complex result=Complex.add(variable1, variable2);
			System.out.println(result.real+" "+result.imag);
			Complex expected=new Complex(6,8);
			assertNotEquals(result,expected);
			
	}
}
