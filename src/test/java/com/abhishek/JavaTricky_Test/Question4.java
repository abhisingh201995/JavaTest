package com.abhishek.JavaTricky_Test;

public class Question4 {

	public static void gfg(String s) {

		System.out.println("String");
	}

	public static void gfg(Object o) {

		System.out.println("Object");
	}

	public static void main(String[] args) {
		gfg(null);
	}

}

// In Java method overloading the most specific method is chosen first at the
// compile time when two similar methods are there in the program.
