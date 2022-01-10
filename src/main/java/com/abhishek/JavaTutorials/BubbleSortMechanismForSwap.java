package com.abhishek.JavaTutorials;

public class BubbleSortMechanismForSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 8, 4, 2, 6, 7, 9, 1 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				// swap using a variable

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

				// Swap without using a third variable

				if (a[i] > a[j]) {

					a[i] = a[i] + a[j];

					a[j] = a[i] - a[j];

					a[i] = a[i] - a[j];
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("The sorted array is : " + a[i]);
		}

	}

}
