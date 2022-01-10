package com.abhishek.JavaTutorials;

public class Varargs {

	public static void main(String[] args) {
		String item1= "Apples";
		String item2= "Banana";
		String item3= "Orange";
		
		String[] shopping = { "Bread", "Milk", "Eggs", "abcd" };
		printShoppingList(item1, item2);
		printShoppingList(shopping);

	}

	/*
	 * public static void printShoppingList(String item1, String item2) {
	 * System.out.println("SHOPPING LIST"); System.out.println("1. " + item1);
	 * System.out.println("2. " + item2);
	 * 
	 * }
	 * 
	 * public static void printShoppingList(String item1, String item2, String
	 * item3) { System.out.println("SHOPPING LIST"); System.out.println("1. " +
	 * item1); System.out.println("2. " + item2); System.out.println("3. " +
	 * item3);
	 * 
	 * }
	 */

	/*
	 * public static void printShoppingList(String[] items) {
	 * System.out.println("SHOPPING LIST");
	 * 
	 * int i = 0;
	 * 
	 * for (String item : items) { System.out.println(i + 1 + ":" + item); i++;
	 * }
	 * 
	 * }
	 */

	/**
	 * Varargs method will fullfill my all need..no need to create seprate
	 * method for different args number....
	 * 
	 * 
	 * @param items
	 */

	public static void printShoppingList(String... items) {
		System.out.println("SHOPPING LIST");

		int i = 0;

		for (String item : items) {
			System.out.println(i + 1 + ":" + item);
			i++;
		}

	}

}
