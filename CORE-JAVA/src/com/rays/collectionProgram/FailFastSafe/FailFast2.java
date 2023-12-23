package com.rays.collectionProgram.FailFastSafe;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast2 {

	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");

		Integer i1 = new Integer(8);

		c.add(i1);

		System.out.println(c.get(3) + " Idhrar");

		String s = (String) c.get(3);
		System.out.println(s);

		Iterator i = c.iterator();

		// c.add("six");

		while (i.hasNext()) {
			System.out.println(i.next());
			c.add("six");
		}

	}

}
