package com.rays.collectionProgram;

public class TestEqualAndHashCode {

	public static void main(String[] args) {

		EqualAndHashCode e1 = new EqualAndHashCode("Anshul", 100, 50);
		EqualAndHashCode e2 = new EqualAndHashCode("Anshul", 100, 50);
		// Student e2 = new Student("sdfdf", 50);

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
