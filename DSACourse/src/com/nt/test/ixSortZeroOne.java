package com.nt.test;

public class ixSortZeroOne {

	public static void main(String[] args) {
		
		int a[] = {0,1,1,0,0,1,0,1};
		
		int i =0, j=a.length-1;
		
		while(i<j) {
			if(a[i]==0) {
				i++;
			}else if(a[j] ==1){
				j--;
			}else {
				int k =a[i];
				a[i]=a[j];
				a[j]=k;
				i++;
				j--;
			}
			
		}
		for(int k : a) {
			System.out.print(k+ " ");
		}

	}

}
