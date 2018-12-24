import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestMyClass {

	static ArrayList<MyClass> objects = new ArrayList<MyClass>();
	
	
	@BeforeClass
	public static void setUp() {
		
		objects.add(new MyClass(101,"ramesh",95,"A"));
		
		objects.add(new MyClass(102,"mahesh",65,"B"));
	
		objects.add(new MyClass(103,"suresh",13,"F"));

		objects.add(new MyClass(104,"rajesh",70,"B"));

		objects.add(new MyClass(105,"rohan",62,"C"));
		
		try {
				FileOutputStream fileoutput = new FileOutputStream("C:/Employee/MyClass.txt");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutput);
				objectOutput.writeObject(objects);
				fileoutput.close();
				objectOutput.close();
			}
		
		catch(IOException ex)
			{
				System.out.println("filenotfound");
			}
	}
	
	
	@Test
	public void test()
	{
		ArrayList<MyClass> arraylist= new ArrayList<MyClass>();
		try {	
			FileInputStream fileinput = new FileInputStream("C:/Employee/MyClass.txt");
		
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
		
			arraylist = (ArrayList<MyClass>)objectinput.readObject();	
		
			//System.out.println(objects.get(0).toString());
			
			assertEquals(objects.get(0).toString(),arraylist.get(0));

			fileinput.close();	
		} 
		
		catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
	}
	
	
	

}
