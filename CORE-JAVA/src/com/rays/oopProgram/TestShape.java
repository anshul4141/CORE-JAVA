package com.rays.oopProgram;

public class TestShape {

	// test by constructor
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = new Circle(1);
		s[1] = new Rectangle(3, 4);

		System.out.println(s[0].area());
		System.out.println(s[1].area());
	}
}
