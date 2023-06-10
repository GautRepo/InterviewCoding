package com.nt.test;

public class xiiPeakElementInMountanArray {

	public static void main(String[] args) {
		
		int[] ar = {0,1,2,3,2,1,0};
		
		int s=0,e=ar.length-1;
		int mid = (s+e)/2;
		
		while(e>=s) {
			if(ar[s] < ar[s+1]) {
				s=mid+1;
			}else {
				e=mid;
			}
		}
		
		System.out.println(mid);

	}

}
