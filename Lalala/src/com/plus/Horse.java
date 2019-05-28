package com.plus;

public class Horse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hester horse = new Hester();
		horse.start();
		
		HorseRunnable hi = new HorseRunnable();
		Thread thread = new Thread(hi);
		thread.start();
		
		System.out.println("end!");
		}

	}


