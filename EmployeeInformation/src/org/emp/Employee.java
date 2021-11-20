package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("3764");
	}
	public static void main(String[] args) {
		Employee E = new Employee();
		Company V = new Company();
		Client C = new Client();
		Project P = new Project();
		E.empName();
		V.companyName();
		C.clientName();
		P.projectName();
	}

}
