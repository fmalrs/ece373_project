package Arcade.People;
//push
import java.io.Serializable;
public abstract class Person  implements Serializable{
	
	protected String name;
	protected String password;
	protected int age;
	protected boolean access;
	
	
	public Person() {
		super();
		this.name = "null";
		this.age = 0;
		this.password = "null";
		this.access = false;
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
	public void setAge(int yearsOnEarth) {
		this.age = yearsOnEarth;
	}
	public int getAge() {
		return age;
	}
	
	

}
