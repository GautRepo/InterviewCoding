package com.nt.test;

public class xxxiiiIsArraySortedWithRecurssion {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		
		boolean flag=isArraySorted(ar,6);
		System.out.println(flag);
		
	}

	private static boolean isArraySorted(int[] ar,int s) {
		if(s==0 || s==1) {
			return true;
		}
		if(ar[s-1]<ar[s-2]) {
			return false;
		}else {
			return isArraySorted(ar,s-1);
		}
		
		
	}

}
