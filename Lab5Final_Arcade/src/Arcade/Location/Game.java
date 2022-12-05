package Arcade.Location;

public class Game {
	
	private String name;
	private int credits;
	private String difficulty;
	private double winrate;
	private int tickets;
	
	
	public Game(String name, int credits, String difficulty, double winrate, int tickets) {
		super();
		this.name = name;
		this.credits = credits;
		this.difficulty = difficulty;
		this.winrate = winrate;
		this.tickets = tickets;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public double getWinrate() {
		return winrate;
	}
	public void setWinrate(double winrate) {
		this.winrate = winrate;
	}
	
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

}
