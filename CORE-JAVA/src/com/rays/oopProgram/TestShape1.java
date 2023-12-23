package com.rays.oopProgram;

public class TestShape1 {

	// test typecasting by settar method
	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		/*
		 * s[0] = new Circle(1); s[1] = new Rectangle(2,5);
		 */

		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		Rectangle r = (Rectangle) s[1];

		c.setR(1);
		r.setL(5);
		r.setW(5);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());

		}
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());

		// Test gettar OR settar Method
//		Circle c1 = new Circle();
//
//		c1.setR(2);
//		System.out.println(c1.getR());
//		System.out.println(c1.area());
	}
}