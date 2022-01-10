package com.abhishek.Java_Test;

import java.util.Scanner;

public class WordByWordReversalInSentance {

	public static void main(String args[]) {

		System.out.println("Please enter the sentance to reverse it :");

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		String s[] = input.split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {

			ans += s[i] + " ";

		}
		System.out.println("Reversed String: " + ans);
		scan.close();
	}
}
