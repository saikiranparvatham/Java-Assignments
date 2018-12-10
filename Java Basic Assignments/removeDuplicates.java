import java.util.*;
class removeDuplicates
{
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] intArray = new int[size];
		for(int u=0;u<size;u++)
			intArray[u]=sc.nextInt();
		int length=intArray.length;
		int[] newArray=new int[length];
		int count=1;
		
		for(int i=1;i<length;i++)
		{	
			newArray[0]=intArray[0];
			for(int j=0;j<i;j++)
			{
			
			 if(intArray[i]!=intArray[j])
			{	
				newArray[count]=intArray[i];
				
			}
			else if(intArray[i]==intArray[j])
				count--;
			}
			count++;
		}
		System.out.println("the array after removing duplicates :");
		for(int n=0;n<count;n++)
		System.out.print(newArray[n]+" ");
	}
}