package com.Assignments.io;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.junit.Before;
import org.junit.Test;


public class TestEmployee {

	Employee employeeObject = new Employee(101,"Ramesh",12000);
	
	@Before
	public void testPersist() {
		employeeObject.persist(employeeObject);
	}
	
	@Test
	public void test2() {
		try {
			FileInputStream fileinput = new FileInputStream("C:/Employee/employee.txt");
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
		Employee result = (Employee)objectinput.readObject();
		String employeeDetails =  result.getId()+" "+result.getName()+" "+result.getSalary();
		
		//System.out.println(employeeDetails);
				
		assertEquals(employeeDetails,"101 Ramesh 12000.0");	
				
				
				
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
