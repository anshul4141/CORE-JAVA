package com.rays.collectionProgram.Comparable;

public class Student implements Comparable<Student> {

	String name;
	int id;

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Student o) {

		// return this.name.compareTo(o.name); // Shorting by Name
		// return this.id - o.id; // Shorting by id Ascending Order
		// return o.id - this.id; // Shorting by id Descending Order
		if (this.id == o.id) {

			return this.name.compareTo(o.name);

		} else {

			return this.id - o.id;

		}
	}

	@Override
	public String toString() {

		return (name + " " + id);

	}

}
