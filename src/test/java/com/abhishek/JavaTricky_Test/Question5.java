package com.abhishek.JavaTricky_Test;

public class Question5 {

	String name;
	String n1 = "abc";
	String n2 = "abc";


	Question5(String n) {
		name = n;
	}

	public static void main(String[] args) {

		Question5 m1 = new Question5("TV");
		Question5 m2 = new Question5("TV");
		System.out.println(m1.equals(m2)); // comparing reference and not the
		                                   // values
	}

	@Override
	public boolean equals(Object obj) {
		Question5 m = (Question5) obj;
		if (m.name != null) {
			return true;
		}
		return false;
	}

}


