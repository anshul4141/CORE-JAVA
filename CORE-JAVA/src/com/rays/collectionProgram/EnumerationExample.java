package com.rays.collectionProgram;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {

		Vector list = new Vector();

		list.addElement("Anshul");
		list.addElement("Shyam");
		list.addElement("Mayank");

		Enumeration e = list.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
