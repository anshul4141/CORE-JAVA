package com.rays.collectionProgram;

public class EqualAndHashCode {

	public String name;
	public Integer rollNo;
	public Integer marks;

	public EqualAndHashCode(String name, int rollNo, int marks) {

		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;

	}

	@Override
	public boolean equals(Object obj) {

		if (getClass() != obj.getClass()) {

			return false;

		}

//		if (!(obj instanceof EqualAndHashCode)) {
//
//			return false;
//
//		}
		EqualAndHashCode m = (EqualAndHashCode) obj;

		boolean b = name.equals(m.name) && rollNo.equals(m.rollNo) && marks.equals(m.marks);

		return b;

	}

	@Override
	public int hashCode() {
		String key = name + rollNo + marks;
		return key.hashCode();
	}

}
