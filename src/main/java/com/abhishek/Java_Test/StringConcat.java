package com.abhishek.Java_Test;

public class StringConcat {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abc";

		String b = a + "pqr";

		System.out.println(b);

		// Heap memory -- > abc , abcpqr

		// String constant pool --- > abc , pqr

	}

}
