package com.abhishek.Java_Test;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[]) {

		System.out.println("Please enter the number :");

		Scanner scan = new Scanner(System.in);

		int input, sum = 0;

		input = scan.nextInt();

		for (int i = 1; i < input; i++) {

			if (input % i == 0) {

				sum = sum + i;
			}

		}
		if (sum == input) {

			System.out.println("Given number is perfect");
		}

		else {
			System.out.println("Given number is not perfect");
		}

		scan.close();
	}

}
