package com.abhishek.Java_Test;

public class MethodOverridingDemo {

	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}

	public static void main(String args[]) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method

		MethodOverridingDemo obj1 = new MethodOverridingDemo();
		obj1.run();

		Bike2 obj2 = (Bike2) new MethodOverridingDemo();
		obj2.run();

	}
}

// Creating a child class
class Bike2 extends MethodOverridingDemo {
	// defining the same method as in the parent class
	@Override
	void run() {
		System.out.println("Bike is running safely");
	}



}
