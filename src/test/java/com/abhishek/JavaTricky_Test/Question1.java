package com.abhishek.JavaTricky_Test;

public class Question1 {

	public static void main(String[] args) {
		method();
	}

	public static boolean method() {
		int a[] = {10,20,30};
		
		try {
			System.out.println(a[2]);
			return true;
		}
		finally {
			System.out.println("END");
		}
	}

}
