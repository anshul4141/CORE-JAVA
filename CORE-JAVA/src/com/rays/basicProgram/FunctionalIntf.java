package com.rays.basicProgram;

@FunctionalInterface
public interface FunctionalIntf {

	public int sum(int a, int b);

	// static Method
	public static void multi(int a, int b) {

		System.out.println("Multi : " + (a * b));

	}

	// default Method
	public default void sub(int a, int b) {

		System.out.println("Sub : " + (a - b));

	}

}
