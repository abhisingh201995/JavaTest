package com.abhishek.Java_Test;

public class DefaultConstructor {

	// Java Program to demonstrate the use of the default constructor by
	// complier.
	int id = 5;
	String name = "abhi";

	DefaultConstructor() {

		System.out.println("This is a default constructor");
	}
	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		DefaultConstructor s1 = new DefaultConstructor();
		// calling method to display the values of object
		s1.display(); // default constructor will provide the values to the
		              // object
	}

}
