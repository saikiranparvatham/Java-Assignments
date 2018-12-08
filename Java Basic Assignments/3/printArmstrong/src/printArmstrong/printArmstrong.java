package printArmstrong;

public class printArmstrong 
{

	public static void main(String[] args) 
	{
		
		for(int number=100;number<=999;number++)
		{
			int num=number;
			int temp;
			int total=0;
			while (num!=0)
			{
				temp=num%10;
				total=total+(temp*temp*temp);
				num/=10;
			}
			if(total==number)
				System.out.println(number+" is an Armstrong Number");
			
		}
	}
	

}
