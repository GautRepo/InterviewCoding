package com.nt.test;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int[] ar = {-6,-1,2,4,5};
		Integer[] arr = new Integer[ar.length];
		int start = 0;
		int end = ar.length-1;
		int index =0;
		while(start<=end) {
			if(ar[start]*ar[start]>ar[end]*ar[end]) {
				arr[index]=ar[start]*ar[start];
				start++;
			}else {
				arr[index]=ar[end]*ar[end];
				end--;
			}
				index++;
		}
		
		for(int a :arr) {
			System.out.println(a);
		}

	}

}
