package com.qa.animal;

public class Cat extends Animal implements Eat, Location{

	private String meow;
	private boolean canSwim;

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public Cat(String animalType, String animalName, int animalAge, String meow, boolean canSwim) {
		super(animalType, animalName, animalAge);
		this.meow = meow;
		this.canSwim = canSwim;
	}

	public void eat() {
		System.out.println("Eats tuna");
		
	}

	public void location() {
		System.out.println("In the hosue");
		
	}

}
