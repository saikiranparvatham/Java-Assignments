import static org.junit.Assert.*;

import org.junit.*;
import org.junit.*;
import org.junit.*;
public class TestForExtraSpaceDeletion {
	SpaceAndWordDeletion newObject = new SpaceAndWordDeletion();
	
	@Test
	public void testForExtraSpaceDeletionPositiveTest() {
		
		String resultCheck=newObject.DeleteExtraSpaces("This   is   a    computer","is",2);
		assertEquals(resultCheck,"This a computer");
	}
	@Test
	public void testForExtraSpaceDeletionNegativeTest() {
		
		String resultCheck=newObject.DeleteExtraSpaces("This   is   a    computer","is",2);
		assertNotEquals(resultCheck,"This is a computer");
	}
	
	@Test
	public void testForExtraSpaceDeletionPositiveTest2() {
		
		String resultCheck=newObject.DeleteExtraSpaces("A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.","is",6);
		assertEquals(resultCheck,"A MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY.");
	}
	
	@Test
	public void testForExtraSpaceDeletionPositiveTest3() {
		
		String resultCheck=newObject.DeleteExtraSpaces("AS YOU    SOW, SO   SO YOU REAP.","SO",4);
		assertEquals(resultCheck,"AS YOU SOW, SO YOU REAP.");
	}
}
