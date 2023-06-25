package com.nt.test;

public class xxxviiReverseStringUsingRecursion {

	public static void main(String[] args) {
		String str= "abcde";
		char[] ch = str.toCharArray();
		
		String res= new String (reverseStringUsingRecursion(ch,0,ch.length-1));
		System.out.println(res);

	}

	private static char[] reverseStringUsingRecursion(char[] ch, int i, int j) {
		if(i>j) {
			return ch;
		}else {
			char temp= ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;j--;
			return reverseStringUsingRecursion(ch,i,j);
		}
		
		
	}

}
