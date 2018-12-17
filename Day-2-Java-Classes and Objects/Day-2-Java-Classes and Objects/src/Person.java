import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.TimeUnit;

class Person
{ 
	private String name; 								// data member to store the name of a person.
	private Date dob; 									// data member to store the date of birth of a person.
	public Person(String n, int d, int m, int y) 		//constructor to initialize Person objects
	{
		this.name=n;
		this.dob=new Date(d,m,y);						//initialize the data members of the current Person object using the parameters. 
	}
	public void display()								// method to display the details of a person.
	{	
		Date today=new Date(17,12,2018);
		int[] age1=dob.diff(today);
		int age=age1[2];
		System.out.println("Name:"+name+"\nDate of Birth:"+dob+"\nAge:"+age);
																						//Person details should be displayed in the following format:
																						//Name: Person Name
																						//Date Of Birth: dd/mm/yyyy
																						//Age: ... Years, ... Months, ... Days
	}
	public void olderOne(Person p) //method to identify the older of the two persons.
	{
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
	}
}