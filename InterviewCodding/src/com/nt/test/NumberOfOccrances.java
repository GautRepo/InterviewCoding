package com.nt.test;

public class NumberOfOccrances {

	public static void main(String[] args) {
		String st= "Gautam";
		int i = st.length();
		st =st.replace("a", "");
		int n = st.length();
		System.out.println(i-n);
	}

}
