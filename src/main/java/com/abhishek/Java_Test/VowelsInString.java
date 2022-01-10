package com.abhishek.Java_Test;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String args[]) {

		System.out.println("Please enter the string :");

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		char[] letters = input.toCharArray();

		System.out.println("List of char is" + letters);

		int count = 0;

		for (char c : letters) {

			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':

					count++;
					break;

			}
		}

		System.out.println("Number of vowel in given string [" + input + "] is : " + count);
		scan.close();
	}
}
