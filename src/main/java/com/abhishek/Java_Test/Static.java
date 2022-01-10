package com.abhishek.Java_Test;

public class Static {

	static int i = 2;

	int p = 6;

	static void display() {
		System.out.println("This is a static method");

		// System.out.println("dvwafefe" + p);

	}

	void display11() {
		System.out.println("Normal method");

		System.out.println("dvwafefe" + i);

		display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static st = new Static();
		Static st1 = new Static();

		st.i = 5;

		st.p = 4;

		System.out.println(st.i);
		System.out.println(st1.i);

		System.out.println(st.p);
		System.out.println(st1.p);

	}

}
