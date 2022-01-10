package com.abhishek.JavaTutorials;

public class StringDemo {

	public static void main(String[] args) {

		// String is a class not a datatype.

		// Strings can be defined into two ways : String literals and by String
		// object class

		String a = "hello"; // String literal - Immutable
		String b = "hello"; // Memory will not be allocated this time as already
		                    // a same type of content is present in the heap
		                    // memory.
		// It will first check the content inside memory

		a.concat("world");
		System.out.println(a);// It will not append that string, coz string
		                      // class is immutable class.

		String c = a.concat("world");// Here it will concat and form new string
		                             // as a new object/reference has been
		                             // created which will not alter the
		                             // original content.
		System.out.println(c);

		// By String object class

		String s = new String("hello");
		String s1 = new String("hello");// String class created new object every
		                                // time. It will not check the memory

		System.out.println(a.equals(b)); // Equals method check for content.
		                                 // Return TRUE

		System.out.println(a == b); // == operator checks for object reference.
		                            // Return TRUE

		System.out.println(a.equalsIgnoreCase(b)); // TRUE

		System.out.println(a == s); // FALSE. It will fail matching the
		                            // reference.

		System.out.println(s == s1);// FALSE. References are different as they
		                            // are defined with the string class

		// How to overcome with this Immutable things ---- > Use StringBuffer or
		// StringBuilder class

		// StringBuffer class -- > Thread safe , Synchronized, slower

		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);

		// We can also use methods like - insert , replace, deleteCharAt,
		// reverse

		// StringBuffer class -- > not Thread safe , non-Synchronized, faster
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append("world");
		System.out.println(sb1);
	}

}
