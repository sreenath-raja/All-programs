package org.prgms;

public class AscendingNumbersPrograms {
	public static void AscendingOrder() {
		int temp;
		int a[]= { 10, 100, 200, 40, 20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}
			
		}
		System.out.println("ascending order");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		int MaximumNumber = a[a.length -1];
		System.out.println("Maximum Number is " + MaximumNumber);
		
		int minimumnumber = a[0];
		System.out.println("Minimum number is " + minimumnumber);
		
		int ThirdMaximumNumber = a[a.length -3];
		System.out.println("Maximum Number is " + ThirdMaximumNumber);
		
		int Thirdminimumnumber = a[2];
		System.out.println("Minimum number is " + Thirdminimumnumber);
		
	}
	public static void DescendingOrder() {
		int temp;
		int a []= { 10, 100, 200, 40, 20};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println("descending order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}
	public static void main(String[] args) {
		
		AscendingOrder();
		DescendingOrder();
	}
	
}
