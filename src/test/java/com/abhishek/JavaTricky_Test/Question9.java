package com.abhishek.JavaTricky_Test;

public class Question9 {

	private int data;

	public Question9() {
		
		data=5;
	}

	public int getData() {

		return this.data;
	}

	public static void main(String[] args) {

		Derived myData = new Derived();
		System.out.println(myData.getData());

		Question9 q9 = new Question9();
		System.out.println(q9.getData());

		// Derived d = (Derived) new Question9();
		// If you perform downcasting by typecasting, ClassCastException is
		// thrown at runtime.
	}

}

class Derived extends Question9 {

	private int data;

	public Derived() {

		data = 6;
	}

	// If we declare this method as private then we are making it more
	// restrictive in nature... so CTError it will throw
	@Override
	public int getData() {

		return data;
	}
}
