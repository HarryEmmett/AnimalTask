package com.qa.animal;

public class Shark extends Animal implements Eat, Location{

	private int numberOfTeeth;
	private boolean canSwim;

	public int getNumberOfTeeth() {
		return numberOfTeeth;
	}

	public void setNumberOfTeeth(int numberOfTeeth) {
		this.numberOfTeeth = numberOfTeeth;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public Shark(String animalType, String animalName, int animalAge, int numberOfTeeth, boolean canSwim) {
		super(animalType, animalName, animalAge);
		this.numberOfTeeth = numberOfTeeth;
		this.canSwim = canSwim;
	}

	public void eat() {
		System.out.println("Eats fish");
		
	}

	public void location() {
		System.out.println("In the Sea");
		
	}

}
