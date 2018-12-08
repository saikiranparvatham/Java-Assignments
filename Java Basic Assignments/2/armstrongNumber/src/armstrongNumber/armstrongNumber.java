package armstrongNumber;

import java.util.Scanner;

public class armstrongNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp;
		int total=0;
		int number=num;
		while (number!=0)
		{
			temp=number%10;
			total=total+(temp*temp*temp);
			number/=10;
		}
		if(total==num)
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
	}

}
