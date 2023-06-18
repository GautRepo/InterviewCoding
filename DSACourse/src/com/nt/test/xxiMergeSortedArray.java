package com.nt.test;

public class xxiMergeSortedArray {

	public static void main(String[] args) {
		
		int[] ar1 = {1,2,3,0,0,0};
		int m=3;
		int ar2[] ={2,5,6};
		int n =3;
		int ar3[] = new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(ar1[i]<ar2[j]) {
				ar3[k]=ar1[i];
				i++;
				k++;
			}else if(ar1[i]>ar2[j]) {
				ar3[k]=ar2[j];
				j++;
				k++;
			}else {
				ar3[k]=ar1[i];
				ar3[k+1]=ar1[i];
				i++;
				j++;
				k=k+2;
			}
		}
		
		for(int a :ar3) {
			System.out.println(a);
		}

	}

}
