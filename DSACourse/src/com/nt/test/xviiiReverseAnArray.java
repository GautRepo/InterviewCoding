package com.nt.test;

public class xviiiReverseAnArray {

	public static void main(String[] args) {
		
		int[] ar = {2,3,1,34,5};
		
		int s=0, e = ar.length-1;
		
		while(s<e) {
			int a =ar[e];
			ar[e]=ar[s];
			ar[s]=a;
			s++;
			e--;
		}
		
		for(int a : ar) {
			System.out.println(a);
		}

	}

}
