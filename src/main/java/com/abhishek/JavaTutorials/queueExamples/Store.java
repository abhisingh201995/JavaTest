package com.abhishek.JavaTutorials.queueExamples;

import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {

		LinkedList<Customer> queue = new LinkedList();
		queue.add(new Customer("sally"));
		queue.add(new Customer("rahul"));
		queue.add(new Customer("abhi"));
		queue.add(new Customer("sekh"));
		queue.add(new Customer("xyz"));
		queue.add(new Customer("picasa"));
		System.out.println(queue);
		serveCustomer(queue);
		System.out.println(queue);
	}

	static void serveCustomer(LinkedList<Customer> queue) {

		for (int i = queue.size(); i > 0; i--) {
		Customer c = queue.poll();
		c.serve();
		}

	}

}
