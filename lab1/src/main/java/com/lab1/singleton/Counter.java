package com.lab1.singleton;

/*
 * Singleton design pattern example (restricts instantiation of this class to one).
 */
public class Counter {
	private int total = 0;
	/*
	 * This is eager initialisation, others can be done, see
	 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
	 */
	private static final Counter COUNTER = new Counter();

	/*
	 * Make constructor private so you can't do this outside the class:
	 * 
	 * Counter c = new Counter();
	 * 
	 * You must use the factory method ensuring only a single instance is used.
	 */
	private Counter() {
	}

	public static Counter getInstance() {
		return COUNTER;
	}

	public void incrementTotal() {
		this.total++;
	}

	public int getTotal() {
		return this.total;
	}
}
