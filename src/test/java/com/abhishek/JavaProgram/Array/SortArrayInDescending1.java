package com.abhishek.JavaProgram.Array;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescending1 {

	// sorting this array in descending order using reverseOrder() method.
	// Java Collections class provides the reverseOrder() method to sort the
	// array
	// It is a static method, so we can invoke it directly by using the class
	// name. It does not parse any parameter.
	// the array sorts elements in the ascending order by using the sort()
	// method, after that the reverseOrder() method reverses the natural
	// ordering, and we get the sorted array in descending order.

	// In the following program, a point to be noticed that we have defined an
	// array as Integer. Because the reverseOrder() method does not work for the
	// primitive data type.

	public static void main(String[] args) {
		// given an array

		Integer arr[] = { 1, 12, 43, 23, 56, 67 };

		Arrays.sort(arr, Collections.reverseOrder());

		// System.out.println("Descending order arrays list will be:" +
		// Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
