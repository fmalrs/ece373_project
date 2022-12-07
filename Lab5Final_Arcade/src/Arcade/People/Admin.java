package Arcade.People;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Admin extends Person{

	public Admin(String name, String password, boolean access, int age) {
		super(name, password, access, age);
	}
	//fffffff
	public static void saveData(Admin e){
		
		
		FileOutputStream fileOut = null;
		ObjectOutputStream objOut= null;

		try 
		{
			fileOut = new FileOutputStream( "Admin.ser" );		
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

	public static Admin loadData()
	{	
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		Admin adm=null;
			
		try
		{
			fileIn = new FileInputStream("Admin.ser");
			objIn = new ObjectInputStream(fileIn);
			adm = (Admin) objIn.readObject();
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
		return adm;
	}	      


}
