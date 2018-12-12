import java.util.*;
class SearchArray
{
	public static void main(String[] args)
	{
		int[] intArray = new int[]{ 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 }; 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search in the array");
		int n=sc.nextInt();
		
		for(int i=0;i<=intArray.length-1;i++)
		{
			if(intArray[i]==n)
			System.out.println("The number is found at array index :"+i);
		}
		
	}
}