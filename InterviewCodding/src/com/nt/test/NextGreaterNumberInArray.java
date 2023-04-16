package com.nt.test;

public class NextGreaterNumberInArray {

	public static void main(String[] args) {
		int[] ar = {10,11,5,7};
		
		for(int i=0;i<ar.length;i++) {
			int next =-1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					next=ar[j];
					break;
				}
			}
			System.out.println(next);
		}

	}

}
