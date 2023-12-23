package com.rays.stringProgram;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Student implements Externalizable{
	
	public String name;
	public int id;
	
	public Student() {
		
	}
	public Student(String n,int i) {
		name =n;
		id =i;
	}
	
	public String toString() {
		return "name = "+name+","+"id = "+id;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		id = in.readInt();
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("C:\\Users\\dell\\Desktop\\serial.txt"));
		Student s = new Student("Ram", 101);
		s.writeExternal(o);
		o.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\dell\\Desktop\\serial.txt"));
		Student s1 = new Student();
		s1.readExternal(in);
		System.out.println(s1);
		in.close();
	}

}
