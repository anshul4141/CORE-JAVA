package com.rays.stringProgram;

public class CountNoOfIntFromString {

	public static void main(String[] args) {

		String name = "kfgir5454dg";
		int count = 0;
	
		for (int i = 0; i < name.length(); i++) {
		
			if (Character.isDigit(name.charAt(i))) {

				count++;

			}

		}
		System.out.println("No. Of int : " + count);

	}
}