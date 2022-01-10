package com.abhishek.Java_Test;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> map = new Hashtable<String, String>();

		map.put("In", "India");
		map.put("Aus", "Australia");
		map.put("Br", "Brazil");
		map.put("Us", "USA");
		map.put("Aus", "xyz");
		map.put("", "wonder");
		map.put("", "pqr");
		map.put("1", "abc");
		map.put("", "abc");

		for (Map.Entry<String, String> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

		/*
		 * HasTable doesn't allow any null key or value
		 */
		Map<Integer, Integer> map1 = new Hashtable<Integer, Integer>();
		// map1.put(null, null);
		// map1.put(null, null);
		// map1.put(2, null);
		map1.put(3, null);

		for (Map.Entry<Integer, Integer> m : map1.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
