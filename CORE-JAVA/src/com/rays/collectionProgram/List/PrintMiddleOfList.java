package com.rays.collectionProgram.List;

import java.util.ArrayList;
import java.util.List;

public class PrintMiddleOfList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Anshul");
		list.add("Mayank");
		list.add(45);
		list.add(25);
		list.add('A');

		System.out.println(list.get((list.size() - 1) / 2));

	}

}
