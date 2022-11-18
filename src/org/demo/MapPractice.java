package org.demo;

import java.util.HashMap;
import java.util.Map;

public class MapPractice{
	private static boolean empty;

	public static void main(String[] args) {
		
		Map<Integer,String> m	=new HashMap<>();
		m.put(10, "java");
		m.put(20, "python");
		empty = m.isEmpty();
		System.out.println(m);
		
	
	
	}

}
