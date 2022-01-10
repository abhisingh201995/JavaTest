package com.abhishek.Java_Test;

import java.util.Scanner;

public class FibonacciSeriesWithRecursion {

	// Fibonacci Series will be like : 0 , 1, 1 , 2, 3, 5, 8...

	static int n1 = 0, n2 = 1, n3 = 0;

	static void fibonacciMethod(int Count) {

		if (Count > 0) {

			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
			fibonacciMethod(Count - 1);

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the count");
		int count = scan.nextInt();

		System.out.print(n1 + " " + n2);

		FibonacciSeriesWithRecursion.fibonacciMethod(count - 2); // because starting 2 numbers are already printed

		scan.close();

	}

}
