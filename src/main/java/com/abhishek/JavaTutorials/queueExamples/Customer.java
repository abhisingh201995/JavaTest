package com.abhishek.JavaTutorials.queueExamples;

public class Customer {

		/**
		 * Queue helps in FIFO data structures.
		 */

	private boolean hasBeenServed;
	private String name;

	/**
	 * This will get called when a new customer will be created....
	 * 
	 * @param name
	 */
	public Customer(String name) {
		hasBeenServed = false;
		this.name = name;
	}

	public void serve() {
		hasBeenServed = true;
		System.out.println(name + " has been served");
	}

	@Override
	public String toString() {
		return name;
	}

}
