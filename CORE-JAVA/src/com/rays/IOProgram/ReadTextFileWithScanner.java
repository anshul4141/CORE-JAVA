package com.rays.IOProgram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFileWithScanner {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("E://A1A2.txt");

		Scanner sc = new Scanner(fr);

		while (sc.hasNext()) {

			String str = sc.nextLine();

			System.out.println(str);

		}

		fr.close();

	}

}
