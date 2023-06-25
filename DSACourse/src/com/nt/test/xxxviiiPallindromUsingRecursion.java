package com.nt.test;

public class xxxviiiPallindromUsingRecursion {

	public static void main(String[] args) {
		
		String str="abcba";
		char[] ch  = str.toCharArray();
		boolean flag= recursivePallindrom(ch,0,ch.length-1);
		System.out.println(flag);
		

	}

	private static boolean recursivePallindrom(char[] ch, int i, int j) {
		if(i>j) {
			return true;
		}
		
		if(ch[i] != ch[j])
			return false;
		else {
			return recursivePallindrom(ch,i+1,j-1);
			
		}
		
		
	}

}
