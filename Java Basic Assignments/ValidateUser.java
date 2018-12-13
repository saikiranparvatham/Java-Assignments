import java.util.*;

class ValidateUser
{
	public static void main(String[] args)
	{
		String userName="Ramesh kumar";
		String password="kumar123@Capg";
		int count=1;
		while(count<=3)
		{
		System.out.println("Please enter the user name");
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		System.out.println("Please enter the password");
		String passwordRead=sc.nextLine();
		
		if(username==userName && passwordRead==password)
			{
			System.out.println("welcome "+username);
			break;
			}
		else
			{
			System.out.println("Invalid username or password ! Please try again");	
			count++;
			}
		}
		if(count==4)
		System.out.println("Contact the admin");
	}
}