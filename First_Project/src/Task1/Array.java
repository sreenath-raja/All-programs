package Task1;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("how many values");
	    a = sc.nextInt();
	    int arr[]= new int[a];
		  //String[] names = new String[length];
		  for (int i = 0; i <a; i++) {
			//sc.nextLine();
		  System.out.println("enter the name of your value" +(i));
		  arr[i]= sc.nextInt();
		  }
		  //sc.nextLine();
		  System.out.println("your values are");
		  for(int i = 0; i< a;i++) {
			  System.out.println(arr[i]);
		  }
		}
}
