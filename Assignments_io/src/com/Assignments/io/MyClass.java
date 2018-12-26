package com.Assignments.io;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class MyClass implements Serializable         {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5509982945182775376L;
	public int id;
	public String name;
	

	public int marks;
	public String grade;
	

	public MyClass(int id, String name, int marks, String grade) {
		super();
		id = id;
		name = name;
		this.marks = marks;
		this.grade = grade;
	}

@Override
	public String toString() {
		return "MyClass [Id=" + id + ", Name=" + name + ", marks=" + marks
				+ ", grade=" + grade + "]";
	}




	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getMarks() {
		return marks;
	}


	public String getGrade() {
		return grade;
	}

	

	
	
	}

