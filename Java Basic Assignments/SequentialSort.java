import java.util.*;
class SequentialSort
{
	public static void main(String[] args)
	{
		int[] intArray = new int[]{ 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47 }; 
		
		for(int i=0;i<=intArray.length-1;i++)
		{
			for(int j=i+1;j<=intArray.length-1;j++)
				{
				if(intArray[i]>intArray[j])
					{
						
						int t=intArray[i];
     						intArray[i]=intArray[j];
        					intArray[j]=t;	

					}
				}
		}
		for(int k=0;k<=intArray.length-1;k++)
		{
			System.out.print(intArray[k]+" ");
		}
	}
}