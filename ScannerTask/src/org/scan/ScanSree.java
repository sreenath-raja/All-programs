package org.scan;

import java.util.Scanner;

public class ScanSree {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("enter your empID");
		int Sree = SC.nextInt();
		System.out.println("your empId is "+Sree);
		
		System.out.println("enter your studname");
		String R = SC.next();
		System.out.println("your name is " + R);
		
		System.out.println("enter the value for M1");
		int M1 = SC.nextInt();
		System.out.println("the value of M1 is" + M1);
		
		System.out.println("enter the value for M2");
		int M2 = SC.nextInt();
		System.out.println("the value of M2 is " + M2);
		
		System.out.println("enter the value for M3");
		int M3 = SC.nextInt();
		System.out.println("the value of M3" + M3);
		
		System.out.println("enter the value for M4");
		int M4 = SC.nextInt();
		System.out.println("the value of M4 is" + M4);
		
		System.out.println("enter the value for M5");
		int M5 = SC.nextInt();
		System.out.println("the value of M5 is" + M5);
		int M = M1+M2+M3+M4+M5;
		System.out.println("the value of sum is " + M);
		int G = M1+M2+M3+M4+M5/5;
		System.out.println("the average is" + G);
		/*
		 * System.out.println("enter your email ID"); String S = SC.next();
		 * System.out.println("your emai ID is" + S);
		 * 
		 * System.out.println("enter your phno"); int A = SC.nextInt();
		 * System.out.println("your phno is " + A);
		 * 
		 * System.out.println("enter your salary"); int D = SC.nextInt();
		 * System.out.println("your salary is " + D);
		 * 
		 * System.out.println("enter your gender"); String W = SC.next();
		 * System.out.println("your gender is" + W);
		 * 
		 * System.out.println(" enter your city "); String B = SC.next();
		 * System.out.println("your city is" + B);
		 */

	}
}
