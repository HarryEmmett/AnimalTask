package com.qa.animal;

public class Dog extends Animal implements Eat, Location{

	private String bark;
	private boolean likesBone;
	
	public String getBark() {
		return bark;
	}
	public void setBark(String bark) {
		this.bark = bark;
	}
	public boolean isLikesBone() {
		return likesBone;
	}
	public void setLikesBone(boolean likesBone) {
		this.likesBone = likesBone;
	}
	public Dog(String animalType, String animalName, int animalAge, String bark, boolean likesBone) {
		super(animalType, animalName, animalAge);
		this.bark = bark;
		this.likesBone = likesBone;
	}
	public void eat() {
		System.out.println("Eats bones");
		
	}
	public void location() {
		System.out.println("In the kennel");
		
	}
	
	
	
}


