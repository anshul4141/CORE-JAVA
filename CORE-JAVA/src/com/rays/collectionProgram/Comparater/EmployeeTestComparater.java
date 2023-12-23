package com.rays.collectionProgram.Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTestComparater {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Bhupendra", 103, 2000));
		employees.add(new Employee("Anshul", 101, 5000));
		employees.add(new Employee("Joggi", 102, 3000));
		employees.add(new Employee("Ramdulera", 100, 1000));

		EmployeeShortByName byName = new EmployeeShortByName();

		Collections.sort(employees, byName);

		System.out.println("ShortByName>>>");
		employees.forEach(System.out::println);
		// System.out.println(employees);

		System.out.println("________________________");

		EmployeeShortBySalary bySalary = new EmployeeShortBySalary();

		Collections.sort(employees, bySalary);

		System.out.println("ShortBySalary>>>");
		employees.forEach(System.out::println);
		// System.out.println(employees);

		System.out.println("________________________");

		EmployeeShortById byId = new EmployeeShortById();

		Collections.sort(employees, byId);

		System.out.println("ShortById>>>");
		employees.forEach(System.out::println);
		// System.out.println(employees);

		System.out.println("________________________");

		EmployeeShortByIdAndName byIdOrName = new EmployeeShortByIdAndName();

		Collections.sort(employees, byIdOrName);

		System.out.println("ShortByIdOrName>>>");
		employees.forEach(System.out::println);
		// System.out.println(employees);

		System.out.println("________________________");

	}

}
