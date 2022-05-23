package com.masai;

public class stringImmutability {

	public static void main(String[] args) {
		String str1 = "Harsh ";
		String str2 = str1.concat("Vyas");
		System.out.println(str1);
		System.out.println(str2);
		
		StringBuilder s1 = new StringBuilder("Welcome");
		
		// 1) find length
		int stringLength = str1.length();
		System.out.println(stringLength);
		
		// 2) concate
		String c1 = "Harsh ";
		String c2 = c1.concat("Vyas");
		System.out.println(c2);
		
		// 3) find index of
		String i1 = "Hello, zuko here";
		int indOf = i1.indexOf("z");
		System.out.println(indOf);
		
		// 4) char At
		String a1 = "Masai";
		char a2 = a1.charAt(2);
		System.out.println(a2);
		
		// 5) last index of
		String l1 = "Hello";
		int l2 = l1.lastIndexOf("l");
		System.out.println(l2);
		
	}
	
	/* 1) String in java in immutable if we want to concate anyhing to string
	   we have catch it in another variable otherwise it'll not reflect .
	   2) String will occupie a space in heap area as a string pool space.  
	 */
	
	/* StringBuilder -> it will allow to change in immutable string
	 	String is immutable and to change in that we use StringBuilder
	 */
}
