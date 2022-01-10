package com.abhishek.Java_Test;

import java.util.Scanner;

public class ReverseString {
	
	static String rev;

	public static void main(String[] args) {
		
		System.out.println("Enter the String to Reverse:");
		
	    Scanner scan = new Scanner(System.in);
	    
	    String str = scan.nextLine();
	    
	    int length = str.length();
	    	    
	    System.out.println("Length of given string is :"+length);
	    
	    String rev = "";
	     
	    for(int i = length-1;i>=0;i--) {
	    	
	    	rev = rev + str.charAt(i);
	    
	    }
	    
	    System.out.print("Reverse of a string is :" + rev);
	    
	    scan.close();
	}

}
