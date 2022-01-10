package com.abhishek.JavaTutorials.queueExamples;

public class FunctIbterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctInterface gm = new FunctInterface() {

			@Override
			public void greet(String name) {
				// TODO Auto-generated method stub

				System.out.println("Hello " + name);

			}
		};

		gm.greet("Abhi");
	}

}
