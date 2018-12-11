
public class PalindromeList {

	public boolean findPalindrome(int number)
	{
		boolean booleanResult;
		int sum = 0, remainder;
		int temporary = number;    
	     	while(number>0)
		  	 {    
	        	remainder = number % 10;   
	        	sum = (sum*10)+remainder;    
	        	number = number/10;    
	      	 	}    
	      if(temporary==sum)    
	        booleanResult=true;    
	      else    
	        booleanResult=false;  
		return booleanResult;
	}
	
}
