package com.nt.test;

import java.util.HashMap;
import java.util.Map;

public class viFindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[] ar = {4,3,2,7,8,2,3,1};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a : ar) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry :map.entrySet()) {
			if(entry.getValue()==2) {
				System.out.println(entry.getKey());
			}
		}

	}
	


}
