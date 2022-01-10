package com.abhishek.JavaTutorials.queueExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();

		phoneBook.put("Abhi", 123456);
		phoneBook.put("amenda", 123456);
		phoneBook.put("robin", 123456);
		phoneBook.put("jbliee", 4567);
		phoneBook.put("Gary", 1256);
		phoneBook.put("Kevin", 897653);

		System.out.println("Kevin phonebook is: " + phoneBook.get("Kevin"));

		System.out.println("\nList of contancts in phonebook:");

		for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}


	}

}
