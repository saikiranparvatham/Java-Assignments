import java.io.*;											// importing java.io package

public class FileExistOrNot {

																
	public  boolean checkFile(String string) {				//method in FileExistOrNot class to find whether the
															//file exists or not by passing the path of file
		File file = new File(string);						//as arguments
		
		if(file.exists())
		{
			return true;
		}
		else
		return false;
	}
		

}
