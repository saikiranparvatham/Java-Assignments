import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class checkArrayNames {
	
	
	@Test
	public void test() {
		String[] inputNames={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		ArrayNames newNames=new ArrayNames();
		boolean exists=newNames.findName(inputNames,"Sam");
		assertTrue(exists);
	}

}
