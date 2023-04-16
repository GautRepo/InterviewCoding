package com.nt.test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String str = "abcdab";
		
		String lstn="";
		String lsoa="";
		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				lstn = lstn+str.charAt(i);
				if(lstn.length()>lsoa.length())
					lsoa=lstn;
			}else {
				set.clear();
				lsoa=lstn;
				lstn="";
			}
				
		}
		
		System.out.println(lsoa);

	}

}
