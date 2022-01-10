package com.abhishek.JavaTutorials;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {

	static Character[] charArray = { 'h', 'e', 'i', 'p' };
	static Integer[] intArray = { 1, 2, 3, 4, 5 };
	static Boolean[] boolArray = { true, false, true };

	public static List arrayToList1(Object[] array, List<Object> list) {

		for (Object object : array) {
			list.add(object);
		}
		return list;

	}

	/**
	 * We are making this method as a generic method with adding a generic type
	 * local variable called T..
	 * @param array
	 * @param list
	 * @return
	 */
	public static <T> List<T> arrayToList2(T[] array, List<T> list) {

		for (T object : array) {
			list.add(object);
		}
		return list;

	}

	public static void main(String[] args) {

		List<Character> charList = arrayToList1(charArray, new ArrayList<>());
		
		List<Integer> intList = arrayToList1(intArray, new ArrayList<>());

		List<Boolean> boolList = arrayToList1(boolArray, new ArrayList<>());

		System.out.println("BoolArray First object: " + boolList.get(1));

		/**
		 * List<String> boolList = arrayToList(boolArray, new ArrayList<>());
		 * 
		 * Problem with this approach is we are loosing the type safety of
		 * object... If we change the List type of boolean to string, no
		 * compilation error but on runtime it will show classCastException
		 */

		List<Object> charList1 = arrayToList2(charArray, new ArrayList<>());

		List<Object> intList1 = arrayToList2(intArray, new ArrayList<>());

		List<Object> boolList1 = arrayToList2(boolArray, new ArrayList<>());

		System.out.println("BoolArray First object: " + boolList1.get(1));

	}

}
