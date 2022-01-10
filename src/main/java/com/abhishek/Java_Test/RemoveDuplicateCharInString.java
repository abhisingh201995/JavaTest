package com.abhishek.Java_Test;

import java.util.Scanner;

public class RemoveDuplicateCharInString {

	public static void main(String args[]) {

		System.out.println("Please enter a string to verify :");

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();

		StringBuilder str2 = new StringBuilder(str1);

		// char[] ch = str1.toCharArray();

		System.out.println("str2 is :" + str2);

		for (int i = 0; i < str2.length() - 1; i++) {

			for (int j = 0; j < i; j++) {

				if (str1.charAt(i) == str2.charAt(j)) {

					str2 = str2.deleteCharAt(j);
				}
			}
		}

		System.out.println("String without duplicate is :" + str2);
		scan.close();
	}

}
