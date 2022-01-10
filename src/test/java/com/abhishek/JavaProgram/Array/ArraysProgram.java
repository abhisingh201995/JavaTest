package com.abhishek.JavaProgram.Array;

public class ArraysProgram {

	// static int arr[] = { 1, 2, 4, 5, 3, 10 };

	static int arr[] = { 12, 2, 4, 5, 3, 10 };

	// sum should be 8
	// static int temp = 8;

	static int temp = 24;

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				for (int k = j + 1; k < arr.length; k++) {

					int result = arr[i] + arr[j] + arr[k];

					if (result == temp) {

						System.out.println("the three number are :" + arr[i] + " " + arr[j] + " " + arr[k]);
					}

				}

			}
		}

	}

}
