import java.util.Scanner;


public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ctc");
		double ctc=sc.nextDouble();
		
		if(ctc>=0 && ctc<=180000)
		{
			System.out.println("Your tax is nil");
		}
		
		else if(ctc>=181001 && ctc<=300000)
		{
			
			System.out.println("Your tax amount is "+0.1*ctc);
		}
		
		else if(ctc>=300001 && ctc<=500000)
		{
			System.out.println("Your tax amount is "+0.2*ctc);
		}
		
		else if(ctc>=500001 && ctc<=1000000)
		{
			System.out.println("Your tax amount is "+0.3*ctc);
		}
		
		else
		{
			System.out.println("ctc is not in the range");
		}
	}

}