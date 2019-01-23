package com.lab1;

import com.lab1.factory.AnimalI;
import com.lab1.factory.Runner;
import com.lab1.singleton.Counter;

public class App {

	public static void main(String[] args) {
		// First exercise - regular instantiation
		Person person = new Person();
		person.sayHello();
		
		// Second exercise - singleton pattern
		Counter counter  = Counter.getInstance();
		
		// Third exercise - factory pattern
		AnimalI dog = Runner.getAnimal("dog");
		AnimalI cat = Runner.getAnimal("cat");
		AnimalI crow = Runner.getAnimal("crow");
	}

}
