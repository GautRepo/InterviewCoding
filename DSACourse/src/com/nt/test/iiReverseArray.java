package com.nt.test;

public class iiReverseArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int start = 0, end = a.length - 1;

		
			while (start < end) {
				int x =a[start];
				a[start] =a[end];
				a[end] =x;
				end--;
				start++;
			}
			
			for(int k : a) {
				System.out.print(k +" ");
			}
		

	}

}
