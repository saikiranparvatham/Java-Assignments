
public class EmployeeAssignment {
	public int ID; 
    private String employeeName; 
    private  double monthlyBasicSalary;
    public final double HRA=0.5*monthlyBasicSalary;
    public final double medicalAllowance=1250;
    public final double conveyanceAllowance=800;
	private float pfRate = 10;
    
    
    public EmployeeAssignment(int id, String name, double basicSalary) {
    	this.ID = id;
        this.employeeName = name;
        this.monthlyBasicSalary = basicSalary;
    }

    public void setId(int id) {
		this.ID = id;
	}

	
    public int getId() {
        return ID;
    }

    public void setName(String name) {
        this.employeeName = name;
    }

    public String getName() {
        return employeeName;
    }

    public void setmonthlySalary(double salary) {
        this.monthlyBasicSalary = salary;
    }

    public double getMonthlySalary() {
        return monthlyBasicSalary;
    }
	public double getAnnualBasic()//(return 12 * monthlyBasic;)
	{
		return 12*monthlyBasicSalary;
		
	}
	
	

	public double getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	{
		
		return monthlyBasicSalary + HRA + medicalAllowance + conveyanceAllowance;
		
	}
	
	public double getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	{
		return 12*getMonthlyGrossSalary();
		
	}
	
	
	
	public void setPFRate(float f)
	{
		this.pfRate=f;
	}
	
	public double getPFRate()
	{	if(pfRate*monthlyBasicSalary<=6500)
		return pfRate*monthlyBasicSalary;
	else
	{
		return 6500;
	}
	}
	
	public double getEsic()
	{
		if(monthlyBasicSalary<=5000)
			return 0.0475*monthlyBasicSalary;
		else 
			return 0;
	}
	
	public double getProfessionalTax()
	{
		if(monthlyBasicSalary<=10000)
			return 50;
		else
			return 100;
	}
	public double getMonthlyDeductions() //(pf + esic + profTax)
	{
		return getPFRate()+getEsic()+getProfessionalTax();
		
	}
	
	public double getMonthlyTakeHome()//(MonthlyGrossSalary- MonthlyDeductions)
	{
		return getAnnualGrossSalary()-getMonthlyDeductions();
	}
	
	public double getAnnualTakeHome()//(12 * MonthlyTakeHome)
	{
		return 12*getMonthlyTakeHome();
	}
	
	
	
}
