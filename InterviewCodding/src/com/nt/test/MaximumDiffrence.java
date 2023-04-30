package com.nt.test;

public class MaximumDiffrence {

	public static void main(String[] args) {
		
		int[] ar = {2,3,45,10,12};
		int min =Integer.MAX_VALUE;
		int max= Integer.MAX_VALUE;
		for(int a : ar) {
			if(a<min) {
				min=a;
			}
			if(a-min>max) {
				max=a;
			}
		}
		
		System.out.println(max-min);

	}

}
