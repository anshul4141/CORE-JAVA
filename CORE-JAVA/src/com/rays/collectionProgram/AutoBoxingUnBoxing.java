package com.rays.collectionProgram;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {

		// ab

		String str = "Anshul";

		String s = new String(str);

		System.out.println(s);

		int a = 5;

		Integer i = new Integer(a);

		System.out.println(i);

		// ub

		String s1 = new String("Prajapati");

		String str1 = s1;

		System.out.println(str1);

		Integer i1 = new Integer(50);

		int a1 = i1;

		System.out.println(a1);

	}

}
