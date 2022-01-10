package com.abhishek.JavaTutorials.queueExamples;

public class StaticBlockExample {

	// Static block
	static {

		System.out.println("This is static block");
	}

	// Simple method
	void simpleMethod() {
		System.out.println("This is a simple method.");
	}

	// Constructor calling
	public StaticBlockExample() {
		System.out.println("this is a cpnstructor block.");
	}

	// Initiated block for the same
	{
		System.out.println("this block is to just initiation.");
	}

	public static void main(String[] args) {

		StaticBlockExample staticBlockExample = new StaticBlockExample();
		staticBlockExample.simpleMethod();

	}

}
