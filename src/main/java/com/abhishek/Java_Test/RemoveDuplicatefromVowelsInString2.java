package com.abhishek.Java_Test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatefromVowelsInString2 {

	public static void main(String args[]) {

		System.out.println("Please enter the string :");

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		char[] letters = input.toCharArray();

		int count = 0;
		String vowel = "";

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

					vowel += c;
					count++;
			}
		}

		System.out.println("The vowel in given string [" + input + "] is: " + vowel);
		System.out.println("Number of vowel in given string [" + input + "] is : " + count);

		// Remove the duplicate character in a string.............

		// Create LinkedHashSet of type character
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		// Add each character of the string into LinkedHashSet
		for (int i = 0; i < vowel.length(); i++) {
			set.add(vowel.charAt(i));
		}

		// print the string after removing duplicate characters

		String str = "";

		for (Character ch : set) {
			str += ch;
		}

		System.out.print("The vowel in given string without duplicate is: " + str);
		scan.close();
	}
}
