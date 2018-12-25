package com.Assignments.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Employee implements Serializable {
	
	
			int id;
			String name;
			double salary;
			
			public Employee(int id,String name,double salary)
			{
				this.id=id;
				this.name=name;
				this.salary=salary;				
			}
			
			public String getName()
			{
				return this.name;
			}
			
			
			
		public int getId() {
				return this.id;
			}

			
			public double getSalary() {
				return this.salary;
			}


		public void persist(Object object1){
			
			try{
				FileOutputStream fileoutput = new FileOutputStream("C:/Employee/employee.txt");
				
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileoutput);
				objectOutput.writeObject(object1);
				fileoutput.close();
				objectOutput.close();
					}
				catch(IOException ex)
				{
					System.out.println("filenotfound");
				}
				
		}
		
		
}

