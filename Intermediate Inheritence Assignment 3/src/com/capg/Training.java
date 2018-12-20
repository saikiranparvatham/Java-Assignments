package com.capg;

public class Training {									//Super class
	
	private int Id;				
	private String subject;								//instance variables
	protected static double fees;				


	public Training(int id,String subject,double fees)	//constructor
	{
		this.Id = id;
		this.subject = subject;
		Training.fees = fees;
	}
	
	
}
