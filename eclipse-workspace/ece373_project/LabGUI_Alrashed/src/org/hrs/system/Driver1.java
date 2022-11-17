package org.hrs.system;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.hrs.system.*;

// Test driver by Lahiru Ariyananda

public class Driver1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2=null;

		System.out.println("Before Serializing ... ");
		e1.setName("Carol");
		e1.setID("E2023");
		e1.setPayRate(12);	
		e1.Print();
		
    	Employee.saveData(e1);
	    
		System.out.println("\n\nAfter Serializing .....");

		e2 = Employee.loadData();	

	    e2.setPayRate(15);  
    	e2.Print();
	}
}
