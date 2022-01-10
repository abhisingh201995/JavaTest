package com.abhishek.JavaTricky_Test;

class Question6 {

	public void displayInterestRate() throws NullPointerException {
		System.out.println("4.0%");
	}

	public static void main(String[] args) {
		Citibank citibank = new Citibank();
		citibank.displayInterestRate();
	}

}

class Citibank extends Question6 {

	@Override
	public void displayInterestRate() throws NullPointerException {
		System.out.println("4.5%");
	}
}

// throw C.T error for Exceptions in child clss coz child class cannot throw
// parent Exceptions of superclass
// exception.