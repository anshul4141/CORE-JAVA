package com.rays.collectionProgram.FailFastSafe;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {

	public static void main(String[] args) {

		Vector l = new Vector();

		l.addElement(5);
		l.addElement(4);
		l.addElement("Anshul");
		l.addElement("Prajapati");

		Enumeration e = l.elements();

		l.add(5);
		l.remove(0);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}

}
