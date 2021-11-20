package org.prgms;

import java.util.Scanner;

public class ArmstrongNumber {
	 
	public static void Armstrongnum() {
		int a, i = 0, j=0;
		@SuppressWarnings("resource")
		Scanner S = new Scanner(System.in);
	    System.out.println("enter a number");
		int n = S.nextInt();
		a = n;
		 while(a > 0) {
			i = a % 10;
			j = j+(i * i * i);
			a= a / 10;	
		}
		if (n == j) {
			System.out.println("Armstrong number");
			
		} else {
			System.out.println("Not an armstrong number");

		}
		
	}
	public static void armstrongcount() {
		int c = 0;
		for (int n = 1; n < 1000; n++) {
			int a, i , j =0;
			a = n;
			while ( a > 0) {
				i = a %10;
				j= j+(i * i * i);
				a = a / 10;	
			}
			
			if (j == n) {
				System.out.println("armstrong number is = " + j);
				c++;
				
			} 
			
		}
		System.out.println("the count of armstrong number is =" + c);
		
	}
	public static void main(String[] args) {
		Armstrongnum();
		armstrongcount();
	}

}
