package com.rays.IOProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileExample {

	public static void main(String[] args) throws IOException {

		// 1. To count no of line of file
		String s = "E://A1A2.txt";
		int count = 0;
		int nol = 2;
		File file = new File(s);

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			sc.next();
			count++;

		}

		System.out.println("No of line  " + count);

		// 2. To create no of file
		int temp = count / nol;
		int rem = count % nol;
		int nof = 0;

		if (temp != 0) {

			nof = temp;

			if (rem != 0) {

				nof++;

			} else {

				nof = temp;

			}

		}
		System.out.println("No of files... " + nof);

		// 3. here we read file data
		BufferedReader br = new BufferedReader(new FileReader(s));

		String str;

		// 4. here we create files nof
		for (int i = 1; i <= nof; i++) {

			BufferedWriter bw = new BufferedWriter(new FileWriter("E://AfterSplit" + i + ".txt"));

			str = br.readLine();

			// 5. here we write nol in files
			for (int j = 1; j <= nol; j++) {

				if (str != null) {

					bw.write(str);

					str = br.readLine();

					// 6. here we check if j not = nol then we write data to new line
					if (j != nol) {

						bw.newLine();

					}

				}

			}
			bw.close();

		}
		br.close();
	}

}
