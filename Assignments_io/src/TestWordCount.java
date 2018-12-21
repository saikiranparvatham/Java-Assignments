import static org.junit.Assert.*;

import org.junit.Test;


public class TestWordCount {

	WordCount newObject = new WordCount();		//creating the object of the class WordCount
	
	@Test
	public void testWordCount() throws Exception {
		
		int numberOfWords = newObject.countWords("C:/New folder/New Text Document.txt");	//test case which calls the method to count words by passing the file path
		assertEquals(12,numberOfWords);														//assert which compares the expected and calculated value
	}

}
