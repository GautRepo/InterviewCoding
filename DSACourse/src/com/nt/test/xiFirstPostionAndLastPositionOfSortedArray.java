package com.nt.test;

public class xiFirstPostionAndLastPositionOfSortedArray {
	
	public static int firstPostion(int ar[],int key) {
		int first=0;
		int s=0,e=ar.length-1;
		int mid = (s+e)/2;
		
		while(s<e) {
			if(ar[mid] == key) {
				first=mid;
				e= mid-1;
			}else if(ar[mid] < key) {
				s=mid+1;
			}else {
				e= mid-1;
			}
			
			
			mid = (s+e)/2;
		}
		return first;
	}

	public static void main(String[] args) {
		int ar[] = {0,1,2,3,3,3,3,3,3,10,11};
		int first=0,last=0;
		int key =3;
		int s=0,e=ar.length-1;
		int mid = (s+e)/2;
		
		first = firstPostion(ar, key);
		
		//{0,1,2,3,3,3,3,3,3,10,11}
		
		while(s<e) {
			if(ar[mid]==key) {
				last=mid;
				s=mid+1;
			}else if(ar[mid]>key) {
				e = mid-1;
			}else {
				s=mid+1;
			}
			
			mid = (s+e)/2;
		}
		
		System.out.println(first + " "+ last);
		
		

	}

}
