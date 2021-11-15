package com.qa.animal;

public class Bird extends Animal implements Eat, Location{

	private int numberOfWins;
	private boolean canFly;

	public int getNumberOfWins() {
		return numberOfWins;
	}

	public void setNumberOfWins(int numberOfWins) {
		this.numberOfWins = numberOfWins;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public Bird(String animalType, String animalName, int animalAge, int numberOfWins, boolean canFly) {
		super(animalType, animalName, animalAge);
		this.numberOfWins = numberOfWins;
		this.canFly = canFly;
	}

	public void eat() {
		System.out.println("eats seeds");
		
	}

	public void location() {
		System.out.println("In the sky");
		
	}

}
