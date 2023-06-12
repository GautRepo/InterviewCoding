package com.nt.test;

public class xviiSquerrootUseingBinarySearch {

	public static void main(String[] args) {
		
		int num=36;
		
		int s=0,e=num,m=(s+e)/2;
		
		while(s<e) {
			if(m*m==num) {
				System.out.println(m);
				break;
			}else if(m*m<num) {
				s=m+1;
			}else {
				e=m-1;
			}
			
			m=(s+e)/2;
		}

	}

}
