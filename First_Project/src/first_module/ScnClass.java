package first_module;

import java.util.Scanner;

public class ScnClass {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Student Id :");
		int StudentId = s.nextInt();
		System.out.println("The Student Id is " +StudentId);
		
		s.nextLine();
		System.out.println("Enter your full name :");
		String fullName = s.nextLine();
		System.out.println("This is the full name" +fullName);
		
	}

}
