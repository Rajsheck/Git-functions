package org.demo;

public class StringMethods {

	public static void main(String[] args) {
		
		String s= " Welcom to java";
		String s1= "java";
		String s2 = "Java";
		
		System.out.println(s);
		
		int indexOf = s.indexOf("e");
		
		System.out.println(indexOf);
		
		boolean endsWith = s1.endsWith(s2);
		System.out.println(endsWith);
		
		int length = s.length();
		System.out.println(length);
		
		
	
		
		String upperCase = s2.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		boolean equals = s1.equals(s);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		int lastIndexOf = s.lastIndexOf("a");
		
		System.out.println(lastIndexOf);
		
		boolean contains = s.contains(lowerCase);
		System.out.println(contains);
		
		boolean contains2 = s.contains("Wel");
		System.out.println(contains2);
		
		
		String replace = s1.replace("java", "Python");
		System.out.println(replace);
		
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		
		
		
		
	}
}
