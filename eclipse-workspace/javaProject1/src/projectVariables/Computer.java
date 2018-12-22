package projectVariables;

public class Computer {// opening curly brace
	String model;// declare variable
	int price;
	char quality;
	boolean madeInUsa;
	float review;

	public void Computer() {// declare constructor
		System.out.println("we are describing computer here");
	}

	public void computerConfiguration() {// method implementation
		System.out.println("computerConfiguration is: " + model + "  " + price + "  " + quality + "  " + madeInUsa
				+ "  " + review);
	}
}