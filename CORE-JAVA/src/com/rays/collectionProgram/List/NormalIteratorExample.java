package com.rays.collectionProgram.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NormalIteratorExample {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(12);
		list.add("anshul");
		list.add(12);
		list.add('B');

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
