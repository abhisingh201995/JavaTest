package com.abhishek.Java_Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayListDuplicateDemo {

	public static void main(String args[]) {

		// creating ArrayList with duplicate elements

		List<Integer> primes = new ArrayList<Integer>();

		System.out.println("Enter the list of numbers :");

		Scanner scan = new Scanner(System.in);

		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		int val3 = scan.nextInt();
		int val4 = scan.nextInt();
		int val5 = scan.nextInt();

		primes.add(val1);
		primes.add(val2);
		primes.add(val3); // duplicate
		primes.add(val4);
		primes.add(val5);

		// let's print arraylist with duplicate

		System.out.println("ArrayList with duplicate are as :" + primes);

		// Now let's remove duplicate element without affecting order
		// LinkedHashSet will guaranteed the order and since it's set
		// it will not allow us to insert duplicates.
		// repeated elements will automatically filtered.

		Set<Integer> primeswithoutduplicate = new LinkedHashSet<Integer>(primes);

		// now let's clear the ArrayList so that we can copy all elements from
		// LinkedHashSet

		primes.clear();

		// copying elements but without any duplicates
		primes.addAll(primeswithoutduplicate);

		System.out.println("list of primes without duplicates : " + primes);
		scan.close();
	}

}
