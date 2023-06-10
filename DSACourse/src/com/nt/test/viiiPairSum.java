package com.nt.test;

import java.util.Arrays;

public class viiiPairSum {

	public static void main(String[] args) {
		
		int a[] = {2,3,1,4,10,8,15,0};// 0,1,2,3,4,8,10,15
		int sum =18;
		Arrays.sort(a);
		int i=0,j=a.length-1;
		while(i<j) {
			if(a[i]+a[j]==sum) {
				System.out.print(i +" "+j);
				System.out.println();
				i++;
				j--;
			}
			else if(a[i]+a[j]<sum) {
				i++;
			}else
				j--;
		}

	}

}
