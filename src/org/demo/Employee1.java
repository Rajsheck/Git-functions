package org.demo;

public interface  Employee1 {
	abstract void comName();
	abstract void comId();
	void m1();
	void m2();
	
	public static void main(String[] args) {
		
		Employee1 ep = new Employee1() {
			
			@Override
			public void m2() {
				System.out.println("12265");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void comName() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void comId() {
				// TODO Auto-generated method stub
				
				ep.m1();
				ep.m2();
				
			}
		};
	}

	
	
}
