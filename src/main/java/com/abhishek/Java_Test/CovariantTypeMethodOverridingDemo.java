package com.abhishek.Java_Test;

public class CovariantTypeMethodOverridingDemo {

	// defining a method
	CovariantTypeMethodOverridingDemo run() {
		System.out.println("Vehicle is running");
		return this;
	}

	public static void main(String args[]) {
		Bike obj = new Bike();// creating object
		obj.run();// calling method
	}
}

// Creating a child class
class Bike extends CovariantTypeMethodOverridingDemo {
	// defining the same method as in the parent class
	@Override
	Bike run() {
		System.out.println("Bike is running safely");
		return this;
	}

	// Till java 5 we were unable to achieve method overriding by changing the
	// return type of method.

	// The covariant return type specifies that the return type may vary in the
	// same direction as the subclass.

}
