package org.prgms;

public class ButterFlyShuffle {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int S = a.length;
		for (int i = S-1; i > 0; i--) {
			System.out.println(a[i]);
		}
		for (int i = a.length ; i >= S; i--) {
			System.out.println(a[i]);
			
		}
	}

}
