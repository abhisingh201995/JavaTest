package com.abhishek.Java_Test;

class SuperKeywordConstructorCallDemo {
	SuperKeywordConstructorCallDemo() {
		System.out.println("animal is created");
	}

	void run() {

		System.out.println("Parent systen is running");
	}
		
		public static void main(String args[]) {
		new Dog();
	}

}

class Dog extends SuperKeywordConstructorCallDemo {
	Dog() {
		super();// Note: super() is added in each class constructor
		        // automatically by compiler if there is no super() or this().
		run();
		System.out.println("dog is created");
		super.run();
		this.run();
	}

	@Override
	void run() {

		System.out.println("Child system is running");
	}
}


