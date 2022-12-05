package Arcade.People;



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
	

}
