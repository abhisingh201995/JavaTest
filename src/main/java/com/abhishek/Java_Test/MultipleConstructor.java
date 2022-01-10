package com.abhishek.Java_Test;

public class MultipleConstructor {

	// Java Program to demonstrate the use of the parameterized constructor.
	int id;
	String name;

	// creating a parameterized constructor
	MultipleConstructor(int i, String n) {
	    id = i;  
	    name = n;  
	    }

	public MultipleConstructor() {
		// This is a default constructor
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		MultipleConstructor s1 = new MultipleConstructor();
		MultipleConstructor s2 = new MultipleConstructor(222, "Aryan");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}

}
