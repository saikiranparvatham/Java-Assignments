public class SpaceAndWordDeletion {
	public String DeleteExtraSpaces(String input, String word, int position)
	{
		String[] words=input.split(" +");
		
		
		for(int counter=0;counter<words.length;counter++)
		{
			
		if(words[counter].equals(word) && position==counter+1)
		{
			words[counter]="";
			break;
		}
		
		}
		String resultTemporary=String.join(" ",words);
		//System.out.println(resultTemporary);
		String result=resultTemporary.replaceAll(" +", " ");
		System.out.println(result);
		return result;
	}

	
	
}
