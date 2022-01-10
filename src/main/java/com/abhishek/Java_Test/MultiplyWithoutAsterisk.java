package com.abhishek.Java_Test;

public class MultiplyWithoutAsterisk {

	int a;
	static int result = 0;

	public int multiply(int a, int b) {

		for (int i = 1; i <= b; i++) {

			result = result + a;

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiplyWithoutAsterisk mr = new MultiplyWithoutAsterisk();

		mr.multiply(4, 5);
		System.out.println(result);
		
	}
}