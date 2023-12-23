package com.rays.oopProgram;

public class StaticDefaultMethod {

	public static void staticMethod() {

		System.out.println("this is static method");

	}

	public void instanceMethod() {

		System.out.println("this is instance method");

	}

	public static void main(String[] args) {

		StaticDefaultMethod s = new StaticDefaultMethod();

		StaticDefaultMethod.staticMethod();
		s.instanceMethod();

	}

}
