package com.abhishek.JavaTutorials;

public class MaxValueFromThatColumnWhereSmallestNumberInMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int arr[][] = { { 4, 3, 4 }, { 5, 6, 7 }, { 8, 4, 2 } };
		
		int i = 0;
		int j = 0;

		int coloumnNumber = 0;

		int min = arr[i][j];

		for (i = 0; i < arr.length; i++)

		{

			for (j = 0; j < arr[0].length; j++) {

				if (min > arr[i][j]) { // for max just reverse this condition

					min = arr[i][j];
					coloumnNumber = j;
					}
				}
				
			}
		System.out.println("The smallest Number from matrix is: " + min);

		int k = 0;
		int maxNum = arr[k][coloumnNumber];
		while (k < arr.length) {

			if (maxNum < arr[k][coloumnNumber]) {

				maxNum = arr[k][coloumnNumber];
				
			}
			k++;
		}
		System.out.println("The max number found is: " + maxNum);
		}
	}

