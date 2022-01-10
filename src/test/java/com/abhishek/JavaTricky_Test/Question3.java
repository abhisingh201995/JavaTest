package com.abhishek.JavaTricky_Test;

public class Question3 {

	int num = 100;

	public int calc(int num) {
		this.num = num * 10;
		return num;
	}

	public void printNum() {

		System.out.println(num);
	}

	public static void main(String[] args) {
		Question3 q3 = new Question3();
		int num1 = q3.calc(2);
		q3.printNum();
		System.out.println(num1);

	}
}

// If a class instance variable is same as method local variable & if this
// keyword is used to reference method local variable then,
// Preference is given to method local variable.