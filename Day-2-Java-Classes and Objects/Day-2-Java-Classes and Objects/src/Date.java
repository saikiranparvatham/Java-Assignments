import java.time.LocalDate;
import java.time.Period;

  

class Date { 
	private int d, m, y; // data members to store the day, month and year of a date.
	public Date(int d,int m,int y) //constructor to initialize Date objects
	{
		this.d=d;
		this.m=m;
		this.y=y;
		//initialize d, m, y of the current object using the d, m, y parameters. 
	}
	public String toString()// method to get the value of a Date object printed
	{
		
		return String.format( "%d/%d/%d", d, m, y);
		
		
		//return the value of a Date object as a String in d/m/y format.
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		if(d.y<=this.y)
		{
			if(d.m<=this.m)
			{
				if(d.d<this.d)
				{
					return true;
				}
				else
				{
					return false;
					
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
					//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returne
	}
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		Date givenObject = new Date(2,3,2016);
		int newDate =d.date - givenObject.date;
		
				 
	}
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
	//}
}