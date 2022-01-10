package com.abhishek.Java_Test;

import java.util.Scanner;

public class VerifyPalindromeNumber {

	public static void main(String args[]) {

		System.out.println("Please enter a number to verify :");

		int rem, sum = 0, temp;

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		temp = input;

		while (input > 0) {

			rem = input % 10; // remainder

			System.out.println(".." + rem);
			sum = (sum * 10) + rem;

			System.out.println("...." + sum);

			input = input / 10; // quotient

			System.out.println("........" + input);
		}

		if (temp == sum) {
			System.out.println("The given number is a plaindrome");
		}

		else {
			System.out.println("Number is not a plaindrome");
		}
		scan.close();
	}

}
