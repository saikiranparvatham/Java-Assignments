import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestForArrayNames {
	
	
	@Test
	public void testConditionPositive() {
		String[] inputNames={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		ArrayNames newNames=new ArrayNames();
		int exists=newNames.findName(inputNames,"Sam");
		assertEquals(exists,2);
	}
	
	@Test
	public void testConditionNegative() {
		String[] inputNames={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson"};
		ArrayNames newNames=new ArrayNames();
		int exists=newNames.findName(inputNames,"kumar");
		assertNotEquals(exists,1);
	}

}
