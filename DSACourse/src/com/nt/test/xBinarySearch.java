package com.nt.test;

import java.util.Arrays;

public class xBinarySearch {

	public static void main(String[] args) {
		
		int[] a= {11,2,7,8,12};
		int r=12;
		Arrays.sort(a);//2,7,8,11,12
		
		int s=0, e=a.length-1;
		int mid =(s+e)/2;
		
		while(s<=e) {
			if(a[mid]==r) {
				System.out.println(mid);
				break;
			}else if(a[mid]<r) {
				s=mid+1;
			}else
				e=mid-1;
			mid = (s+e)/2;
			
		}
		
		
		
		

	}

}
