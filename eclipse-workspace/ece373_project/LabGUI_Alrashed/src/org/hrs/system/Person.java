
package org.hrs.system;

import java.io.Serializable;


public abstract class Person   implements Serializable
{
	private String name;
	
	public Person()
	{
		setName("No name");								//default name
	}

	//getter and setter for name
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}	
	
	
