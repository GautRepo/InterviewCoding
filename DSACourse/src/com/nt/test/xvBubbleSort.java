package com.nt.test;

public class xvBubbleSort {

	public static void main(String[] args) {
		
		int[] ar = {5,4,3,2,1};
		
		
		for(int i=0;i<ar.length-1;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j] ){
					int a =ar[i];
					ar[i]=ar[j];
					ar[j]=a;
				}
			}
		}

		for(int a : ar) {
			System.out.print(a +" ");
		}
	}

}
