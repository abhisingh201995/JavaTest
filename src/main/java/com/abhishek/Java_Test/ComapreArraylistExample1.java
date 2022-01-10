package com.abhishek.Java_Test;

import java.util.ArrayList;
import java.util.List;

public class ComapreArraylistExample1 {
	public static void main(String args[]) {
		// first array list
		ArrayList<String> firstList = new ArrayList<String>();
		// adds elements to the arraylist
		firstList.add("Apple");
		firstList.add("Pears");
		firstList.add("Guava");
		firstList.add("Mango");
		System.out.println(firstList);
		// second array list
		List<String> secondList = new ArrayList<String>();
		// adds elements to the arraylist
		secondList.add("Apple");
		secondList.add("Pears");
		secondList.add("Mango");
		secondList.add("Guava");

		System.out.println(secondList);
		// comparing both lists
		boolean boolval = firstList.equals(secondList); // returns true because
		                                                // lists are equal
		System.out.println(boolval);
		// adding another element in the second list
		secondList.add("Papaya");
		// again comparing both lists
		boolean bool = firstList.equals(secondList); // returns false because
		                                             // lists are not equal
		System.out.println(bool);
	}
}

