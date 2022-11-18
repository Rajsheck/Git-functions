package org.demo;

import java.util.Set;
import java.util.TreeSet;

public class ArList {
	 
	public static void main(String[] args) {
		
		Set<Integer> li= new TreeSet<Integer>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(205);
		li.add(305);
		
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.remove(3);
		
		li.add(805);
		System.out.println(li);
				System.out.println(li.size());
		
		//for (int i = 0; i < li.size(); i++) {
				
			
		//	System.out.println(li.get(i));
				
				
		
		 for (Integer a : li) {
			  System.out.println(a);
			//
		}
		}
		
	}
	
	


