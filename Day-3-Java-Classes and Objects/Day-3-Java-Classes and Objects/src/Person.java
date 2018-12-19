import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Person
{

	private Object personName;
	private LocalDate dateOfBirth;
	LocalDate today = LocalDate.of(2018,12,19);
	
	public Person(String name, int date, int month, int year) {
		this.personName=name;
		this.dateOfBirth = LocalDate.of(year,month, date);
	}

	public String display() {
		
		Period intervalPeriod = Period.between(this.dateOfBirth, this.today);
		
		return "Name:"+this.personName+" Date of Birth:"+this.dateOfBirth+" Age:"+intervalPeriod.getYears()+"years "+intervalPeriod.getMonths()+"Months "+intervalPeriod.getDays()+"Days";
	}

	public String olderOne(Person person2) {
		Object older ;
		Object younger;
		if(this.dateOfBirth.isBefore(person2.dateOfBirth) )
		{
			older = this.personName;
			younger = person2.personName;
		}
		else
		{
			older = person2.personName;
			younger = this.personName;
		}
		 Period intervalPeriod = Period.between(this.dateOfBirth, person2.dateOfBirth);
		
		return older+" is older than "+younger+" by "+intervalPeriod.getYears()+" years "+intervalPeriod.getMonths()+" months "+intervalPeriod.getDays()+" days";
	}
	
	
	
}