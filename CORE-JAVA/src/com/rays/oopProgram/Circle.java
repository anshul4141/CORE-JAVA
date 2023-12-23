package com.rays.oopProgram;

public class Circle extends Shape {

	public int r;

	public Circle() {
	}

	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		double d = PI * r * r;
		return d;
	}

}
