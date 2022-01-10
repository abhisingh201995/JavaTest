package com.abhishek.Java_Test;

public class StringRemoveWhiteSpace {
	
	/**
	 * Java program to remove while space in String. In this program we will
	 * see techniques to remove white space not only from beginning and end by using
	 * trim() method of String class but also remove white space between String in Java.
	 * e.g.  " ABC DEF " will turn to "ABCDEF". replaceAll() accepts regular expression
	 * and \s can be used to remove all white space from String including space between
	 * words.
	 *
	 */

	public static void main(String[] args) {
		
		//removing white space from String from beginning and end in Java      
        String strWhiteSpace = "    This String contains White Space at beginning and end and middle    ";
		
        
        System.out.printf("String before removing White space : %n %s %n", strWhiteSpace);
        System.out.printf("length of String before removing white space %d : %n", strWhiteSpace.length());
        
        String strWithoutWhiteSpace = strWhiteSpace.trim();	
        
        System.out.printf("String without White Space is %s : %n",strWithoutWhiteSpace);
        
        System.out.printf("length of String after removing white space %d : ",strWithoutWhiteSpace.length());

	}

}
