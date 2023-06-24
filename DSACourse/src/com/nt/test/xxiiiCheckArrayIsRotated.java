package com.nt.test;

public class xxiiiCheckArrayIsRotated {

	public static void main(String[] args) {
		
		int[] ar = {2,1,3,4};//{1,2,3,4,5};//{3,4,5,1,2};
		
		int count=0;
		
		for(int i=1; i<ar.length ;i++) {
			if(ar[i-1]>ar[i]) {
				count++;
			}
		}
		
		if(ar[ar.length-1]>ar[0]) {
			count++;
		}
		
		System.out.println(count<=1);

	}

}
