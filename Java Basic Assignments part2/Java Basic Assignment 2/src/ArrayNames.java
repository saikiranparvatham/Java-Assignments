
public class ArrayNames {

	public int findName(String[] inputNames, String string) {
		int nameCounter=0;
		for(int counter=0;counter<inputNames.length;counter++)
		{
			if(inputNames[counter]==string)
			{
				nameCounter++;
				
			}
		}
		
		return nameCounter;
	}

	
}
