package com.plus;

public class Hester extends Thread {
	
	@Override	
	public void run() {
		for (int i=1; i <=20;i++) {
			System.out.println("horse2:" +  i);
		}
		
	}

}
