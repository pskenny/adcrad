package com.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Lab1 but with dependency injection magic from Spring

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Person person = (Person) context.getBean("personBean");
		person.sayHello();
	}

}
