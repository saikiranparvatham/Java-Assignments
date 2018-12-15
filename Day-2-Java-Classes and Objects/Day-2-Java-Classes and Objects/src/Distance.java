
public class Distance {

	private int feet;
	private float inches;
	
	public void set(int feet,float inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	
	public void display()
	{
		System.out.println(this.feet+" feet and "+this.inches+" inches");
		
	}
	
	public float addDistance(Distance d1,Distance d2)
	{
		float feetToInches=12*d1.feet+12*d2.feet ;
		float result=feetToInches+d1.inches+d2.inches;
		System.out.println("The sum is "+result+" inches");
		return result;
	}
}
