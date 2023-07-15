package com.nt.test;

public class XLQuickSort {

	public static void main(String[] args) {
		
		int[] ar = {6, 6 ,-6, -2, -4, -6, 2, -6 };
		
		quickSort(ar,0,ar.length-1);
		

	}

	private static void quickSort(int[] ar, int s, int e) {
		
		if(s>=e)
			return;
		
		int p= partition(ar,s,e);
		
	}

	private static int partition(int[] ar, int s, int e) {
		
		int pivot = ar[s];
		int count =0;
		
		for(int i=0;i<ar.length;i++) {
			if(pivot<ar[i]) {
				count++;
			}
		}
		
		int pivotIndex=s+count;
		int temp=ar[pivot];
		ar[pivot]=ar[s];
		ar[s]=temp;
		
		
		return 0;
	}

}
