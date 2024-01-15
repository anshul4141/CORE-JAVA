package com.rays.IOProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCurrectEmail {

	public static void main(String[] args) throws IOException {

		FileWriter pw = new FileWriter("E://newEmail.txt");

		BufferedReader br = new BufferedReader(new FileReader("E://email.txt"));

		String s1 = br.readLine();

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		while (s1.matches(emailreg)) {

			pw.write(s1);

			System.out.println(s1);

			s1 = br.readLine();

		}

		pw.close();
		br.close();

	}

}
