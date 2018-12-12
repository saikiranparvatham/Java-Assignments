
public class MultiDimensionalArray {

	public boolean searchElement(int input) {
		int TwoDimensionalArray[][]={{5,6},{9,7}};
		int counter=0;
		for(int row=0;row<TwoDimensionalArray.length;row++)
		{
			for(int column=0;column<TwoDimensionalArray[0].length;column++)
			{
				if(TwoDimensionalArray[row][column]==input)
				{
					counter++;
				}
			}
		}
		if(counter>0){
			return true;
			
		}
		else
		{
		return false;	
		}
	}

}
