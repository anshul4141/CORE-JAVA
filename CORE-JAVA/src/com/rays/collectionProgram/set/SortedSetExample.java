package com.rays.collectionProgram.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {

		// SortedSet output by default ASC order
		SortedSet s = new TreeSet();

		s.add("One");
		s.add("Two");
		s.add("Three");

		System.out.println(s.last());
		System.out.println(s.first());

		System.out.println(s);

		for (Object ele : s) {

			System.out.println(ele);

		}

	}

}
