package com.abhishek.Java_Test;

import java.util.Scanner;

public class PatternTest2
{            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();    
        for (int i = 1; i <= rows; i++) 
        {
        	int alphabet = 65;
        	int num=1;
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                	System.out.print((char) (alphabet));
                	alphabet++;
                }
                else
                { 
                    System.out.print(num); 
                    num++; 
                }               
            }              
            System.out.println();
        }
        sc.close();
    }
}