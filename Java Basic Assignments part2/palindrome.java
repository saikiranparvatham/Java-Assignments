import java.util.Scanner;

class palindrome  
{
	public static void main(String args[])
    	{
	Scanner in = new Scanner(System.in);
	System.out.print("Input a number: ");
     	int number = in.nextInt();
     	int sum = 0, remainder;
	int temporary = number;    
     	while(number>0)
	  	 {    
        	remainder = number % 10;   
        	sum = (sum*10)+remainder;    
        	number = number/10;    
      	 	}    
      if(temporary==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
     	}  
}