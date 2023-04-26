package com.nt.test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

	public static void main(String[] args) {
		int[] ar = {10,11,10,12,10};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a :ar) {
			
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else
				map.put(a, 1);
			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>ar.length/2) {
				System.out.println(entry.getKey());
			}
		}

	}

}
