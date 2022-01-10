package com.abhishek.Java_Test;

class SuperConstructorRealUse {
	int id;
	String name;

	SuperConstructorRealUse(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Emp e1 = new Emp(1, "ankit", 45000f);
		e1.display();
	}
}

class Emp extends SuperConstructorRealUse {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);// reusing parent constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

}

