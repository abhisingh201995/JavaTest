package com.abhishek.JavaTricky_Test;

public class Question2 {

	void displayInterestRate() {

		System.out.println("4.0%");
	}
	
	public static void main(String[] args) {

		QuestionPaper qp = new QuestionPaper();
		qp.displayInterestRate();

		Question2 q2 = new Question2();
		q2.displayInterestRate();
	}
}

	class QuestionPaper extends Question2 {

	@Override
	void displayInterestRate() {
			System.out.println("4.5%");
		}

	}

