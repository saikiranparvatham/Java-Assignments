
public class ArrayNames {

	public boolean findName(String[] inputNames, String string) {
		int nameCounter=0;
		for(int counter=0;counter<inputNames.length;counter++)
		{
			if(inputNames[counter]==string)
			{
				nameCounter=1;
				break;
			}
		}
		
		if(nameCounter==1){
			
		return true;
		
		}
		else 
			return false;
	}

	
}
