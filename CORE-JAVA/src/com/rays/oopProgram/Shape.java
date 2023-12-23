package com.rays.oopProgram;

public class Shape {

	public static final double PI = 3.14;

	public double area() {
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {

			return new Circle();

		}
		if (i == 2) {

			return new Rectangle();

		}
		return new Shape();

	}

}
