package com.abhishek.Java_Test;

public class SuperKeywordConstructorCallDemo2 {
	
	SuperKeywordConstructorCallDemo2() {
		System.out.println("animal is created");
	}
}

class Dog1 extends SuperKeywordConstructorCallDemo2 {
	Dog1() {
		System.out.println("dog is created");
	}

	public static void main(String[] args) {
		Dog1 d = new Dog1();
	}
}



