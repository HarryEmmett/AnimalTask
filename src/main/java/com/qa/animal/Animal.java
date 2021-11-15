package com.qa.animal;

public abstract class Animal {

	private String animalType;
	private String animalName;
	private int animalAge;
	
	public Animal(String animalType, String animalName, int animalAge) {
		super();
		this.animalType = animalType;
		this.animalName = animalName;
		this.animalAge = animalAge;
	}
	
	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(int animalAge) {
		this.animalAge = animalAge;
	}
	
	public void sleep() {	
		System.out.println("Zzzzzzz");
		
	}
	
	public void jump() {	
		System.out.println("jump");
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", animalName=" + animalName + ", animalAge=" + animalAge + "]";
	}
	
	

}



