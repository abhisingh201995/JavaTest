package com.abhishek.Java_Test;

import java.util.Scanner;

public class PatternTest3 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows :");
		int rows = scan.nextInt();
				
		int alphabet = 65;
		int num = 1;
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++)
			{
				if (i % 2 == 0) {
					System.out.print((char) (alphabet));
				}
				else {
					System.out.print(num);
				}
			}
			 if (i % 2 == 0) {
			 alphabet++;  
			 } 
			 else { 
				 num++; 
			 }
			  System.out.println();	 
		}
		scan.close();
	}
}
