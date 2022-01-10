package com.abhishek.JavaProgram.Array;

import java.util.Arrays;

public class SortArrayInDescending2 {

	// given an array

	static int arr[] = { 1, 12, 33, 43, 23, 56, 67 };

	static int temp;


	// sorting this array in ascending order using loop

	public static void main(String[] args) {
		


		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if (arr[i] < arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;


				}
			}
			System.out.println(arr[i]);


		}
		System.out.println("Descending order arrays list will be:" + Arrays.toString(arr));
			
		}
	}

