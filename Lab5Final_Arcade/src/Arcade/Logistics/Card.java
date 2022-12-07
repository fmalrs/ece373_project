package Arcade.Logistics;
import Arcade.People.*;
//s

public class Card {

	private User owner;
	private int tickets;
	private int credits;
	
	
	public Card() {
		super();
		this.tickets = 0;
		this.credits = 0;
	}


	public User getOwner() {
		return owner;
	}


	public void setOwner(User owner) {
		this.owner = owner;
	}


	public int getTickets() {
		return tickets;
	}


	public void setTickets(int tickets) {
		this.tickets = tickets;
	}


	public int getCredits() {
		return credits;
	}


	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	
}
