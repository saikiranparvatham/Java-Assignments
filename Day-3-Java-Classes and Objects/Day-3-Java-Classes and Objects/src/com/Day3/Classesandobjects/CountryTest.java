package com.Day3.Classesandobjects;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class CountryTest {
	
	
	static Country[] countries=new Country[5];
	@BeforeClass
	public static void setUp() {
		
		countries[0]=new Country("India",1189172906,1269338);
		
		countries[1]=new Country("Iceland",311058,39768);
		
		countries[2]=new Country("Japan",12647664,145882);
		
		countries[3]=new Country("Egypt",82079636,386660);
		
		countries[4]=new Country("France",65312249,211208);

	}
	

	@Test
	public void testLargestArea(){
		String result=Country.findLargestArea(countries);
		assertEquals(result,"India");
	}
	
	@Test
	public void testLargestPopulation(){
		String result=Country.findLargestPopulation(countries);
		assertEquals(result,"India");
	}

	
	@Test
	public void testLargestPopulationDensity(){
		String result=Country.findLargestPopulationDensity(countries);
		assertEquals(result,"India");
	}




	
}
