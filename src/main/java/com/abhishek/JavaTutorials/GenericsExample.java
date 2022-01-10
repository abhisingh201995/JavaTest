package com.abhishek.JavaTutorials;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {

		// Example without generics
		List names = new ArrayList();
		names.add("Abhi");
		names.add("kyle");
		names.add("pokemon");

		/**
		 * If we don't define the generic, we have to cast every time
		 */
		String name1 = (String) names.get(2);
		System.out.println("First Name: " + name1);


		// Example with generics
		List<String> names2 = new ArrayList();
		names2.add("Abhi");
		names2.add("kyle");
		names2.add("pokemon");

		String name2 = names2.get(2);
		System.out.println("First Name: " + name2);

	}
}
