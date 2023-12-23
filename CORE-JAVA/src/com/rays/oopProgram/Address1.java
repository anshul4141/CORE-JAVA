package com.rays.oopProgram;

public class Address1 implements Cloneable {

	public String city;

	public Address1(String city) {

		this.city = city;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
