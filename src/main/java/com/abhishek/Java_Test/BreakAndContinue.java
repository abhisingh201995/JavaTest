package com.abhishek.Java_Test;

public class BreakAndContinue {

	public static void main(String args[]) {

		// Illustrating break statement (execution stops when value of i becomes
		// to 4.)
		System.out.println("Break Statement\n");
		for (int i = 1; i <= 5; i++) {
			if (i == 4)
				break; // It will make you out of the loop

			System.out.println(i);
		}

		// Illustrating continue statement (execution skipped when value of i
		// becomes to 1.)
		System.out.println("Continue Statement\n");
		for (int i = 1; i <= 5; i++) {
			if (i == 2)
				continue; // It will backfire to the first line of code
				          // execution

			System.out.println(i);

		}
	}

}
