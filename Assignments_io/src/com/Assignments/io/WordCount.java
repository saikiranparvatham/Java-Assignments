package com.Assignments.io;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;						// importing relevant packages
import java.io.InputStreamReader;


public class WordCount {

	public int countWords(String filePath) throws Exception  {			// method for finding the word count which accepts the file path in the method call and passes
		
			FileInputStream fileStream = new FileInputStream(filePath);	
			InputStreamReader input = new InputStreamReader(fileStream); 
	        BufferedReader reader = new BufferedReader(input);
	        
	        int whitespaceCount = 0; 
	        int countWord = 0; 
	        String line;
	        
	        while((line = reader.readLine()) != null)
	        {
	        	 if(!(line.equals(""))) 
	             { 
	        		 String[] wordList = line.split("\\s+"); 
	                  
	                 countWord += wordList.length; 
	                 whitespaceCount += countWord -1; 
	             }
	        }
	
		return countWord;										//returning the word count to the calling object
	}

}
