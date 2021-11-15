package com.qa.main;

import com.qa.animal.Cat;

public class Runner {
	
	public static void main(String[] args) {
		
		Cat c = new Cat("Mammal", "cat", 10, "Meow", false);
		
		c.location();
		c.eat();
		
	}

}
