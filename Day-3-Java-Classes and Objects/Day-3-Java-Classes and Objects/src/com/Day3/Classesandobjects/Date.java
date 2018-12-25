package com.Day3.Classesandobjects;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Date {

	private LocalDate date;
	public Date(int date, int month, int year) {
		this.date=LocalDate.of(year, month, date);
	}

	public String toStRing() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
		String result=this.date.format(formatter);
		return result;
	}

	public boolean isSmaller(Date date2) {
		if(this.date.isBefore(date2.date))
		{
			return true;
		}
		else
		return false;
	}

	public int[] diff(Date date2) {
		int[] result=new int[3];
		
		Period intervalPeriod = Period.between(this.date, date2.date);
		
		result[2] = intervalPeriod.getYears();
		result[1] = intervalPeriod.getMonths();
		result[0] = intervalPeriod.getDays();
		
		return result;
	}
	
	

}
