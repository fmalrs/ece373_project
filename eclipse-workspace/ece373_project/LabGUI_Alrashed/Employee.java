/*
 * subclass of Person, special Person that can only take one class at a time
 * added to a Course's student roster
 */

package org.hrs.software;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;



public class Employee extends Person  implements Serializable
{
	
	private  double payRate;
	private  String id;
    
	public Employee()
	{
		super();
		payRate=0;
		id="NoID";
	}

	protected void setPayRate(double payRate)
	{
		this.payRate=payRate;
	}
	
	protected void setID(String iD)
	{
		this.id=iD;
	}

	
	protected double getPayRate()
	{
		return payRate;
	}
	
	protected String getID()
	{
		return id;		
	}
	
	
	
	public void raise (double percent)
	{
		this.payRate=this.payRate*(1+ percent/100);
	}

	
	protected double earns() 
	{
	 	double earned ;
	 	earned = 100*payRate;
	 	return earned;	
	}
	
	
	//static because we just call it on the class, not an instance.
	//receives the Employee as an argument.
	public static void saveData(Employee e){
	
	
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut= null;

		try 
		{
			fileOut = new FileOutputStream( "Employee.ser" );		//the Employee object makes its way to serial data in the file Employee.ser
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(e);
			objOut.close();
			fileOut.close();
	     }	
		
		catch(IOException i)
	    {
			i.printStackTrace();
	    }		
 	}

	public static Employee loadData()
	{	
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		Employee emp=null;
			
		try
		{
			fileIn = new FileInputStream("Employee.ser");
			objIn = new ObjectInputStream(fileIn);
			emp = (Employee) objIn.readObject();
			objIn.close();
			fileIn.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}  
		return emp;
	}	      

	public void Print()
	{	  
	    System.out.println("\n\n\n\nName: " + this.getName());
	    System.out.println("Pay Rate ($ per hour) : " +this.getPayRate());
	    System.out.println("Employee ID : " + this.getID()); 
	    System.out.println("Employee Earns : " + this.earns()); 	  
	}
		

}
