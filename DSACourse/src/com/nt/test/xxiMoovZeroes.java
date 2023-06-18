package com.nt.test;

public class xxiMoovZeroes {

	public static void main(String[] args) {
		
		int[] ar = {0,1,0,3,12};
		
		int i=0,j=ar.length-1;
		
		while(i<j) {
			if(ar[i] ==0) {
				i++;
			}else if(ar[j] !=0) {
				j--;
			}else {
				int k =ar[i];
				ar[i]=ar[j];
				ar[j]=k;
				i++;
				j--;
			}
		}
		
		for(int a : ar) {
			System.out.print(a +" ");
		}
		

	}

}
