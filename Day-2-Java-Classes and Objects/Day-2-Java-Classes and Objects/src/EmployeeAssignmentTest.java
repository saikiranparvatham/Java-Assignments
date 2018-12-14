import static org.junit.Assert.*;

import org.junit.Test;


public class EmployeeAssignmentTest {
	EmployeeAssignment employee1=new EmployeeAssignment(154,"ramesh yadav",20000);
	@Test
	public void testName() {
		String testName= employee1.getName();
		assertEquals(testName,"ramesh yadav");
	}
	
	@Test
	public void testId() {
		int testId= employee1.getId();
		assertEquals(testId,154);
	}
	@Test
	public void testMonthlySalary() {
		double testSalary= employee1.getMonthlySalary();
		assertEquals(testSalary,20000,0.01);
	}
	
	@Test
	public void testAnnualBasicSalary() {
		double testSalary= employee1.getAnnualBasic();
		assertEquals(testSalary,240000,0.01);
	}
	
	@Test
	public void testMonthlyGrossSalary() {
		double testMonthlyGrossSalary= employee1.getMonthlyGrossSalary();
		assertEquals(testMonthlyGrossSalary,22050,0.01);		
	}
	
	@Test
	public void testYearlyGrossSalary() {
		double testYearlyGrossSalary= employee1.getAnnualGrossSalary();
		assertEquals(testYearlyGrossSalary,264600,0.01);		
	}
	
	@Test
	public void testMonthlyDeductions() {
		double monthlyDeductions= employee1.getMonthlyDeductions();
		System.out.println(monthlyDeductions);
		assertEquals(monthlyDeductions,6600,0.01);		
	}
	
	@Test
	public void testMonthlyTakeHome() {
		double monthlyTakeHome= employee1.getMonthlyTakeHome();
		System.out.println(monthlyTakeHome);
		assertEquals(monthlyTakeHome,258000,0.01);		
	}
	
	@Test
	public void testAnnualTakeHome() {
		double AnnualTakeHome= employee1.getAnnualTakeHome();
		System.out.println(AnnualTakeHome);
		assertEquals(AnnualTakeHome,3096000,0.01);		
	}
	
	
}
