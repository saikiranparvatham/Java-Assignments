import java.io.File;
import java.io.FileInputStream;

public class LineCount {
	
   public int countLines(String path) throws Exception{				//method that accepts the file path as argument
   
      File file = new File(path);									
      FileInputStream filestream = new FileInputStream(file);		//taking the file into a input stream
      
      byte[] byteArray = new byte[(int)file.length()];				//creating a byte array in the length of the file
      filestream.read(byteArray);		
      String data = new String(byteArray);	
      String[] stringArray = data.split("\r\n");					//storing the text file in an array by splitting it into lines 
      filestream.close();
      return stringArray.length;
     
   }
}

