package com.rays.stringProgram;

public class CountAccuraceOfaChar {

	public static void main(String[] args) {

		String name = "prajapati";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			String m = String.valueOf(ch);

			if (m.matches("p")) {
				count++;

			}

		}
		System.out.println("p : " + count);

	}

}
