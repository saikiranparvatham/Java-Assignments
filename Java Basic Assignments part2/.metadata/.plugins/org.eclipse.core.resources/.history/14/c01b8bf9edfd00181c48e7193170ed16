import java.util.*;
import java.io.*;
public class reverseWords {
	public String findReverse(String input)
	{
		
		 String[] words = input.split(" ");
	        String reverse = "";
	        String reverseResult="";
	        for (int i = 0; i < words.length; i++) 
			{
	            for (int j = words[i].length() - 1; j >= 0; j--) 
			{
	                reverse += words[i].charAt(j);
	            	}
	            
	            reverseResult=reverseResult+reverse+" ";
	            reverse = "";
	        	}
	        int ind = reverseResult.lastIndexOf(" ");
	        if( ind>=0 )
	        	reverseResult = new StringBuilder(reverseResult).replace(ind, ind+1,"").toString();
	        
	        
	        return reverseResult;
		
	}
}
