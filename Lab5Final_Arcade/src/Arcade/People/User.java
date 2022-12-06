package Arcade.People;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Arcade.Logistics.*;

public class User extends Person {
	
	private int money;
	private Card card;
	
	
	public User(String name, String password, boolean access, int money, Card card) {
		super(name, password, access);
		this.money = money;
		this.card = card;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public static void saveData(User e){
			
			
			FileOutputStream fileOut = null;
			ObjectOutputStream objOut= null;
	
			try 
			{
				fileOut = new FileOutputStream( "User.ser" );		
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
	
		public static User loadData()
		{	
			FileInputStream fileIn = null;
			ObjectInputStream objIn = null;
			User usr=null;
				
			try
			{
				fileIn = new FileInputStream("User.ser");
				objIn = new ObjectInputStream(fileIn);
				usr = (User) objIn.readObject();
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
			return usr;
		}	      


}
