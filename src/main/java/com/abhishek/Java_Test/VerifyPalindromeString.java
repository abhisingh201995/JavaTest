package com.abhishek.Java_Test;

import java.util.Scanner;

public class VerifyPalindromeString {

	public static void main(String args[]) {

		System.out.println("Please enter a string to verify :");

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			rev += input.charAt(i);
		}

		if (input.equalsIgnoreCase(rev)) {
			System.out.println("The given string is a plaindrome");
		}

		else {
			System.out.println("String is not a plaindrome");
		}
		scan.close();
	}


}
