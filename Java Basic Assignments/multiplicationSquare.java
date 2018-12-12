package muliplicationSquare;
import java.*;
import java.util.Scanner;

public class MultiplicationSquare 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i)+"\t\t"+Math.pow((n*i), 2));
		}
		

	}

}