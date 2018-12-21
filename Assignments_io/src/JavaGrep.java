
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaGrep {

	public List<String> patternMatch(String filePath, String patternToMatch) throws Exception {
		int i = 2;
	    Pattern pattern = Pattern.compile(patternToMatch);
	    BufferedReader br = new BufferedReader(new FileReader(filePath));
	    List<String> list = new ArrayList<>();
	   
	    String line=br.readLine();
	    while ((line=br.readLine()) != null) 
	    {
	       if (pattern.matcher(line).matches()) 
	       {
	    	  list.add(line+" at line number "+i);
	                     
	       }
	          i++;
	    }
	    for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	    br.close();
		return list;
	}

}
