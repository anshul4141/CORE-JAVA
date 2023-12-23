package com.rays.basicProgram;

public class FunctionalIntfTest {

	public static void main(String[] args) {

		FunctionalIntf f = new FunctionalIntf() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return (a + b);
			}
		};

		int a = 20;
		int b = 15;
		System.out.println(f.sum(a, b));

		// static method call by class name
		FunctionalIntf.multi(a, b);

		// default method call by object
		f.sub(a, b);

	}

}
