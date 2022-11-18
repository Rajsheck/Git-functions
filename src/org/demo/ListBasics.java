package org.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListBasics {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		
		
	li.add(10);
	li.add(20);
	li.add(30);
	System.out.println(li);
	Integer integer = li.get(2);
	System.out.println(integer);
	boolean contains = li.contains(10);
	System.out.println(contains);
	boolean add = li.add(20);
	System.out.println(add);
	
	boolean containsAll = li.containsAll(li);
	System.out.println(containsAll);
	
	
	System.out.println("*******");
	
	
	String string = li.toString();
	System.out.println(string);
	
	int lastIndexOf = li.lastIndexOf(integer);
	System.out.println(lastIndexOf);
	
	
	boolean empty = li.isEmpty();
	System.out.println(empty);
	
	
	int size = li.size();
	
	System.out.println(size);
	
	li.getClass();
	
	System.out.println();
	
	System.out.println(2222);
	
	
	System.out.println(124.12533574f
		);
	
	System.out.println("12355.jbszgnbsgdrgrr.nseegbsge");
	
	LinkedList<Integer> li1 = new LinkedList<Integer>();
	
	boolean add2 = li1.add(200);
	
	 boolean add3 = li1.add(300);
	 li1.add(420);
	 li1.add(500);
	
	 
	 Integer set = li1.set(2, 600);
	// Integer remove = li1.remove(1);
	 
	 
	 System.out.println(li1);
	 System.out.println(set);
	 //System.out.println(remove);
	 System.out.println();
	 System.out.println();
	 System.out.println();
	 
	 for (int i = 0; i < li1.size(); i++) {
		 
		 System.out.println(li1.size());
		
	}
	for (Integer integer2 : li1) {

		System.out.println(integer2);
		
		
		
	}
	
	
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
