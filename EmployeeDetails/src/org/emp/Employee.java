package org.emp;

public class Employee {
	public void empId() {
		System.out.println("empid is 3764");
	}

	public void empName() {
		System.out.println("empName is Sreenath");
	}

	public void empPhone() {
	     System.out.println("empPhone is 123456789");
	}

	public void empEmail() {
		System.out.println("empEmail is sss123@gmail.com");
	}

	public void empAddress() {
	System.out.println("address is ambattur");
	}

	public static void main(String[] args) {
	//classname obj = new classname
		Employee S = new Employee();
		S.empId();
		S.empName();
		S.empPhone();
		S.empEmail();
		S.empAddress();
	
	}
}
