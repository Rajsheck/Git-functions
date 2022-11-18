package org.demo;

public class Student {
	public void studentDetails(String name) {
		
		System.out.println(name);
		
		// TODO Auto-generated method stub

	}
	private void studentDetails(int a) {
		System.out.println(a);
		// TODO Auto-generated method stub

	}
	private void studentDetails(int id,String Course, float salary) {
		System.out.println(id);
		System.out.println(Course);
		System.out.println(salary);
		// TODO Auto-generated method stub

	}
	private void studentDetails(String degree, float expenses,int phone) {
		System.out.println(degree +"\t"+expenses +"\t"+ phone);
		
	}

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.studentDetails(12545);
		stu.studentDetails("rajsekar");
		stu.studentDetails(12545, "BE", 5550.0f);
		stu.studentDetails("degress", 200000f, 253469775);
		stu.studentDetails("gjjmffj");
		
}
	



}

	
