package Arcade.Location;

import java.util.ArrayList;

import Arcade.People.Person;

public class Arcade{
	
	private ArrayList<Item> bar;
	private ArrayList<Item> shop;
	private ArrayList<Person> people;
	private ArrayList<Game> game;
	
	
	public Arcade(ArrayList<Item> bar, ArrayList<Item> shop, ArrayList<Person> people, ArrayList<Game> game) {
		super();
		this.bar = bar;
		this.shop = shop;
		this.people = people;
		this.game = game;
	}


	public ArrayList<Item> getBar() {
		return bar;
	}


	public void setBar(ArrayList<Item> bar) {
		this.bar = bar;
	}


	public ArrayList<Item> getShop() {
		return shop;
	}


	public void setShop(ArrayList<Item> shop) {
		this.shop = shop;
	}


	public ArrayList<Person> getPeople() {
		return people;
	}


	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}


	public ArrayList<Game> getGame() {
		return game;
	}


	public void setGame(ArrayList<Game> game) {
		this.game = game;
	}
	
	
	//if person exists, will return index of person. If person does not exist, will return -1
	public int containsPerson(String name)
	{		
		for(int n = 0; n < people.size(); n++) 
		{
			if ((people.get(n).getName().equals( name)))
			{
				return n;
			}
		}
		return -1;	
    }
	
	public boolean passwordCheck(int index, String password) {
		if(people.get(index).getPassword() == password) {
			return true;
		}
		else {
			return false;
		}
	}
}
	
	

