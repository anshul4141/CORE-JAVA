package com.rays.IOProgram;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E://Sunilos.txt");

		char[] charArry = { 'h', 'i' };

		fw.write(charArry);
		fw.write(',');
		fw.write("SunilOs");

		System.out.println("Sucessfully........");

		fw.close();

	}

}
