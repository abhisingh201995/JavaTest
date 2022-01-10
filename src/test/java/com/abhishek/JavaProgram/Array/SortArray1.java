package com.abhishek.JavaProgram.Array;

import java.util.Arrays;

public class SortArray1 {

	// given an array

	static int arr[] = { 1, 12, 43, 23, 56, 67 };

	// sorting this array in ascending order using sort() method.
	// Arrays class reside into java.util package
	// sort() is a static method so we can call it directly from
	// classname.method() name.

	public static void main(String[] args) {

		Arrays.sort(arr);

		System.out.println("The sorted array will be like :");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
