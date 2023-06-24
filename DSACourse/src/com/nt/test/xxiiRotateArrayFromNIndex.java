package com.nt.test;

public class xxiiRotateArrayFromNIndex {

	public static void main(String[] args) {
		int[] ar = {11,12,13,14,15};
		int k=2;
		int[] temp = new int[ar.length];
		int i=0;
		while(i<ar.length) {
			
			temp[(i+k)%ar.length] =ar[i];
			i++;
		}
		
		for(int a : temp) {
			System.out.print(a+" ");
		}
		

	}

}
