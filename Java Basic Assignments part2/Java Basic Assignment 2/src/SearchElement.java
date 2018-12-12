import java.math.*;
public class SearchElement 
{
	public boolean searchPair(int[] inputElements,int k)
	{
		boolean found = false;
		int counterFound=0;
	for(int counter=1;counter<inputElements.length;counter++)
	{
		for(int innerCounter=0;innerCounter<counter;innerCounter++)
		{
			if(inputElements[counter]==inputElements[innerCounter] && Math.abs(innerCounter-counter)<=k)
			{
				counterFound++;
			}
				
		}
		
	}
	if(counterFound>=1)
	{
	found=true;
	}
	else
	{
		found=false;
	}
	return found;
	}

	
}