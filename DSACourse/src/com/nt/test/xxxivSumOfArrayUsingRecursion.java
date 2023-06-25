package com.nt.test;

public class xxxivSumOfArrayUsingRecursion {

	public static void main(String[] args) {
		
		int[] ar = {2,3,45,6,7};
		
		int sum= recursionSum(ar,ar.length);
		System.out.println(sum);

	}

	private static int recursionSum(int[] ar, int s) {
		
		if(s==0) {
			return 0;
		}
		if(s==1)
			return ar[0];
		else {
			return ar[s-1]+ recursionSum(ar, s-2);
		}
		
		
	}

}
