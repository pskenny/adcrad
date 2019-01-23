package com.lab1.factory;

/*
 * Factory design pattern example. 
 */
public class Runner {

	// Used to create object without having to specify exact class.
	public static AnimalI getAnimal(String animal) {
		switch (animal.toLowerCase()) {
		case "dog":
			return new Dog();
		case "cat":
			return new Cat();
		case "crow":
			return new Crow();
		default:
			return null;
		}
	}
}
