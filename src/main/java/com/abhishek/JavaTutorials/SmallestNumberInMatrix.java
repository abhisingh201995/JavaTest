package com.abhishek.JavaTutorials;

public class SmallestNumberInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int arr[][] = { { 4, 3, 4 }, { 5, 6, 7 }, { 8, 4, 2 } };
		
		int i = 0;
		int j = 0;

		int min = arr[i][j];

		for (i = 0; i < arr.length; i++) // for rows

		{

			for (j = 0; j < arr[0].length; j++) { // for column

				if (min > arr[i][j]) { // for max just reverse this condition

					min = arr[i][j];
					System.out.println("The column value is : " + j);
					}
				}
				
			}
		System.out.println("The smallest Number from matrix is: " + min);
		}
	}

