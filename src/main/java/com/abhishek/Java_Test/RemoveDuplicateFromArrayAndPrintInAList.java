package com.abhishek.Java_Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayAndPrintInAList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] abc = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };

		Set<Integer> duplicateRemoval = new LinkedHashSet<Integer>();

		for (int i = 0; i <= abc.length - 1; i++) {

			duplicateRemoval.add(abc[i]);

		}

		System.out.println("The array without duplicate is: " + duplicateRemoval);

	}

}
