package org.demo;

import org.test.Company1;

public class Company2 implements Employee1,Company1 {

	@Override
	public void comName() {
		System.out.println("tcS"); 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comId() {
		System.out.println("Skr145");
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public void empId() {
		System.out.println("1236468");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void school() {
		System.out.println("villupuram");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		Company2 com1 = new Company2();
		com1.comId();
		com1.school();
		com1.empId();
		com1.comName();
		com1.m1();
		com1.m2();
	}

	@Override
	public void m1() {
		System.out.println("******");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
