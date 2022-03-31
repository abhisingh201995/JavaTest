package com.abhishek.Java_Test;

public class Derived extends StaticPrivate_Example {

	private static void display() {
		System.out.println("Static or class method from Derived");
	}

	@Override
	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}

}
