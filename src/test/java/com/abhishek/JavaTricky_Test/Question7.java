package com.abhishek.JavaTricky_Test;

public class Question7 {

	public String type = "a ";

	public Question7() {

		System.out.println("alpha ");
	}

	public static void main(String[] args) {

		Beta beta = new Beta();
		beta.go();

	}
}

class Beta extends Question7 {

		public Beta() {
			System.out.println("beta ");
		}
		
	// String type = "b ";

	void go() {

		type = "b ";
			System.out.println(this.type + super.type);

	}

	}


