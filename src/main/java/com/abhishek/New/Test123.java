package com.abhishek.New;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test123 {

	/**
	 * array 1 = [3, 5, 5, 1, 9, 9, 7, 11] array 2 = [6, 8, 8, 2, 4, 4, 10, 12]
	 * 
	 * 1. Merge both the arrays 2. Sorted 3. No duplicates
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.out.println("Merged array is:");

		// TODO Auto-generated method stub
		 // first array
        int a[] = {3, 5, 5, 1, 9, 9, 7, 11};
        // second array
        int b[] = {6, 8, 8, 2, 4, 4, 10, 12};
  
        // determining length of first array
        int a1 = a.length;
        // determining length of second array
        int b1 = b.length;
  
        // resultant array size
        int c1 = a1 + b1;
  
        // Creating a new array
        int[] c = new int[c1];
  
        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }
  
        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {
  
            // Storing the elements in the 
            // resultant array
            c[a1 + i] = b[i];
        }
  
        // Loop to print the elements of 
        // resultant array after merging
        for (int i = 0; i < c1; i = i + 1) {
              
            // print the element
            System.out.println(c[i]);

        }

		// sort an array

		int i = 0;

		System.out.println("\n");
		
		System.out.println("Sorted array is:");

		for (i = 0; i < c1; i++) {

			for (int j = i + 1; j < c1; j++) {

				int temp = 0;

				if (c[i] > c[j]) {

					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}

			}

			System.out.println(c[i]);
		}

		// Remove duplicates
		System.out.println("ArrayList with duplicate are as :" + c[i]);

		List<Integer> finalArrayList = new ArrayList<>();

		finalArrayList.add(c[i]);
		
		System.out.println("The final arraylist " + finalArrayList);

		Set<Integer> primeswithoutduplicate = new LinkedHashSet<Integer>(finalArrayList);

		finalArrayList.clear();

		finalArrayList.addAll(primeswithoutduplicate);

		System.out.println("List of sorted arrays without duplicates : " +
		        finalArrayList);
	}

}
