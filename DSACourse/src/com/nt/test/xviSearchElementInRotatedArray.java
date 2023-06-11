package com.nt.test;

public class xviSearchElementInRotatedArray {
	
	public static int findPivoteElement(int[] ar) {
		
		int s=0,e=ar.length-1;
		int m=(s+e)/2;
		while(s<e) {
			
			if(ar[0]<=ar[m]) {
				s=m+1;
			}else {
				e=m;
			}
			m=(s+e)/2;
		}
		return s;
		
	}
	
	public static int searchNumberIndex(Integer[] a , int num) {
		
		int s=0,e=a.length-1, m=s+e/2;
		
		while(s<e) {
			if(a[m]==num) {
				break;
			}else if(a[m]<num) {
				s=m+1;
			}else {
				e=m-1;
			}
			m=s+e/2;
		}
		
		return m;
	}

	public static void main(String[] args) {
		
		int[] ar = {7,9,1,2,3};
		int num= 9;
		int pivote =findPivoteElement(ar);
		System.out.println(pivote);
		Integer[] a = null;
		int k=0;
		if(ar[pivote]< num && num <  ar[ar.length-1]) {
			int len=-pivote+(ar.length);
			a= new Integer[len];
			for(int i=pivote ; i< ar.length ;i++,pivote++) {
				
				a[k]=ar[pivote];
				k++;
			}
		}else {
			a= new Integer[pivote];
			for(int i=0; i<pivote; i++) {
				
				a[i]=ar[i];
			}
		}
		
		for(int z : a) {
			System.out.print(z +" ");
		}
		
		System.out.println();
		int res= searchNumberIndex(a,num);
		System.out.println(res);
		
		

	}

}
