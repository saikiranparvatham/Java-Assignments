import static org.junit.Assert.*;

import org.junit.Test;


public class TestPerson {
	Person person1=new Person("ramesh",4,4,2001);
	
	@Test
	public void test() {
		person1.display();
	}

}
