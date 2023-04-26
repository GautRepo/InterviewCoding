package com.nt.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeCharInString {

	public static void main(String[] args) {
		String str ="aabbccdef";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else
				map.put(str.charAt(i), 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

}
