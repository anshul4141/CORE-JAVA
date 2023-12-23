package com.rays.collectionProgram.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add(1);
		list.add("shyam");
		list.add("raju");
		list.add("shyam");
		list.add(1);
		list.add("ram");

		System.out.println(list);
		Set s = new HashSet(list);
		System.out.println(s);
		
	}

}
