package Arcade.Logistics;
import Arcade.People.*;


public class Card {

	private User owner;
	private int tickets;
	private int credits;
	
	
	public Card(User owner, int tickets, int credits) {
		super();
		this.owner = owner;
		this.tickets = tickets;
		this.credits = credits;
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
