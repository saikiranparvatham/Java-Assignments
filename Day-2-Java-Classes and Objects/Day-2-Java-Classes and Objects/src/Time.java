
public class Time {
	private int hours;
	private int minutes;
	private String time;
	public void setTime(int hours,int minutes)
	{
		this.hours=hours;
		this.minutes=minutes;
		this.time=Integer.toString(hours)+":"+Integer.toString(minutes);
	}
	
	public String showTime()
	{
		System.out.println(hours+"hours and "+minutes+" minutes");
		return time ;
	}
	
	public double sumTime(Time o1,Time o2)
	{
		double hour2=(o1.minutes+o2.minutes)/60;
		int hour1=o1.hours+o2.hours;
		return hour1+hour2;
	}
	
}
