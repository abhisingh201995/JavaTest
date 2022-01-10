package com.abhishek.Java_Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionFrame_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		list1.add("abv");
		list1.add("pqr");
		list1.add(0, "zxc");
		list1.add(1, "123");
		list1.add("123");
		list1.add(null);
		list1.add(null);

		Iterator<String> itr = list1.iterator();

		while (itr.hasNext()) {

			// System.out.println("List hascode is: " + itr.hashCode());
			System.out.println("List1 next value is: " + itr.next());
			// System.out.println("List tostring is: " + itr.toString());

		}

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abv");
		list2.add("pqr");
		list2.add("xyz");

		System.out.println("List2 is: " + list2);

		List<Object> ll = new LinkedList<Object>();
		ll.add(1);
		ll.add("abc");
		ll.remove(0);

		System.out.println("List is: " + ll);

		List<String> vector = new Vector<String>();
		vector.add("abc");

		System.out.println(vector);

		List<String> stack = new Stack<String>();
		stack.add("123");
		stack.remove(0);

		System.out.println(stack);

	}

}
