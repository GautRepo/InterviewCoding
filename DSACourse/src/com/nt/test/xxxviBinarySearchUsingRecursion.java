package com.nt.test;

public class xxxviBinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] ar= {10,15,20,25,30};
		int k=25;
		int s=0,e=ar.length-1;
		int index = recursiveSearch(ar,s,e,k);
		System.out.println(index);

	}

	private static int recursiveSearch(int[] ar, int s,int e, int k) {
		
		if(s>e) {
			return -1;
		}
		int m=(e+s)/2;
		if(ar[m]==k) {
			return m;
		}else if(ar[m]<k) {
			return recursiveSearch(ar,m+1,e,k);
		}else
			return recursiveSearch(ar,s,m-1,k);
	}

}
