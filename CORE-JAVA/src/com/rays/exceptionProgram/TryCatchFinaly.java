package com.rays.exceptionProgram;

public class TryCatchFinaly {

	public static void main(String[] args) {

		try {

			String name = null;

			System.out.println(name.length());

		} catch (NullPointerException e) {

			System.out.println("NullPointerException");

			// System.exit(0);

		} finally {

			System.out.println("This is Finally Block");

		}

	}

}
