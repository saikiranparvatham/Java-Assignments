import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestTime {

	static Time time1=new Time();
	static Time time2=new Time();
	Time time3=new Time();
	@BeforeClass
	public static void testAssignTime1() {
		time1.setTime(5,30);
	}
	
	@BeforeClass
	public static void testAssignTime2() {
		time2.setTime(7,40);
	}
	
	@Test
	public void testShowTime1() {
		String time1Test=time1.showTime();
		assertEquals(time1Test,"5:30");
	}
	
	@Test
	public void testShowTime2() {
		String time2Test=time2.showTime();
		assertEquals(time2Test,"7:40");
	}
	
	@Test
	public void testSumTime() {
		double sumTest=time3.sumTime(time1,time2);
		System.out.println(sumTest);
		assertEquals(sumTest,13,0.1);
	}
	
}
