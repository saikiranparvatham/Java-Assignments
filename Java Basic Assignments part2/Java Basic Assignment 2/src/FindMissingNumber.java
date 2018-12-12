import java.util.Arrays;


public class FindMissingNumber {

	public int findNumber(int[] arrayOfNumbers) {
		int counter,element=0;
		Arrays.sort(arrayOfNumbers);
		for(counter=0;counter<arrayOfNumbers.length;counter++)
		{
			if(arrayOfNumbers[counter]!=counter)
			{
				System.out.println(counter+" is missing");
				element=counter;
			}
		}
		
		return element;
	}

}
