package com.nt.test;

public class xixReverseArrayAfterNthIndex {

	public static void main(String[] args) {
		
		int[] ar = {10,11,2,3,1,3,4,5,10};
		int k =4;
		
		int s=k+1,e= ar.length-1;
		
		while(s<e) {
			int a =ar[e];
			ar[e]=ar[s];
			ar[s]=a;
			s++;
			e--;
		}

		for(int a : ar) {
			System.out.print(a +" ");
		}
	}

}
