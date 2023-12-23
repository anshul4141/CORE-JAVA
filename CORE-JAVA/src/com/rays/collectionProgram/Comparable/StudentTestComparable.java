package com.rays.collectionProgram.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTestComparable {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		student.add(new Student("Anshul", 10));
		student.add(new Student("Joggi", 100));
		student.add(new Student("Bhupendra", 10));
		student.add(new Student("Ramdulera", 10));

		Collections.sort(student);

		student.forEach(System.out::println);

	}

}
