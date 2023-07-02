package com.nt.test;

public class xxxixMergeSortUsingRecursion {

	public static void main(String[] args) {
		int[] ar = { 12, 11, 10, 9, 8 };

		mergeSort(ar, 0, ar.length - 1);
		
		for(int a : ar) {
			System.out.print(a+" ");
		}

	}

	private static void mergeSort(int[] ar, int s, int e) {

		if (s >= e) {
			return;
		}
		int mid = (s + e) / 2;

		mergeSort(ar, s, mid);

		
		mergeSort(ar,mid+1,e);

		mergeSortedArray(ar, s, e);
	}

	private static void mergeSortedArray(int[] ar, int s, int e) {
		
		int mid= (s+e)/2;
		int len1=mid-s+1;
		int len2= e-mid;
		int[] ar1 = new int[len1];
		int[] ar2= new int[len2];
		
		int index=s;
		for(int i=0;i<len1;i++) {
			ar1[i]=ar[index];
			index++;
		}
		
		for(int i=0;i<len2;i++) {
			ar2[i]=ar[index];
			index++;
		}
		
		int originalIndex=s;
		
		int ar1s=0,ar2s=0;
		
		while(ar1s<len1 && ar2s<len2) {
			
			if(ar1[ar1s]<ar2[ar2s]) {
				ar[originalIndex]= ar1[ar1s];
				originalIndex++;
				ar1s++;
			}
			
			else if(ar1[ar1s] > ar2[ar2s]) {
				ar[originalIndex]= ar2[ar2s];
				originalIndex++;
				ar2s++;
			}else {
				ar[originalIndex]= ar2[ar2s];
				originalIndex++;
				ar2s++;
				ar1s++;
			}
			
		}
		
		while(ar1s<len1) {
			ar[originalIndex]= ar1[ar1s];
			originalIndex++;
			ar1s++;
		}
		
		while(ar2s<len2) {
			ar[originalIndex]= ar2[ar2s];
			originalIndex++;
			ar2s++;
		}
	}

		
}
