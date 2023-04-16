package com.nt.test;

public class AllSubString {

	public static void main(String[] args) {
		
		String s = "abcd";
		
		for(int i =0;i<s.length();i++) {
			String sn=s.charAt(i)+"";
			System.out.println(sn);
			for(int j=i+1;j<s.length();j++) {
				
				sn= sn+ s.charAt(j);
				System.out.println(sn);
			}
		}

	}

}
