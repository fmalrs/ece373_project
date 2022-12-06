package Arcade.People;

import java.io.Serializable;
public abstract class Person  implements Serializable{
	
	protected String name;
	protected String password;
	protected boolean access;
	
	
	public Person(String name, String password, boolean access) {
		super();
		this.name = name;
		this.password = password;
		this.access = access;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	
	

}
