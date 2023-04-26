package com.nt.test;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] ar = {10,20,30,60,90};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
			if(ar[i]-min>max) {
				max=ar[i]-min;
			}
		}
		System.out.println(max);

	}

}
