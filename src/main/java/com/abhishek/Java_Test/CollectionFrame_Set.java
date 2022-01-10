package com.abhishek.Java_Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionFrame_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("b");
		set.add("ac");
		set.add("");
		set.add("112");
		set.add("");
		set.add("1a1");
		set.add("1a1");


		for (String str : set) {

			System.out.println("Print the value: " + str);
		}

		System.out.println("\n");

		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("1");
		set1.add("b");
		set1.add("ac");
		set1.add("");
		set1.add("112");
		set1.add("1a1");
		set1.add("1a1");
		set1.add("");


		Iterator<String> itr = set1.iterator();

		while (itr.hasNext()) {
			System.out.println("My linkedhasset is " + itr.next());
		}

	}

}
