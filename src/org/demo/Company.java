package org.demo;

public class Company extends Employee  {//parent class
	
protected void comName() {
	// TODO Auto-generated method stub
System.out.println("Tcs");
}
protected void comAdress() {
	System.out.println("Thoraipakkam");
	// TODO Auto-generated method stub



}


public static void main(String [] args) {
	
	Company c= new Company();
 c.comAdress(); c.comName1();c.empId();c.empName();
	
	comName1();
}

