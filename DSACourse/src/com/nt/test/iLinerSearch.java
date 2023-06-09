package com.nt.test;

public class iLinerSearch {
	
	public static void main(String[] ar) {
		int a[] = {10,11,23,1,2,466,7};
		
		for(int i=0; i<a.length ;i++) {
			if(a[i]==1) {
				System.out.println(i);
				break;
			}
		}
	}

}
