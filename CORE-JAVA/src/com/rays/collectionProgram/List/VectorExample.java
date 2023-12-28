package com.rays.collectionProgram.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// by default capacity of Vector is 10
		Vector v = new Vector();

		v.addElement("Anshul");
		v.addElement("Prajapati");
		v.addElement(100);

		System.out.println(v);

		System.out.println("----------------------");

		Iterator it = v.iterator();

		// v.addElement(25);

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("----------------------");

		Enumeration en = v.elements();

		v.addElement(25);

		while (en.hasMoreElements()) {

			System.out.println(en.nextElement());

		}

		System.out.println("----------------------");

		v.setElementAt("Anjali", 0);
		//v.add(0, "dfgdf");

		System.out.println(v);

	}

}
