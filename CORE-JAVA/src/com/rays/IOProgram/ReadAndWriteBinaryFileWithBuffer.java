package com.rays.IOProgram;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFileWithBuffer {

	public static void main(String[] args) throws IOException {

		String source = "E://sinchan.jpg";

		String target = "E://anshul.jpg";

		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(source));

		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));

		int count = bi.read();

		System.out.println(count);

		while (count != -1) {

			bo.write(count);

			count = bi.read();

		}
		System.out.println("sucessfully");
		bo.close();

	}

}
