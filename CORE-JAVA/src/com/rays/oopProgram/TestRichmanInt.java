package com.rays.oopProgram;

public class TestRichmanInt {

	public static void main(String[] args) {

		Richman[] r = new Richman[2];

		r[0] = new Businessman();
		r[1] = new Student();

		r[0].donationg(1000);
		r[1].donationg(500);

	}

}
