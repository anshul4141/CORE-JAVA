package com.rays.collectionProgram.List;

import java.util.Stack;

// stack is last in first out first in last out
public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("Anshul");
		s.push("Prajapati");
		s.push(100);

		System.out.println(s.search("Anshul"));

		System.out.println(s);

		System.out.println(s.peek());

		System.out.println(s);

		System.out.println(s.pop());

		System.out.println(s);

	}

}
