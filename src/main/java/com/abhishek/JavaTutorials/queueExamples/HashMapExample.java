package com.abhishek.JavaTutorials.queueExamples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Abhi", 123456);
		phoneBook.put("amenda", 123456);
		phoneBook.put("robin", 123456);
		phoneBook.put("jbliee", 123456);

		if (phoneBook.containsKey("jbliee")) {

			phoneBook.remove("jbliee");

		}

		// System.out.println(phoneBook);

		phoneBook.clear();

		System.out.println(phoneBook);

	}

}
