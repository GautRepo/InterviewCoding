package com.nt.test;

public class xivFindPivotalInAnArray {

	public static void main(String[] args) {
		int[] ar = {3,8,10,17,1};
		int s=0,e =ar.length-1;
		int m = (s+e)/2;

		while(s<e) {
			if(ar[0]<=ar[m]) {
				s=m+1;
			}else {
				e=m;
			}
			
			m=(s+e)/2;
		}
		
		System.out.println(s);
	}

}
