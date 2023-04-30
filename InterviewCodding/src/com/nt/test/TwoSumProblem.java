package com.nt.test;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50};
		int sum =50;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]== sum) {
					System.out.println(ar[i]);
					System.out.println(ar[j]);
				}
			}
		}
	}
	
	
}
