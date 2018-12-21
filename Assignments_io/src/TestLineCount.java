import static org.junit.Assert.*;

import org.junit.Test;


public class TestLineCount {

	LineCount newObject=new LineCount();				//creating a LIneCount object 
	
	@Test
	public void testingLineCount() throws Exception {
		
		int numberOfLines=newObject.countLines("C:/New folder/New Text Document.txt");		//calling the method by passing the path of the file
		assertEquals(4,numberOfLines);
		
	}

}
