package com.rays.stringProgram;

public class EctractIntFromString {

	public static void main(String[] args) {
		String str = "k5454hghj545";

		int[] s = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				s[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

			}

		}
		System.out.println(s[1]);

	}

}
