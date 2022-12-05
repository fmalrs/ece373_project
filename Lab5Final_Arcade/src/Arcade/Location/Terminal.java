package Arcade.Location;

public class Terminal {
	private int ratio;
	private double average;
	
	public Terminal(int ratio) {
		super();
		this.ratio = ratio;
		this.average = 0.0;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
	
	
}
