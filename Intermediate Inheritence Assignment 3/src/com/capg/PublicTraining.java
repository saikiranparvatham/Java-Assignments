package com.capg;

public class PublicTraining extends Training {

	int numberOfParticipants;										//Instance variables
	PublicTraining(int id,String subject,double fees,int participants)  //constructor
	{
		super(id,subject,fees);							//Initializing super class constructor
		this.numberOfParticipants=participants;
			
	}
	
	public double getOrderValue()			// method to return the fees
	{
		return fees*numberOfParticipants;
	}
	
}
