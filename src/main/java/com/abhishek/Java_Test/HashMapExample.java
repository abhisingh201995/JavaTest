package com.abhishek.Java_Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap<String, String> map1 = new HashMap<String, String>();

		Map<String, String> map = new HashMap<String, String>();

		map.put("In", "India");
		map.put("Aus", "Australia");
		map.put("Br", "Brazil");
		map.put("Us", "USA");
		map.put("Aus", "xyz");
		map.put("", "");
		map.put("", "pqr");



		// Iterate it through

		for (Map.Entry<String, String> m : map.entrySet()) {

			System.out.println("Ist list ios " + m.getKey() + " " + m.getValue());

		}

		/*
		 * HashMap allow one null key or many null values
		 */
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(null, null);
		map1.put(null, null);
		map1.put(2, null);
		map1.put(3, null);

		for (Map.Entry<Integer, Integer> m : map1.entrySet()) {

			System.out.println("2nd list ios " + m.getKey() + " " + m.getValue());

		}

	}

}
