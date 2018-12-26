package com.capg;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestTraining {	
	Training training;						//Creating reference of Training object
	
	@Test
	public void testPublicTraining() 
	{										//testing up casting of PublicTraining
		training = new PublicTraining(102,"Java",5000,50);
		double result =  ((PublicTraining) training).getOrderValue();
		assertEquals(5000*50,result,0.01);
	}
	
	@Test
	public void testCorporateTraining()
	{
											//testing up casting of CorporateTraining
		training = new CorporateTraining(103,"Dotnet",12000,15);
		double result=((CorporateTraining) training).getOrderValue();
		assertEquals(12000*15,result,0.01);
	}

}