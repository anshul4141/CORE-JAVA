package com.rays.oopProgram;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee1 e = new Employee1("Anshul");

		Employee1 e2 = (Employee1) e.clone();
		// Employee1 e2 = (Employee1) e;

		e2.name = "Shyam";
		e2.address.city = "Mathura";
		System.out.println(e.name);
		System.out.println(e.address.city);
		System.out.println(e2.name);
		System.out.println(e2.address.city);

	}

}
