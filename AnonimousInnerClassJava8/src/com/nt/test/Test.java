package com.nt.test;

public class Test {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(
						()->{
							for(int i=0;i<10;i++) {
								System.out.println("Child thread");
							}
						}
				);
		t.start();
		for(int i=0;i <10; i++) {
			System.out.println("Main thread");
		}
	}

}
