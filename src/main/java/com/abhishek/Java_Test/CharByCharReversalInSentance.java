package com.abhishek.Java_Test;

import java.util.Scanner;

public class CharByCharReversalInSentance {

	/*
	 * In this approach, we will be using the String split(), charAt(), length()
	 * and StringBuilder class append append() methods.
	 * 
	 * A) First split the given string by whitespace. B) Take the first word and
	 * reverse it. Finally, add the reversed word to the new StringBuilder.
	 * Append the white space at the end of each word. C) Repeat step B for all
	 * words. D) Finally, covert StringBuilder into String using the toString()
	 * method.
	 */

	public static void main(String args[]) {

		System.out.println("Please enter the 1st sentance to reverse it :");
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String output1 = reverseWordsWithStringBuilder(input1);
		System.out.println(" input 1 : " + input1);
		System.out.println(" output 1 : " + output1);
		scan.close();
	}

	public static String reverseWordsWithStringBuilder(String input) {

		StringBuilder reversedFinalOutput = new StringBuilder();

		String[] words = input.split(" ");

		for (String word : words) {

			StringBuilder reversedWord = new StringBuilder();

			for (int i = word.length() - 1; i >= 0; i--) {
				reversedWord.append(word.charAt(i));
			}
			StringBuilder str = reversedFinalOutput.append(reversedWord).append(" ");

			System.out.println("" + str);
		}

		String finalOutputStr = reversedFinalOutput.toString();
		return finalOutputStr;

	}
}
