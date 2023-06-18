package com.nt.test;

public class xxMergeSortedArray {

	public static void main(String[] args) {
		
		int[] ar1 = {1,3,5,7,9};
		int[] ar2 = {2,4,6};

		int[] ar3 = new int[ar1.length+ar2.length];
		
		int i=0,j=0,m=0;
		
		while(i<ar1.length && j<ar2.length) {
			
			if(ar1[i]<ar2[j]){
				ar3[m]=ar1[i];
				m++;
				i++;
			}else if(ar1[i]>ar2[j]) {
				ar3[m]=ar2[j];
				m++;
				j++;
			}else {
				ar3[m]=ar2[j];
				m++;
				j++;
				i++;
			}
			
		}
		
		while(i<ar1.length) {
			ar3[m]=ar1[i];
			m++;
			i++;
		}
		
		for(int a : ar3) {
			System.out.print(a +" ");
		}
		
		
	}

}
