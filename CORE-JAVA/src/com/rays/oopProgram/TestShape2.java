package com.rays.oopProgram;

public class TestShape2 {

	// Test getShape Method By Settar method

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

		Circle c = (Circle) s[0];
		c.setR(1);

		Rectangle r = (Rectangle) s[1];
		r.setL(5);
		r.setW(5);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}

	}

}
