package com.nt.test;

public class Panagram {

	
	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		String st = str.toLowerCase();
		boolean flag=true;
		if(str.length()<26)
			flag=false;
		else {
			for(char ch= 'a';ch<='z';ch++) {
				if(st.indexOf(ch) <0)
					flag=false;
			}
		}
		
		System.out.println(flag);
			
		
	}

}
