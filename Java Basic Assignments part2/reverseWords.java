import java.util.*;
import java.io.*;
class reverseWords 
{
    	public static void main(String args[])  
	{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String reverse = "";
        for (int i = 0; i < words.length; i++) 
		{
            for (int j = words[i].length() - 1; j >= 0; j--) 
		{
                reverse += words[i].charAt(j);
            	}
            System.out.print(reverse + " ");
            reverse = "";
        	}
    	}
}