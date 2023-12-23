package com.rays.collectionProgram.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Nitesh");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println(list.indexOf("Ravi"));
		System.out.println(list.get(1));
		list.set(1, "Ram");
		System.out.println(list);

	}

}
