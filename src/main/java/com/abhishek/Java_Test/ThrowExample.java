package com.abhishek.Java_Test;

public class ThrowExample {

	/*
	 * Java throw keyword is used throw an exception explicitly in the code,
	 * inside the function or the block of code. we can only propagate unchecked
	 * exception i.e., the checked exception cannot be propagated using throw
	 * only. We are allowed to throw only one exception at a time i.e. we cannot
	 * throw multiple exceptions.
	 */

	public void checkNum(int num) {
		if (num < 1) {
			throw new ArithmeticException("Num is less than 1"); // throw is
			                                                     // used within
			                                                     // the method.
		} else {
			System.out.println("The square of number is:" + (num * num));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample obj = new ThrowExample();
		obj.checkNum(-3);
		System.out.println("Rest of the code..");

	}

}
