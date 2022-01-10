package com.abhishek.Java_Test;

import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {

	// Fibonacci Series will be like : 0 , 1, 1 , 2, 3, 5, 8...


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the count");
		int count = scan.nextInt();

		int n1 = 0, n2 = 1, n3 = 0, temp = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= count; i++) {

			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			temp += n3;
		}
		System.out.println(" ");
		System.out.println("Sum is:" + temp);

		scan.close();
	}

}
