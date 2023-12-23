package com.rays.collectionProgram.Comparater;

public class Employee {

	private String name;
	private int id;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int id, int salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return (name + " " + id + " " + salary);
	}

}
