package com.nt.test;

public class xxxvLinearSearchUsingRecursion {

	public static void main(String[] args) {
		int[] ar= {1,23,32,14,15,6};
		int k=15;
		int index= recursiveLinearSearch(ar,ar.length,k);
		System.out.println(index);

	}

	private static int recursiveLinearSearch(int[] ar, int s, int k) {
		
		if(s==0)
			return -1;
		if(s==1 && ar[0]==k)
			return s;
		else if(s==1 && ar[0]!=k)
			return -1;
		
		if(ar[s-1]==k) {
			return s;
		}
			
		return recursiveLinearSearch(ar,s-1,k);
		
	}

}
