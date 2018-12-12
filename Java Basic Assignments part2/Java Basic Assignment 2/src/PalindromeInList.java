import java.util.Arrays;


public class PalindromeInList {
	public String findPalindrome(String[] input){
		int index=0;
		String revResult="";
		for(int counter=0;counter<=input.length;counter++)
		{
	     
	     String str=input[counter], rev = "";
	     
	     int length = str.length();
	     String result="";
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      
		if (str.equals(rev))
		{
	         
	         index=counter;
	         
	         char[] chars = str.toCharArray();
	         Arrays.sort(chars);
	         String sorted = new String(chars);
	         for ( int i = length - 1; i >= 0; i-- )
		         revResult = revResult + sorted.charAt(i);
	        System.out.println(revResult);
	         return revResult;
		}
	 
		
		}
		
		return revResult;
		
	
		
	}
}
