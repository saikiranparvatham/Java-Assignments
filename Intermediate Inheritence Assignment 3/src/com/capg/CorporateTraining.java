package com.capg;

public class CorporateTraining extends Training {

	private int days;				//Instance variables
	
	public CorporateTraining(int id,String subject,double fees,int days)		//constructors
	{
		super(id,subject,fees);							//Initializing super class constructors
		this.days=days;
	}
	
	public double getOrderValue()
	{
		return fees*days;				// method to return the fees 
	}
	
}
