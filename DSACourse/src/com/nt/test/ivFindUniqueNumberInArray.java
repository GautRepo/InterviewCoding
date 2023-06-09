package com.nt.test;

public class ivFindUniqueNumberInArray {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,2,1};
		
		int ans=0;
		
		for(int a : ar) {
			ans = ans^a;
		}

		System.out.println(ans);
	}

}
