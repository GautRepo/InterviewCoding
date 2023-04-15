package com.nt.test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,3,3,3,3,3,4,2,1,2,4,3,3,3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int a : ar) {
			Integer val= map.get(a);
			if(val==null) {
				map.put(a, 1);
			}else
				map.put(a, val+1);
		}
		boolean flag=true;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>ar.length/2) {
				flag=false;
				System.out.println(entry.getKey());
			}
		}
		if(flag) {
			System.out.println(-1);
		}

	}

}
