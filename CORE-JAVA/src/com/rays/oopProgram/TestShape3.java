package com.rays.oopProgram;

public class TestShape3 {

	// Test Shape by return type
	static double calcArea(Shape[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea = totalArea + s[i].area();

		}
		return totalArea;

	}

	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		s[0] = new Circle(1);
		s[1] = new Rectangle(5, 5);

		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

}
