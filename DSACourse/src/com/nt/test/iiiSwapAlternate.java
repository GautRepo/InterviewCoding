package com.nt.test;

public class iiiSwapAlternate {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		
		int k=0, p=1;
		while(p<=ar.length-1) {
			
			int a =ar[k];
			ar[k]=ar[p];
			ar[p]=a;
			k=k+2;
			p=p+2;
		}
		
		for(int x : ar) {
			System.out.print(x +" ") ;
		}

	}

}
