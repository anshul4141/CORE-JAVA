package com.rays.stringProgram;

public class Test {

	public static void main(String[] args) {

//		String[] name = { "ansh5454dgrf", "4g5" };
//
//		int[] arr = new int[10];
//
//		for (int i = 0; i < name.length; i++) {
//			for (int j = 0; j < name[i].length(); j++) {
//				if (Character.isDigit(name[i].charAt(j))) {
//					arr[j] = Integer.parseInt(String.valueOf(name[i].charAt(j)));
//
//				}
//			}
//
//		}
//		System.out.println(arr[4]);
		
		StringBuffer sb = new StringBuffer("Anshul");
		
		String s = String.valueOf(sb);
		
		System.out.println(s.toLowerCase());
		
		String name = "Vijay" ; 
		name.toUpperCase(); 
		System.out.println(name); 

	}

}
